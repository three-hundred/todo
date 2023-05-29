package com.sixteen.todo.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate

data class CommonMetaData(
        val createdDate: CreatedDate,
        val updatedDate: LastModifiedDate,
        val status: String // soft delete 위함, "N" (Normal) or "D" (Deleted)
)
