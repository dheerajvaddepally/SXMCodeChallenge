package com.dheeraj.sxmcodechallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dheeraj Vaddepally on 2/13/2018.
 */

public final class Utils {

    private Utils(){
    }

    public static boolean isEmailValid(String email) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isPasswordValid(String password){
        return password.isEmpty() ? false : true;
    }
}
