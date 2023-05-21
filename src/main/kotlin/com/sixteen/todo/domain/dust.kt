package com.sixteen.todo.domain

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.FieldType
import org.springframework.data.mongodb.core.mapping.MongoId

@Document(collection = "dusts")
data class Dust(

    @MongoId(FieldType.OBJECT_ID)
    val id: String,
    val name: String = "",
    val ownerPercent: Double? = null,
    val dustImage: DustImageLink? = null,
    val dustType: DustType? = null,
    val createCondition: CreateCondition? = null,   // 먼지 생성 조건
    val openCondition: OpenCondition? = null,

) {

}

data class DustImageLink(
    val representativeImageLink: String,
    val memorialImageLinkList: List<String>
)

data class CreateCondition(
    val condition: String? = null,
)

data class OpenCondition(
    val openConditionList: List<String>? = null,
)

enum class DustType {
    QUEST_DUST,
    RANDOM_DUST,
    SPECIAL_DUST,
    // ...
}