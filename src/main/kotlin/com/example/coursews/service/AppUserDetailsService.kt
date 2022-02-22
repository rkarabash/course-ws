package com.example.coursews.service

import com.example.coursews.repositories.UserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Component
import java.util.ArrayList
@Component
class AppUserDetailsService(val userRepository: UserRepository) :
    UserDetailsService {
    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String): UserDetails {
        val user = userRepository.findByUsername(username) ?:
        throw UsernameNotFoundException("A user with the username $username doesn't exist")
            return User(user.username, user.password,
                ArrayList())
    }
}
