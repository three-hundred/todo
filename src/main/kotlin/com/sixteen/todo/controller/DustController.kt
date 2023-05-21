package com.sixteen.todo.controller

import com.sixteen.todo.domain.Dust
import com.sixteen.todo.service.DustService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/dusts")
class DustController(
    private val dustService: DustService
) {
    //TODO Dust -> DustDTO 로 수정
    @GetMapping("/list")
    fun getAllDusts(): ResponseEntity<List<Dust>> {
        val dusts = dustService.findAll()
        return ResponseEntity.ok(dusts)
    }

    @GetMapping("/{id}")
    fun getDustById(@PathVariable id: String): ResponseEntity<Dust> {
        return dustService.findByIdOrNull(id)?.let {
            ResponseEntity.ok(it)
        } ?: ResponseEntity.notFound().build()
    }

    @PostMapping
    fun createDust(@RequestBody dust: Dust): ResponseEntity<Dust> {
        val savedDust = dustService.save(dust)
        return ResponseEntity.ok(savedDust)
    }

    @PutMapping("/{id}")
    fun updateDust(@RequestBody dust: Dust): ResponseEntity<Dust> {
        val updatedDust = dustService.update(dust)
        return ResponseEntity.ok(updatedDust)
    }

    @DeleteMapping("/{id}")
    fun deleteDust(@PathVariable id: String): ResponseEntity<Void> {
        dustService.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}