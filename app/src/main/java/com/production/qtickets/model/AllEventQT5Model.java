package com.production.qtickets.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllEventQT5Model {

    @SerializedName("status")
    @Expose
    public String status = "";

    @SerializedName("isSuccess")
    @Expose
    public Boolean isSuccess = false;

    @SerializedName("statusCode")
    @Expose
    public String statusCode = "";

    @SerializedName("message")
    @Expose
    public String message = "";

    @SerializedName("data")
    @Expose
    public List<AllEventQT5Data> data = null;

}