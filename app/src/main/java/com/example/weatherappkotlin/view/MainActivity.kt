package com.example.weatherappkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherappkotlin.R
import com.example.weatherappkotlin.databinding.MainActivityBinding
import com.example.weatherappkotlin.view.main.MainFragment


class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}