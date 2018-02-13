package com.dheeraj.sxmcodechallenge;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dheeraj.sxmcodechallenge.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
    private ActivitySplashBinding mBinding;
    private static int TIME_OUT = 3000;
    private static boolean splashLoaded = false;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        loadMainActivity();
    }

    private void loadMainActivity() {
        if (!splashLoaded) {
            setContentView(R.layout.activity_splash);
            mHandler.postDelayed(() -> {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }, TIME_OUT);
            splashLoaded = true;
        } else {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
