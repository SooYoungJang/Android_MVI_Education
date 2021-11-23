package com.example.android_mvi_education

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.example.android_mvi_education.base.BaseFragment
import com.example.android_mvi_education.base.binding
import com.example.android_mvi_education.databinding.FragmentCalculatorBinding
import com.example.android_mvi_education.effect.CalculEffect
import com.example.android_mvi_education.state.CalculState
import com.example.android_mvi_education.viewmodel.CalculatorViewModel
import dagger.hilt.android.AndroidEntryPoint

class CalculatorFragment : BaseFragment<CalculState, CalculEffect, FragmentCalculatorBinding>(
    FragmentCalculatorBinding::inflate
) {
    override val viewModel: CalculatorViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.onCreate()
    }

    
    override fun renderState(state: CalculState) {
        Log.d("sdf", " akljalskdfj ${state.x}")
        Log.d("sdf", " a11111kljalskdfj ${state.y}")
    }

    override fun handleSideEffect(sideEffect: CalculEffect) = binding {
        when (sideEffect) {
            is CalculEffect.Toast -> {
                Toast.makeText(activity,"kjnknknknknk ${sideEffect.msg}",Toast.LENGTH_SHORT).show()
            }
            is CalculEffect.textMessage -> {
                textView.setText(sideEffect.msg)
            }
        }
    }


}