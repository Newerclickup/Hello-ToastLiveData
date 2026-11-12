package com.example.hellotoast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    // Membuat LiveData bertipe Integer untuk menyimpan angka Count
    val currentName: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}