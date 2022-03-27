package com.company;

public class Nissan extends Car {
    private String wd;

    public Nissan(int speed, String model, String wd) {
        super(speed, model);
        this.wd = wd;
    }

    public String getWd() {
        return wd;
    }

    @Override
    public void print() {
        System.out.println("Speed is " + getSpeed() +
                "\nModel is " + getModel() +
                "\nCar is " + getWd());
    }
}
