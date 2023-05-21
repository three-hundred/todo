package com.sixteen.todo.repository

import com.sixteen.todo.domain.Dust
import org.springframework.data.mongodb.repository.MongoRepository

interface DustRepository: MongoRepository<Dust, String> {

}