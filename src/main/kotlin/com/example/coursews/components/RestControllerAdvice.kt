package com.example.coursews.components

import com.example.coursews.constants.ErrorResponse
import com.example.coursews.constants.ResponseConstants
import com.example.coursews.exceptions.UserDeactivatedException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class RestControllerAdvice {
    @ExceptionHandler(UserDeactivatedException::class)
    fun userDeactivated(userDeactivatedException:
                        UserDeactivatedException):
            ResponseEntity<ErrorResponse> {
        val res = ErrorResponse(
            ResponseConstants.ACCOUNT_DEACTIVATED
            .value, userDeactivatedException.message)
        // Return an HTTP 403 unauthorized error response
        return ResponseEntity(res, HttpStatus.UNAUTHORIZED)
    }
}
