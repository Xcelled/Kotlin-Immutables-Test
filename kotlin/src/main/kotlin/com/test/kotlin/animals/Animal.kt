package com.test.kotlin.animals

import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, property = "type")
//@JsonSubTypes(JsonSubTypes.Type(value = Cat::class, name = "cat"), JsonSubTypes.Type(value = Dog::class, name = "dog"))
interface Animal {
    val noise: String
}
