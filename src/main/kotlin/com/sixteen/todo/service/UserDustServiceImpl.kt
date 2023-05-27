package com.sixteen.todo.service

import com.sixteen.todo.domain.Dust
import com.sixteen.todo.domain.UserDust
import com.sixteen.todo.repository.UserDustRepository
import org.springframework.stereotype.Service
import java.sql.DriverManager

@Service
class UserDustServiceImpl(
    private val userDustRepository: UserDustRepository
): UserDustService {
    override fun save(userDust: UserDust): UserDust = userDustRepository.save(userDust)

    override fun update(userDust: UserDust): UserDust? {
        if (!userDustRepository.existsById(userDust.id)) {
            DriverManager.println("Error: 존재하지 않는 유저먼지에 대한 update")
            return null
        }
        return userDustRepository.save(userDust)
    }

    override fun findAllByUserId(userId: String): List<UserDust> = userDustRepository.findAllByUserId(userId)

    override fun deleteById(id: String) = userDustRepository.deleteById(id)
}