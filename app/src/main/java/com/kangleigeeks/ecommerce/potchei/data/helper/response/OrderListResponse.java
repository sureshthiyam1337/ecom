package com.kangleigeeks.ecommerce.potchei.data.helper.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kangleigeeks.ecommerce.potchei.data.helper.models.OrderModel;

import java.util.List;

public class OrderListResponse {

    @SerializedName("status_code")
    @Expose
    public int statusCode;

    @SerializedName("message")
    @Expose
    public String message;

    @SerializedName("data")
    @Expose
    public List<OrderModel> orderModels;
}
