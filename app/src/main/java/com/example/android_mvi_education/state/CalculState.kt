package com.example.android_mvi_education.state

import com.example.android_mvi_education.base.StateMarker

data class CalculState(
    val x : Int,
    val y : Int
) : StateMarker
