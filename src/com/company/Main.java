package com.company;

public class Main {

    public static void main(String[] args) {

        Car toyota = createObject("Toyota");
        Car nissan = createObject("Nissan");
        Car honda = createObject("Honda");

        toyota.print();
        System.out.println("--------------");
        nissan.print();
        System.out.println("--------------");
        honda.print();
    }

    private static Car createObject(String className) {
        switch (className) {
            case "Toyota":
                return new Toyota(180, "Harrier", "Crossover");

            case "Nissan":
                return new Nissan(220, "Skyline", "4WD");

            default:
                return new Honda(200, "Accord", 2.4);


        }
    }
}
