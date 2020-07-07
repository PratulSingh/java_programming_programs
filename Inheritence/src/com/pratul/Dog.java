package com.pratul;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    public void run(){
        System.out.println("Dog.run() called");
        eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    private void moveLegs(int a){
        System.out.println("Dog.moveLegs() called with input: "+a);
    }

    public void moveTail(){
        System.out.println("Dog.moveTail called");
        chew();
    }

    public void move(int speed){
        System.out.println("Dog.move called with speed: "+speed);
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        moveLegs(5);
        super.eat();
    }
}
