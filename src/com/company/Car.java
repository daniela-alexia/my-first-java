package com.company;

public class Car {
    public int doors = 5;
    public double length = 4.6;
    public String color = "black";
    public String brand = "Mercedes";

    public Car (int a, String b){
        doors=a;
        brand=b;
    }

    public Car() {

    }

    public int getDoors(){
        return doors;
    }
    public void setDoors(int nodoors){
        doors=nodoors;
    }
    public String getBrand(){
        return brand;
    }
}

