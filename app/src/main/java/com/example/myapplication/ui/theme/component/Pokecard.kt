package com.example.myapplication.ui.theme.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PokeCard() {
    Box {
        Card(
            modifier =
                Modifier
                    .width(104.dp)
                    .height(108.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
        ) {
        }

        Box(
            modifier =
                Modifier
                    .size(72.dp)
                    .align(Alignment.Center),
        ) {
            AsyncImage(
                modifier =
                    Modifier
                        .size(72.dp)
                        .align(Alignment.Center),
                model = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/132.png",
                contentDescription = "",
            )
        }

        Card(
            modifier =
                Modifier
                    .width(104.dp)
                    .height(44.dp)
                    .align(Alignment.BottomCenter)
                    .alpha(0.2f),
            colors = CardDefaults.cardColors(containerColor = Color.Gray),
        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "Charizard", fontSize = 10.sp)
            }
        }
    }
}
