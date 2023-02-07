package com;

public class Cat extends Animal {
    private static int catCounter;

    public Cat(String name) {
        super(name);
        catCounter++;
    }

    public static void getCounter() {
        System.out.println(catCounter + " котов создано.");
    }


    @Override
    public void run(int lengthOfObstacle) {
        if (lengthOfObstacle < 0 || lengthOfObstacle > 200) {
            System.out.println("Дистанция пробега котов от 0 до 200!");
        } else {
            System.out.println(name + " пробежал " + lengthOfObstacle + " м.");
        }
    }

    @Override
    public void swim(int lengthOfObstacle) {
        System.out.println("коты не умеют плавать!");
    }
}
