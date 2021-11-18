package com.example.android_mvi_education.effect

import com.example.android_mvi_education.base.SideEffectMarker

sealed class CalculEffect: SideEffectMarker {
    data class Toast(val msg: Int) : CalculEffect()
}
