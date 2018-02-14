package com.dheeraj.sxmcodechallenge;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.dheeraj.sxmcodechallenge.databinding.ActivityMainBinding;
import com.dheeraj.sxmcodechallenge.model.User;
import com.dheeraj.sxmcodechallenge.service.BaseResponse;
import com.dheeraj.sxmcodechallenge.service.ServiceResponseListener;
import com.dheeraj.sxmcodechallenge.service.WebServiceManager;
import com.dheeraj.sxmcodechallenge.viewmodel.UserViewModel;

/**
 * Created by Dheeraj Vaddepally on 2/13/2018.
 */

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private String email;
    private String password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserViewModel viewModel = new UserViewModel(new User("Email", "Password"));
        mBinding.setLogin(viewModel);
        mBinding.setLoginClick(() -> {
            email = mBinding.getLogin().getEmail();
            password = mBinding.getLogin().getPassword();
            WebServiceManager manager = new WebServiceManager();
            manager.makeWebServiceCall(email, password, new ServiceResponseListener() {
                @Override
                public void onResponse(BaseResponse response) {
                    if(response.getStatusCode()==200){
                        Toast.makeText(MainActivity.this, "Login Success!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onError() {
                }
            });
        });
    }
}
