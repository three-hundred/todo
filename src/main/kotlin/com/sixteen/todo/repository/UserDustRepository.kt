package com.sixteen.todo.repository

import com.sixteen.todo.domain.UserDust
import org.springframework.data.mongodb.repository.MongoRepository

interface UserDustRepository: MongoRepository<UserDust, String> {
    fun findAllByUserId(userId: String): List<UserDust>
}