package com.example.androiddevchallenge.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.shapes


@Composable
fun PuppiCardImage(
    image: Painter,
    contentDescription: String?,
) {
    Image(
        painter = image,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .clip(shape = shapes.medium),
    )
}
