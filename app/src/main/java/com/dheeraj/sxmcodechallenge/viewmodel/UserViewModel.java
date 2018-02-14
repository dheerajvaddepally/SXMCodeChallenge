package com.dheeraj.sxmcodechallenge.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.dheeraj.sxmcodechallenge.BR;
import com.dheeraj.sxmcodechallenge.R;
import com.dheeraj.sxmcodechallenge.Utils;
import com.dheeraj.sxmcodechallenge.model.User;

/**
 * Created by Dheeraj Vaddepally on 2/13/2018.
 */

public class UserViewModel extends BaseObservable{
    private String email;
    private String password;
    private String emailHint;
    private String passwordHint;
    private String emailError;
    private String passwordError;

    public UserViewModel(User user) {
       this.emailHint = user.emailHint;
       this.passwordHint = user.passwordHint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.email_address);
        notifyPropertyChanged(BR.emailError);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.password);
        notifyPropertyChanged(BR.passwordError);
    }

    public String getEmailHint() {
        return emailHint;
    }

    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    @Bindable
    public String getEmailError() {
        if(email == null){
            return "Please enter your email address.";
        } else if(!Utils.isEmailValid(email)) {
            return "Please enter a valid email address.";
        } else {
            return null;
        }
    }

    public void setEmailError(String emailError) {
        this.emailError = emailError;
    }

    @Bindable
    public String getPasswordError() {
        if(password == null){
            return "Please enter your password.";
        } else if(!Utils.isPasswordValid(password)) {
            return "Please enter a valid password.";
        } else {
            return null;
        }
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

}
