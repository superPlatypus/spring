package com.example.demo;

public class Lamp implements Lighter{
    @Override
    public void doLight() {
        System.out.println("Lamp!");
    }
}
