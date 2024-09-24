package com.example.recinrecview.api

import com.example.recinrecview.model.GOTQuoteResponse
import retrofit2.http.GET

interface NetworkService {

    @GET("v1/houses")
    suspend fun getQuotes(): GOTQuoteResponse

}