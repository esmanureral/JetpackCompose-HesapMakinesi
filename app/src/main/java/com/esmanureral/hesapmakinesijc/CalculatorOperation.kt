package com.esmanureral.hesapmakinesijc

sealed class CalculatorOperation(val symbol:String) {
    object Add:CalculatorOperation("+")
    object Substract:CalculatorOperation("-")
    object Multiply:CalculatorOperation("*")
    object Divide:CalculatorOperation("/")
}