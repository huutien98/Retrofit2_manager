package com.vncoder.retrofit2_manager.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object{
        val BASE_URL = "http://dummy.restapiexample.com/api/v1/employee/"

        fun getClient() : Retrofit {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit
        }

    }
}