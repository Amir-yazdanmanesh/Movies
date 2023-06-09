package com.test.core.base

interface Reducer<STATE : State, ACTION : Action> {

    fun reduce(currentState: STATE, action: ACTION): STATE
}
