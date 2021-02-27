package com.example.androiddevchallenge.ui.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.androiddevchallenge.data.Puppi

@Composable
fun PuppiLazyColumn(
    puppiList: List<Puppi>,
    onClick: () -> Unit,
) {
    val scrollState = rememberLazyListState()
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        state = scrollState,
    ) {
        items(puppiList, key = { puppi -> puppi.id }) { _puppi ->
            PuppiCard(
                puppi = _puppi,
                onClick = onClick,
            )
        }
    }
}
