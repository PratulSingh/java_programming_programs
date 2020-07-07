package com.pratul;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal=new Animal("Animal", 1, 1, 5, 5);

        Dog dog=new Dog("Forkie", 4, 20, 2, 4, 1, 20, "long silky");
        dog.run();
        dog.walk();
        dog.moveTail();

        Fish fish = new Fish("Goldie", 5, 2, 2, 2, 2);
        fish.swim(10);
        fish.eat();
    }
}
