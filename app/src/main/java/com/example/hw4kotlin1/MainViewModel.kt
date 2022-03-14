package com.example.hw4kotlin1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var mCounter = 0
    var commands = MutableLiveData<ArrayList<String>>()
    var counter = MutableLiveData<Int>()
    var plus: String = "+"
    var minus: String = "-"

    fun incrementClick() {
        counter.value = ++mCounter

    }

    fun decrementClick() {
        counter.value = --mCounter

    }
    fun setCommands(list: ArrayList<String>){
        commands.value = list
    }
}