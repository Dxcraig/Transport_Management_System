package org.example;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double fuelLevel;

    public Vehicle(String vehicleId, String model, double fuelLevel) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    public void refuel(double liters){
        fuelLevel += liters;
        System.out.println("Refueled " + liters + " liters. New fuel level: " + fuelLevel + " liters.");
    }



}
