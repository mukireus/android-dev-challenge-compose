package com.example.androiddevchallenge.ui.home.puppi

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.Puppi
import com.example.androiddevchallenge.ui.home.components.PuppiAppBar
import com.example.androiddevchallenge.ui.home.components.PuppiLazyColumn
import com.example.androiddevchallenge.ui.theme.MyTheme

// Start building your app here!
@Composable
fun PuppiApp() {
    Surface(Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        PuppiBody(modifier = Modifier.fillMaxSize())
    }
}

@Composable
fun PuppiBody(
    modifier: Modifier = Modifier,
    puppiViewModel: PuppiViewModel = PuppiViewModel()
) {
    val puppiList: State<List<Puppi>> = puppiViewModel.puppiList.observeAsState(emptyList())
    Column(modifier = modifier) {
        PuppiAppBar(
            modifier = Modifier.fillMaxWidth(),
            title = "PUPPI"
        )

        PuppiLazyColumn(
            puppiList = puppiList.value,
            onClick = {},
        )
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        PuppiApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        PuppiApp()
    }
}
