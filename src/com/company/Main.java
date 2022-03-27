package com.company;

public class Main {

    public static void main(String[] args) {
        Toyota toyota = new Toyota(180, "Harrier", "Crossover");
        Nissan nissan = new Nissan(220, "Skyline", "4WD");
        Honda honda = new Honda(200, "Accord", 2.4);

        toyota.print();
        System.out.println("--------------");
        nissan.print();
        System.out.println("--------------");
        honda.print();
    }
}
