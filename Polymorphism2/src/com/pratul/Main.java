package com.pratul;
class Car{
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String startEngine(){
        return "Car.startEngine called";
    }
    public String accelerate(){
        return "Car.accelerate called";
    }
}
class BMW extends Car{
    public BMW() {
        super("BMW", 6);
    }

    @Override
    public String startEngine() {
        return "BMW.startEngine called";
    }

    @Override
    public String accelerate() {
        return "BMW.accelerate called";
    }
}

class Jaguar extends Car{
    public Jaguar() {
        super("Jaguar", 6);
    }

    @Override
    public String startEngine() {
        return "Jaguar.startEngine called";
    }

    @Override
    public String accelerate() {
        return "Jaguar.accelerate called";
    }
}

class Mercedes extends Car{
    public Mercedes() {
        super("Mercedes", 8);
    }

    @Override
    public String startEngine() {
        return "Mercedes.startEngine called";
    }

    @Override
    public String accelerate() {
        return "Mercedes.accelerate called";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("base car", 6);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());

        BMW bmw = new BMW();
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());

        Mercedes mercedes = new Mercedes();
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());

        Jaguar jaguar = new Jaguar();
        System.out.println(jaguar.startEngine());
        System.out.println(jaguar.accelerate());


    }
}


