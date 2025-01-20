package org.example;

public class Truck extends Vehicle{
    protected double cargoWeight;

    public Truck(String vehicleId, String model, double fuelLevel) {
        super(vehicleId, model, fuelLevel);
        this.cargoWeight = cargoWeight;
    }


    @Override
    public void calculateRange() {

        double baseFuelEfficiency = 0;
        double effectiveFuelEfficiency = baseFuelEfficiency - (cargoWeight / 1000.0);


    }
}
