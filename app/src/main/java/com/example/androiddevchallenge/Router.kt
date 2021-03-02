package com.example.androiddevchallenge

sealed class Router(val title: String) {
    object HomePage : Router("HomeScreen")
    object DetailPage : Router("DetailScreen")
}