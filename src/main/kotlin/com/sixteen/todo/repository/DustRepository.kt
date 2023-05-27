package com.sixteen.todo.repository

import com.sixteen.todo.domain.Dust
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface DustRepository: MongoRepository<Dust, String> {

    // 혹시나 projection 이 유리할 수 있을까 하나 예시로 만들어봄
    @Query(value = "{ '_id': ?0 }", fields = "{ 'dustImage.representativeImageUrl' : 1 }")
    fun findDustImageUrlById(id: String): String?
}