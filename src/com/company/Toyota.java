package com.company;

public class Toyota extends Car {
    private String bodyType;

    public Toyota(int speed, String model, String bodyType) {
        super(speed, model);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public void print() {
        System.out.println("Speed is " + getSpeed() +
                "\nModel is " + getModel() +
                "\nBody type is " + getBodyType());
    }
}
