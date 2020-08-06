package com.vncoder.retrofit2_manager.Retrofit

import com.vncoder.retrofit2_manager.entity.Employee
import com.vncoder.retrofit2_manager.entity.Root
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("1")
    fun getAnswers(): Call<Root>

}