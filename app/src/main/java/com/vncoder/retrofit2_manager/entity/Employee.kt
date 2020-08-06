package com.vncoder.retrofit2_manager.entity

import com.google.gson.annotations.SerializedName

class Employee {
    @SerializedName("employee_name")
    var name: String? = null
    @SerializedName("employee_salary")
    var salary = 0
    @SerializedName("employee_age")
    var age = 0
    @SerializedName("profile_image")
    var image: String? = null
}


