package com.example.instaresolv.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.instaresolv.ui.SplashScreen
import com.example.instaresolv.ui.WelcomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.WelcomeScreen.route) {
        composable(Screens.Splash.route) {
            SplashScreen(
                onNavigateToWelcomeScreen = {
                    navController.navigate(Screens.WelcomeScreen.route)
                },
                onNavigateToLogin = {  },
                onNavigateToHome = {  }
            )
        }

        composable(Screens.WelcomeScreen.route) {
            WelcomeScreen(
                onNavigateToLogin = {}
            )
        }
    }

}