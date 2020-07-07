package com.pratul;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("Fish.rest  called");
    }

    private void moveMuscle(){
        System.out.println("Fish.moveMuscle  called");
    }

    private void moveBack(){
        System.out.println("Fish.moveBack  called");
    }

    public void swim(int speed){
        System.out.println("Fish.swim  called");
        moveMuscle();
        moveBack();
        rest();
        super.move(speed);
    }
}
