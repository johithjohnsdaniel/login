package com.devjockey.retrofitloginauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginAction();
            }
        });



    }

    private void loginAction() {

        LoginRequest loginRequest=new LoginRequest("sindhyapeter@gmail.com","8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92");

        Call<LoginResponse> call=ApiClient.getUserInterface().login(loginRequest);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                if(response.isSuccessful())
                {
                    Log.e("MainActivity","resposne"+response.body());
                }
                else {
                    Log.e("MainActivity","Eroroor asdasdads");
                }


            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

                Log.e("MainActivity","Eroor");
            }
        });

    }


}