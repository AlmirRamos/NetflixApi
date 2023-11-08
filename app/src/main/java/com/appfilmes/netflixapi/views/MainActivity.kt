package com.appfilmes.netflixapi.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appfilmes.netflixapi.api.RetrofitService
import com.appfilmes.netflixapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "info_filme"
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val filmeAPI by lazy {
        RetrofitService.filmeAPI
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}