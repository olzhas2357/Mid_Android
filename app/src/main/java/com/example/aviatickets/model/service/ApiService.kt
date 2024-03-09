package com.example.aviatickets.model.service

import com.example.aviatickets.model.entity.Offer
import com.example.aviatickets.model.network.ApiClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET

interface ApiService {
    @GET("offer_list")
    fun getOffers(): Call<List<Offer>>


}