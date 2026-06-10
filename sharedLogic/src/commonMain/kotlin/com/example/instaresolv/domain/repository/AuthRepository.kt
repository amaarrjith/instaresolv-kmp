package com.example.instaresolv.domain.repository

import com.example.instaresolv.data.model.LoginResponse
import com.example.instaresolv.network.ApiResult

interface AuthRepository {

    suspend fun login(
        email: String,
        password: String
    ): ApiResult<LoginResponse>
}
