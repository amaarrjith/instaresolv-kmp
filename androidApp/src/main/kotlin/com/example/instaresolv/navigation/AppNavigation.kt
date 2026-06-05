package com.example.instaresolv.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.instaresolv.ui.LoginScreen
import com.example.instaresolv.ui.RegisterScreen
import com.example.instaresolv.ui.SplashScreen
import com.example.instaresolv.ui.WelcomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Splash.route) {
        composable(Screens.Splash.route) {
            SplashScreen(
                onNavigateToWelcomeScreen = {
                    navController.navigate(Screens.WelcomeScreen.route)
                },
                onNavigateToLogin = {
                    navController.navigate(Screens.Login.route) {
                        popUpTo(0)
                    }
                },
                onNavigateToHome = { }
            )
        }
        composable(Screens.Login.route) {
            LoginScreen(
                onLoginSuccess = { },
                navigateToRegister = {
                    navController.navigate(Screens.RegisterScreen.route)
                },
                navigateToForgetPassword = { }
            )
        }
        composable(Screens.WelcomeScreen.route) {
            WelcomeScreen(
                onNavigateToLogin = {
                    navController.navigate(Screens.Login.route)
                }
            )
        }
        composable(Screens.RegisterScreen.route) {
            RegisterScreen {
                navController.popBackStack()
            }
        }
    }
}