package com.example.coursews.exceptions

class UsernameUnavailableException(override val message: String) :
    RuntimeException()

class InvalidUserIdException(override val message: String) :
    RuntimeException()

class UserDeactivatedException(override val message: String) :
    RuntimeException()

class UserStatusEmptyException(override val message: String = "A user' status cannot be empty") : RuntimeException()