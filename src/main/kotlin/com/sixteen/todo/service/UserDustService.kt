package com.sixteen.todo.service

import com.sixteen.todo.domain.UserDust

interface UserDustService {
    fun save(userDust: UserDust): UserDust

    fun findAllByUserId(userId: String): List<UserDust>   // UserDust를 User가 갖고있다면 필요없어짐

    fun deleteById(id: String)

    fun update(userDust: UserDust): UserDust?
}