package com.vncoder.retrofit2_manager.entity

import com.google.gson.annotations.SerializedName

class Root {
    @SerializedName("status")
    var status: String? = null
    @SerializedName("data")
    var data: List<Employee>? = null
    @SerializedName("message")
    var message: String? = null
}