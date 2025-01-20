package com.esmanureral.hesapmakinesijc

sealed class CalculatorActions {
    data class Number(val number:Int):CalculatorActions()//bir sayı girildiğinde
    object Clear:CalculatorActions()
    object Delete:CalculatorActions()
    object Decimal:CalculatorActions()
    object Calculate:CalculatorActions()// "=" tuşuna basıldıgında
    data class Operation(val operation: CalculatorOperation):CalculatorActions()


}