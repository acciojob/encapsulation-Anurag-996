package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();

        r.setName("John Doe");
        System.out.println(r.getName());
    }
}