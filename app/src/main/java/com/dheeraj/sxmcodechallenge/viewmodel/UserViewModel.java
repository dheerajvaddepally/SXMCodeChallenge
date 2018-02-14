package com.dheeraj.sxmcodechallenge.viewmodel;

import android.databinding.BaseObservable;

import com.dheeraj.sxmcodechallenge.R;
import com.dheeraj.sxmcodechallenge.model.User;

/**
 * Created by Dheeraj Vaddepally on 2/13/2018.
 */

public class UserViewModel extends BaseObservable{
    private String email;
    private String password;
    private String emailHint;
    private String passwordHint;

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
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.password);
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
}
