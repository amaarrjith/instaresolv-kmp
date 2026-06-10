package com.example.instaresolv.network

import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.ServerResponseException

suspend inline fun <reified T> safeApiCall(
    crossinline block: suspend () -> T
): ApiResult<T> {

    return try {

        ApiResult.Success(
            data = block()
        )

    } catch (e: ClientRequestException) {

        ApiResult.Error(
            message = e.message ?: "Client Error",
            code = e.response.status.value
        )

    } catch (e: ServerResponseException) {

        ApiResult.Error(
            message = e.message ?: "Server Error",
            code = e.response.status.value
        )

    } catch (e: Exception) {

        ApiResult.Error(
            message = e.message ?: "Unknown Error"
        )
    }
}