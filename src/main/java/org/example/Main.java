package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("C123", "Toyota", 20);
        car.calculateRange();
        car.refuel(10);
        car.calculateRange();

        Truck truck = new Truck("T123", "Volvo", 30);
        truck.calculateRange();
        truck.refuel(15);
        truck.calculateRange();
    }
}