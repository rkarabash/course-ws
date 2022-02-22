package com.example.coursews.helpers.objects

data class UserVO(
    val id: Long,
    val username: String,
    val phoneNumber: String,
    val status: String,
    val createdAt: String
)

data class UserListVO(
    val users: List<UserVO>
)