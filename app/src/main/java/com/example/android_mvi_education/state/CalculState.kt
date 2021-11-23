package com.example.android_mvi_education.state

import com.example.android_mvi_education.base.StateMarker

data class CalculState(
    var x : Int = 0,
    var y : Int = 0
) : StateMarker
