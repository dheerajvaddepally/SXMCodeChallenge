package com.dheeraj.sxmcodechallenge.model;

/**
 * Created by Dheeraj Vaddepally on 2/13/2018.
 */

public class User {
    private String email;
    private String password;
    public String emailHint;
    public String passwordHint;


    public User(){
    }

    public User(String emailHint, String passwordHint) {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }
}
