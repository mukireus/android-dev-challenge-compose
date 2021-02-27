package com.example.androiddevchallenge.ui.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppi
import com.example.androiddevchallenge.ui.theme.shapes

@Composable
fun PuppiCard(
    modifier: Modifier = Modifier,
    puppi: Puppi,
    onClick: () -> Unit,
) {
    Card(
        shape = shapes.medium,
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 5.dp,
        modifier = modifier
            .padding(12.dp)
            .clickable(onClick = onClick)
            .fillMaxWidth()
    ) {
        Box(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                val image: Painter = painterResource(id = puppi.image)
                PuppiCardImage(
                    image,
                    puppi.name,
                )
                PuppiCardInfoColumn(
                    puppi.name,
                    puppi.description,
                    puppi.gender,
                )
            }
        }
    }
}

