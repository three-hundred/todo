package com.sixteen.todo.repository

import com.sixteen.todo.domain.TodoContent
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : MongoRepository<TodoContent, String> {
}