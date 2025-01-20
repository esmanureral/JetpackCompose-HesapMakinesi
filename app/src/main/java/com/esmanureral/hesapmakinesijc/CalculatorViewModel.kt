package com.esmanureral.hesapmakinesijc

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/*
Hesap makinesinin mevcut durumunu (state) depolar.
Kullanıcı etkileşimleri sonucu state güncellendiğinde, Compose arayüzünün otomatik olarak yeniden oluşturulmasını sağlar.

 */
class CalculatorViewModel:ViewModel(){
    var state by mutableStateOf(CalculatorState())
        private set
}