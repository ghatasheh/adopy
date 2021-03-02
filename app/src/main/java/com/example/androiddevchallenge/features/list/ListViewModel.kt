package com.example.androiddevchallenge.features.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.features.list.data.Dog
import com.example.androiddevchallenge.features.list.data.dogsList
import java.lang.IllegalArgumentException

class ListViewModel: ViewModel() {
    private val _dogs = MutableLiveData<List<Dog>>()

    val dogs: LiveData<List<Dog>> = _dogs
    init {
        _dogs.value = dogsList
    }

    fun find(name: String?): Dog {
        return dogsList.find { it.name == name } ?: throw IllegalArgumentException("$name not found!")
    }
}