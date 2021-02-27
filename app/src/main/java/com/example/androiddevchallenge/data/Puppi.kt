package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Puppi(
    val id: Int,
    @DrawableRes val image: Int,
    val name: String,
    val age: Int,
    val gender: PuppiGender,
    val description: String,
)
