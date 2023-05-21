package com.sixteen.todo.service

import com.sixteen.todo.domain.Dust
import com.sixteen.todo.domain.DustType
import com.sixteen.todo.repository.DustRepository
import io.mockk.every

import io.mockk.mockk
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.util.*

internal class DustServiceImplTest {

    private val mockDustRepository = mockk<DustRepository>()
    private val dustService = DustServiceImpl(mockDustRepository)

    @Test
    fun `find by id`() {
        val dust = Dust(id = "testId", dustType = DustType.QUEST_DUST)
        every { mockDustRepository.findById(any()) } returns Optional.of(dust)

        val result = dustService.findByIdOrNull("testId")

        assertEquals(dust, result)
    }

    @Test
    fun `test update non-existing dust`() {
        every { mockDustRepository.existsById(any()) } returns false
        val dust = Dust(id = "testId", dustType = DustType.QUEST_DUST)

        val result = dustService.update(dust)

        assertEquals(result, null)
    }
}