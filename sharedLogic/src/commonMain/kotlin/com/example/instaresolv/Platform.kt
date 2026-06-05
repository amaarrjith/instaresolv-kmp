package com.example.instaresolv

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform