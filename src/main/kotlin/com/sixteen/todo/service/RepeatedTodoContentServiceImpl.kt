package com.sixteen.todo.service

interface RepeatedTodoContentServiceImpl {

    fun addRepeatedTodoContent(repeatedTodoContent: RepeatedTodoContent): RepeatedTodoContent

    fun updateRepeatedTodoContent(repeatedTodoContent: RepeatedTodoContent): RepeatedTodoContent?

    fun deleteById(id: String): RepeatedTodoContent?

    fun modifyRepeatedTodoContentSortOrder(id: String, sortOrder: Int): RepeatedTodoContent?

    fun modifyRepeatedTodoContentsSortOrder(repeatedTodoContentIdWithSortOrder: Map<String, Int>): Int

}
