package com.example.android_mvi_education.base

import androidx.lifecycle.ViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost

abstract class BaseViewModel<STATE : StateMarker, SIDE_EFFECT : SideEffectMarker> :
    ContainerHost<STATE, SIDE_EFFECT>,
    ViewModel() {

    abstract override val container: Container<STATE, SIDE_EFFECT>
}