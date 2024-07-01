package com.production.qtickets.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserINfo {
    @SerializedName("data")
    @Expose
    public Data data;
    @SerializedName("isSuccess")
    @Expose
    public Boolean isSuccess;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("statusCode")
    @Expose
    public Integer statusCode;
    @SerializedName("message")
    @Expose
    public String message;

    public class Data {

        @SerializedName("userId")
        @Expose
        public Integer userId;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("email")
        @Expose
        public String email;
        @SerializedName("mobile")
        @Expose
        public String mobile;
        @SerializedName("dialCode")
        @Expose
        public String dialCode;
        @SerializedName("nationality")
        @Expose
        public String nationality;
        @SerializedName("gender")
        @Expose
        public String gender;
        @SerializedName("dob")
        @Expose
        public String dob;
        @SerializedName("password")
        @Expose
        public Object password;
        @SerializedName("confirmPassword")
        @Expose
        public Object confirmPassword;
        @SerializedName("registrationIpAddress")
        @Expose
        public Object registrationIpAddress;
        @SerializedName("iso2")
        @Expose
        public String iso2;

    }

}
