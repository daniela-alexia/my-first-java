package com.company;

public class Car2 {
    public int doors = 8;
    public double length = 3.8;
    public String color = "blue";
    public String brand = "Audi";

    public Car2 (int a, String b){
        doors = a;
        color = b;
    }

    public Car2() {
        
    }

    public int getDoors(){
        return doors;
    }

    public String getColor(){
        return color;
    }



}
