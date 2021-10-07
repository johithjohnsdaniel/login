package com.devjockey.retrofitloginauth;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

public class ApiClient {





    public static Retrofit getRetrofit(){
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient =new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit=new Retrofit.Builder().
                addConverterFactory(GsonConverterFactory.create()).
                baseUrl("https://ci-api.appmastery.co").
                client(okHttpClient).
                build();

        return  retrofit;


    }

    public  static  UserInterface getUserInterface()
    {

        UserInterface userInterface=getRetrofit().create(UserInterface.class);
        return userInterface;


    }



}
