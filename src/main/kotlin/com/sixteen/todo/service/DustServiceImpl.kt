package com.sixteen.todo.service

import com.sixteen.todo.domain.Dust
import com.sixteen.todo.repository.DustRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.sql.DriverManager.println

@Service
class DustServiceImpl(
    private val dustRepository: DustRepository
): DustService {
    override fun save(dust: Dust): Dust = dustRepository.save(dust)

    override fun findAll(): List<Dust> = dustRepository.findAll()

    override fun findByIdOrNull(id: String): Dust? = dustRepository.findByIdOrNull(id)

    override fun deleteById(id: String) = dustRepository.deleteById(id)

    override fun update(dust: Dust): Dust? {
        if (!dustRepository.existsById(dust.id)) {
            println("Error: 존재하지 않는 먼지에 대한 update")
            return null
        }
        return dustRepository.save(dust)
    }

    override fun findRepresentativeImageUrlByIdOrNull(id: String): String? = dustRepository.findDustImageUrlById(id)


}