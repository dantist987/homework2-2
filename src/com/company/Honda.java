package com.company;

public class Honda extends Car {
    private double engineCapacity;

    public Honda(int speed, String model, double engineCapacity) {
        super(speed, model);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public void print() {
        System.out.println("Speed is " + getSpeed() +
                "\nModel is " + getModel() +
                "\nEngine capacity is " + getEngineCapacity());
    }
}