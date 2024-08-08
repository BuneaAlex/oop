package org.example;


public class Main {
    public static void main(String[] args) {
        DistanceUnits km = DistanceUnits.MILLIMETERS;
        System.out.println(km.toMeter(10,km));
    }
}