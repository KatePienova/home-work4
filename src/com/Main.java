package com;

public class Main {

    public static void main(String[] args) {
        Animal catLusia = new Cat("Lusia");
        Animal catWhity = new Cat("Whity");
        Animal catRoni = new Cat("Roni");
        Animal dogBlack = new Dog("Black");
        Animal dogMuha = new Dog("Muha");
        Animal dogEve = new Dog("Patron");

        Cat.getCounter();
        Dog.getCounter();
        Animal.getCounter();

        catLusia.run(25);
        catRoni.run(160);
        dogBlack.run(500);
        dogEve.run(450);
        catWhity.run(499);

        catLusia.swim(10);
        dogMuha.swim(9);
        dogBlack.swim(11);
        dogEve.swim(5);
    }
}

