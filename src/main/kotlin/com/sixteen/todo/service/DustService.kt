package com.sixteen.todo.service

import com.sixteen.todo.domain.Dust

interface DustService {
    fun save(dust: Dust): Dust

    fun findAll(): List<Dust>

    fun findByIdOrNull(id: String): Dust?

    fun deleteById(id: String)

    fun update(dust: Dust): Dust?
}