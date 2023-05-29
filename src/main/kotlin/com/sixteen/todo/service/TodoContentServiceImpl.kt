package com.sixteen.todo.service

import com.sixteen.todo.domain.TodoContent

interface TodoContentService {
    fun addTodoContent(todoContent: TodoContent): TodoContent

    fun updateTodoContent(todoContent: TodoContent): TodoContent?

    fun deleteById(id: String): TodoContent?

    /**
     * 모두 updateTodoContent로 순서를 바꿔도 되지만, 순서바꾸기 위해 Todo 전부 보내는건 안좋다.
     * id와 sortOrder만으로 변경하게 한다.
     */
    fun modifyTodoContentSortOrder(id: String, sortOrder: Int): TodoContent?


    /**
     * 다수 TodoContent의 순서를 바꾸기 위함
     */
    fun modifyTodoContentsSortOrder(todoContentIdWithSortOrder: Map<String, Int>): Int
}