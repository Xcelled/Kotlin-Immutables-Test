package com.test.kotlin

import com.test.kotlin.animals.Ball
import com.test.kotlin.animals.Cat
import com.test.kotlin.animals.Dog

object KotlinMain {
    @JvmStatic
    fun main(args: Array<String>) {
        val fluffy = Cat.builder()
                .setLikesMilk(true)
                .build()

        val redBall = Ball.builder()
                .setColor("red")
                .build()

        val fido = Dog.builder()
                .addBalls(redBall)
                .build()

        println("Cat: $fluffy")
        println("Dog: $fido")
    }
}
