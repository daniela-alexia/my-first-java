package com.company;

public class Main {

    public static void main(String[] args) {
    Car mercedes = new Car();
    Car BMW = new Car(2,"BMW");
    System.out.println("masina 1 usi "+ mercedes.getDoors());
        System.out.println(mercedes.getBrand());
        System.out.println(mercedes.brand);
        System.out.println(BMW.getDoors());
        System.out.println(BMW.getBrand());
        BMW.setDoors(4);
        System.out.println(BMW.getDoors());



    }
}
