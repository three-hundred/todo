package com.sixteen.todo.domain

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.FieldType
import org.springframework.data.mongodb.core.mapping.MongoId

// 고민중
// 1. UserDust 는 User 엔티티가 List<UserDust> 타입으로 가지고 있을 지
// 2. UserDust 를 User 엔티티가 가지고 있지 않고, userDustRepository.findByUserId() 로 가져올지
// 3. User 엔티티는 그저 UserDust의 id만 List<String> 으로 가지고 있을지
// 일단 다 생각해보자
@Document(collection = "user_dusts")
data class UserDust(
    @MongoId(FieldType.OBJECT_ID)
    val id: String,

    val userId: String,
    val dustId: String,
    val achievement: Map<String, String>?,    // 유저의 이먼지에 대한 해금 달성정도, 이것은 TODO
)
