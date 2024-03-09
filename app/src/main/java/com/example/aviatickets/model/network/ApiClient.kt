package com.example.aviatickets.model.network

import com.example.aviatickets.model.service.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://my-json-server.typicode.com/estharossa/fake-api-demo/offer_list")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val instance = retrofit.create(ApiService::class.java)

    fun getClient(): Retrofit {
        return retrofit
    }

}