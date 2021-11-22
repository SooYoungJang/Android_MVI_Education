package com.example.android_mvi_education.viewmodel

import com.example.android_mvi_education.base.BaseViewModel
import com.example.android_mvi_education.effect.CalculEffect
import com.example.android_mvi_education.state.CalculState
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container

class CalculatorViewModel : BaseViewModel<CalculState, CalculEffect>() {


    override val container =
        container<CalculState, CalculEffect>(CalculState(2,3)) {
            onCreate()
        }


    private fun onCreate() = intent {
        val multiple = state.x.times(5)
        reduce { state.copy(x = multiple) }
        postSideEffect(CalculEffect.Toast("hihihi"))
        postSideEffect(CalculEffect.textMessage("123412341111"))
    }
    
}