package com.dheeraj.sxmcodechallenge.service;

/**
 * Created by Dheeraj Vaddepally on 2/13/2018.
 */

public class BaseResponse {
    private int statusCode;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
