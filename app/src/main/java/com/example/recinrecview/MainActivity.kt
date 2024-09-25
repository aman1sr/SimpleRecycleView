package com.example.recinrecview

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.recinrecview.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
const val TAG = "Quote_d"
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: QuoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this,QuoteViewModelFactory(QuoteRepository())).get(QuoteViewModel::class.java)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    observeQuoteData()

    }

    private fun observeQuoteData() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                viewModel.data.collect{quote ->
                    Log.d(TAG, "observeQuoteData: ${quote}")
                    Toast.makeText(this@MainActivity, "Data Fetch : ${quote?.size}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}