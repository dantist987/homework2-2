package com.company;

public abstract class Car implements IPrintable {
    private int speed;
    private String model;

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }
}
