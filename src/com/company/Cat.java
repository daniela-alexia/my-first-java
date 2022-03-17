package com.company;

public class Cat extends Animal{
    private String color;

    public Cat(String color) {
        super(4);
        this.color = color;
    }
    public Cat(){

    }
public String getColor(){
        return color;
}
}
