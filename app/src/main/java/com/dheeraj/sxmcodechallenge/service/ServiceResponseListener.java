package com.dheeraj.sxmcodechallenge.service;

/**
 * Created by Dheeraj Vaddepally on 2/13/2018.
 */

public interface ServiceResponseListener {
    public void onResponse(BaseResponse response);
    public void onError();
}
