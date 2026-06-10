package com.example.instaresolv.data.remote.api

import com.example.instaresolv.data.model.LoginRequest
import com.example.instaresolv.data.model.LoginResponse
import com.example.instaresolv.network.ApiResult

interface AuthApiService {

    suspend fun login(
        request: LoginRequest
    ): ApiResult<LoginResponse>
}
