package com.appfilmes.netflixapi.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appfilmes.netflixapi.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityDetalhesBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}