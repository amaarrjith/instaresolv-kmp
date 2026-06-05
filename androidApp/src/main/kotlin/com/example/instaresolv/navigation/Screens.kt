package com.example.instaresolv.navigation

sealed class Screens(val route: String) {
    object Splash : Screens("splash")
}