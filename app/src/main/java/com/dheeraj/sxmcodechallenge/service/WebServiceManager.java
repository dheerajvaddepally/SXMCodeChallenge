package com.dheeraj.sxmcodechallenge.service;

/**
 * Created by Dheeraj Vaddepally on 2/13/2018.
 */

public class WebServiceManager {
    public void makeWebServiceCall(String email, String password, ServiceResponseListener listener) {
        SignInRequest request = new SignInRequest();
        request.setEmail(email);
        request.setPassword(password);
        BaseResponse loginResponse = getLoginResponseStub(email, password);

        if (loginResponse != null) {
            listener.onResponse(loginResponse);
        } else {
            listener.onError();
        }
    }

    public static BaseResponse getLoginResponseStub(String email, String password) {
        // TODO: Make API Call
        try {
            Thread.sleep(1500);
            String expectedEmail = "dheeraj@gmail.com";
            String expectedPassword = "Welcome123";

            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setStatusCode((expectedEmail.equals(email) && expectedPassword.equals(password) ? 200 : 400));

            return baseResponse;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
