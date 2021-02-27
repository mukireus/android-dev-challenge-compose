/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.home.puppi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
