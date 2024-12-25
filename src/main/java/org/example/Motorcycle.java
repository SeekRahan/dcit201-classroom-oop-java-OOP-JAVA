package org.example;

public class Motorcycle extends Vehicle {
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate, true);
    }

    public double calculateRentalCost(int days) {
        return this.getBaseRentalRate() * (double)days;
    }

    public boolean isAvailableForRental() {
        return this.isAvailable();
    }

    public void rent(Customer customer, int days) {
        this.setAvailable(false);
        System.out.println("Motorbike rented successfully");
    }

    public void returnVehicle() {
        this.setAvailable(true);
        System.out.println("Motorbike returned successfully");
    }

    public String toString() {
        return "Motorcycle= vehicleId:" + this.getVehicleId() + ",model:" + this.getModel() + ",baseRentalRate:" + this.getBaseRentalRate() + "}";
    }
}
