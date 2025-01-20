package com.esmanureral.hesapmakinesijc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Calculator(
    state: CalculatorState,//hesap makinenin mecvut durumu tutulur.Ekrandaki sayı,işlemler..
    buttonSpacing: Dp =8.dp,
    modifier: Modifier=Modifier
){
    Box(modifier=modifier){
        Column(
            modifier=Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter),//Column'un Box içinde alt merkeze hizalanmasını sağlar
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {  }
    }

}