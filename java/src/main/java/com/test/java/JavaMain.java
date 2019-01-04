package com.test.java;

import com.test.java.animals.Ball;
import com.test.java.animals.Cat;
import com.test.java.animals.Dog;

public class JavaMain {
    public static void main(String[] args) {
        Cat fluffy = Cat.builder()
                .setLikesMilk(true)
                .build();

        Ball redBall = Ball.builder()
                .setColor("red")
                .build();

        Dog fido = Dog.builder()
                .addBalls(redBall)
                .build();

        System.out.println("Cat: " + fluffy);
        System.out.println("Dog: " + fido);
    }
}
