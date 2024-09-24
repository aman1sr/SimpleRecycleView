package com.example.recinrecview

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.recinrecview.model.GOTQuoteResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class QuoteViewModel(private val repository: QuoteRepository) : ViewModel() {
  private val _data  = MutableStateFlow<GOTQuoteResponse?>(null)
    val data : StateFlow<GOTQuoteResponse?> = _data

    init {
        fetchQuotes()
    }

    private fun fetchQuotes() {
    viewModelScope.launch {
      repository.getQuoteList().collect { quoteList ->
        _data.value = quoteList
      }
    }
    }

}
class QuoteViewModelFactory(
  private val repository: QuoteRepository
): ViewModelProvider.Factory{

  override fun <T : ViewModel> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(QuoteViewModel::class.java)) {
      return QuoteViewModel(repository) as T
    }
    throw IllegalArgumentException("Unknown ViewModel class")
  }
}