package com.esmanureral.hesapmakinesijc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorActions) -> Unit
) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            // Ekrandaki hesaplama metni
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )

            // Satır 1
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(colorResource(R.color.LightGray))
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = { onAction(CalculatorActions.Clear) }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(colorResource(R.color.LightGray))
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Delete) }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(colorResource(R.color.Orange))
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Operation(CalculatorOperation.Divide)) }
                )
            }

            // Satır 2
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                listOf("7" to 7, "8" to 8, "9" to 9).forEach { (symbol, number) ->
                    CalculatorButton(
                        symbol = symbol,
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = { onAction(CalculatorActions.Number(number)) }
                    )
                }
                CalculatorButton(
                    symbol = "*",
                    modifier = Modifier
                        .background(colorResource(R.color.Orange))
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Operation(CalculatorOperation.Multiply)) }
                )
            }

            // Satır 3
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                listOf("4" to 4, "5" to 5, "6" to 6).forEach { (symbol, number) ->
                    CalculatorButton(
                        symbol = symbol,
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = { onAction(CalculatorActions.Number(number)) }
                    )
                }
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(colorResource(R.color.Orange))
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Operation(CalculatorOperation.Substract)) }
                )
            }

            // Satır 4
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                listOf("1" to 1, "2" to 2, "3" to 3).forEach { (symbol, number) ->
                    CalculatorButton(
                        symbol = symbol,
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = { onAction(CalculatorActions.Number(number)) }
                    )
                }
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(colorResource(R.color.Orange))
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Operation(CalculatorOperation.Add)) }
                )
            }

            // Satır 5
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = { onAction(CalculatorActions.Number(0)) }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Decimal) }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(colorResource(R.color.Orange))
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Calculate) }
                )
            }
        }
    }
}
