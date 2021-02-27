package com.example.androiddevchallenge.ui.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Female
import androidx.compose.material.icons.rounded.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PuppiGender
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun PuppiCardInfoColumn(
    puppiName: String,
    description: String,
    puppiGender: PuppiGender,
) {
    Column(modifier = Modifier.padding(start = 12.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            PuppiCardInfoGender(puppiGender)
            PuppiCardInfoName(puppiName)
        }
        PuppiCardInfoDescription(description)
    }
}


@Composable
fun PuppiCardInfoName(puppiName: String) {
    Text(
        puppiName,
        style = typography.h6,
    )
}


@Composable
fun PuppiCardInfoDescription(puppiDescription: String) {
    Text(
        puppiDescription,
        style = typography.body2,
        maxLines = 4,
    )
}

@Composable
fun PuppiCardInfoGender(puppiGender: PuppiGender) {
    when (PuppiGender.Female) {
        puppiGender -> Icon(Icons.Rounded.Female, "female")
        else -> Icon(Icons.Rounded.Male, "male")
    }
}

@Preview
@Composable
fun PuppiCardInfoColumnPreview() {
    MyTheme {
        PuppiCardInfoColumn(
            "Lexi",
            "Description Preview",
            PuppiGender.Female,
        )
    }
}

