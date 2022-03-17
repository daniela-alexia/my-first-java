package com.company;

public class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    public Animal(){

    }
    public void noise(){
        System.out.println("zzzzz");
    }
    public int getLegs(){
        return legs;
    }

}
