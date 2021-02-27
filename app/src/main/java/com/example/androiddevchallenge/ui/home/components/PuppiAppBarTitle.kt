package com.example.androiddevchallenge.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.theme.MyTheme


@Composable
fun PuppiAppBarTitle(
    title: String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = title,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
        )
    }
}

@Preview
@Composable
fun PuppiAppBarTitlePreview() {
    MyTheme {
        PuppiAppBarTitle(title = "Preview")
    }
}

@Preview
@Composable
fun PuppiAppBarTitlePreviewDark() {
    MyTheme(darkTheme = true) {
        PuppiAppBarTitle(title = "Preview")
    }
}