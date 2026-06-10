package com.example.instaresolv.data.remote.api

import com.example.instaresolv.data.model.LoginRequest
import com.example.instaresolv.data.model.LoginResponse
import com.example.instaresolv.network.ApiResult
import com.example.instaresolv.network.postBody
import com.example.instaresolv.network.safeApiCall
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType

class AuthApiServiceImpl(
    private val httpClient: HttpClient
) : AuthApiService {
    override suspend fun login(
        request: LoginRequest
    ): ApiResult<LoginResponse> {

        return safeApiCall {

            httpClient.postBody(
                url = "user/login",
                body = request
            )

        }
    }

}
