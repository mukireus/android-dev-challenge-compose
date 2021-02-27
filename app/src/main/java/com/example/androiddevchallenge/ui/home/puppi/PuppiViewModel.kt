package com.example.androiddevchallenge.ui.home.puppi

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Puppi
import com.example.androiddevchallenge.data.puppiSampleList

class PuppiViewModel : ViewModel() {
    private val _puppiList = MutableLiveData(puppiSampleList)
    val puppiList: LiveData<List<Puppi>> = _puppiList
}
