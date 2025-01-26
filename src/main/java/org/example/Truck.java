package org.example;

public class Truck extends Vehicle{
    protected double cargoWeight;

    public Truck(String vehicleId, String model, double fuelLevel) {
        super(vehicleId, model, fuelLevel);
        this.cargoWeight = cargoWeight;
    }


    @Override
    public void calculateRange() {

    }
}
