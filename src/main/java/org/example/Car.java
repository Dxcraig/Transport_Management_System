package org.example;

public class Car extends Vehicle{
    private double fuelEfficiency;

    public Car(String vehicleId, String model, double fuelLevel) {
        super(vehicleId, model, fuelLevel);
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void calculateRange() {
        double range = fuelLevel * fuelEfficiency;
        System.out.println("Car " + model + " can travel " + range + " kilometers");
    }
}
