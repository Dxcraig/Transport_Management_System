package org.example;

public class Car extends Vehicle{
    private double fuelEfficiency;

    public Car(String vehicleId, String model, double fuelLevel) {
        super(vehicleId, model, fuelLevel);
    }

    @Override
    public void calculateRange() {

    }
}
