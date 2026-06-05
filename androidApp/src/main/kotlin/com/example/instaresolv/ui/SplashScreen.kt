package com.example.instaresolv.ui

import android.window.SplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun SplashScreen(
    onNavigateToLogin: () -> Unit,
    onNavigateToHome: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFD42027),
                        Color(0xFFFCB922)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(1000f, 500f)
                )
            ),
        contentAlignment = Alignment.Center
    ) {

    }
}

@Composable
fun SplashScreenContent() {
    Column() {

    }
}