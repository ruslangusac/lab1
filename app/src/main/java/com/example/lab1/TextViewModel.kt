package com.example.lab1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    private var _text = MutableLiveData<String>()
    val text: LiveData<String> get() = _text
    fun changeText(newText: String) {
        _text.value = newText
    }
}