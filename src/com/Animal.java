package com;

public abstract class Animal {
    protected String name;
    private static int animalCounter;

    public Animal(String name) {
        this.name = name;
        animalCounter++;
    }


    public static void getCounter() {
        System.out.println(animalCounter + " животных создано.");
    }
    public abstract void run(int lengthOfObstacle);
    public abstract void swim(int lengthOfObstacle);
}
