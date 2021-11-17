package com.example.android_mvi_education

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.android_mvi_education.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {
    val viewModel : CalculatorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}