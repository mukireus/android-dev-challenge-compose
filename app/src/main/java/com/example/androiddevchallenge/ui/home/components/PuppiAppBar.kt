package com.example.androiddevchallenge.ui.home.components

import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppiAppBar(
    modifier: Modifier = Modifier,
    title: String,
) {
    TopAppBar(
        modifier = modifier,
        elevation = 0.dp,
        title = { PuppiAppBarTitle(title = title) }
    )
}

@Preview
@Composable
fun PuppiAppBarPreview() {
    MyTheme {
        PuppiAppBar(title = "Preview")
    }
}

@Preview
@Composable
fun PuppiAppBarPreviewDark() {
    MyTheme(darkTheme = true) {
        PuppiAppBar(title = "Preview")
    }
}