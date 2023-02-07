package com;

public class Dog extends Animal {
    private static int dogCounter;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    public static void getCounter() {
        System.out.println(dogCounter + " собак создано");
    }

    @Override
    public void run(int lengthOfObstacle) {
        if (lengthOfObstacle < 0 || lengthOfObstacle > 500) {
            System.out.println("Дистанция пробега собак от 0 до 500!");
        } else {
            System.out.println(name + " пробежала " + lengthOfObstacle + " м.");
        }
    }

    @Override
    public void swim(int lengthOfObstacle) {
        if (lengthOfObstacle < 0 || lengthOfObstacle > 10) {
            System.out.println("Дистанция проплыва собак от 0 до 10!");
        } else {
            System.out.println(name + " проплыла " + lengthOfObstacle + " м.");
        }
    }
}