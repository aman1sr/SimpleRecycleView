package com.example.recinrecview

import com.example.recinrecview.api.ApiClient
import com.example.recinrecview.model.GOTQuoteResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class QuoteRepository {
    private val networkService = ApiClient.networkService

    suspend fun getQuoteList(): Flow<GOTQuoteResponse?> = flow {
        try {
            val response = networkService.getQuotes()
            emit(response)
        } catch (e: Exception) {
            // Handle error here if necessary, or emit a failure state
            emit(null) // or emit a specific error object if applicable
        }
    }
}