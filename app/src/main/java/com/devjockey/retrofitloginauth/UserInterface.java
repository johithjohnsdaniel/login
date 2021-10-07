package com.devjockey.retrofitloginauth;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UserInterface {

    @Headers({
            "Accept: application/json",
            "CUSTOMERID: 5d52cd3f8c31223a0ea27d98"

    })
    @POST("/api/v1/apps/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);

}
