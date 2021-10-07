package com.devjockey.retrofitloginauth;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Result;

public class LoginResponse {

   @SerializedName("name")
   public String name;

   public LoginResponse(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "LoginResponse{" +
              "name='" + name + '\'' +
              '}';
   }
}
