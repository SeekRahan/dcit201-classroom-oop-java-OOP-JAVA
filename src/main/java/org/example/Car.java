package org.example;

public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    public boolean isAvailableForRental() {
        if (this.isAvailable()) {
            System.out.println("Available");
        } else {
            System.out.println("Unavailable");
        }

        return this.isAvailable();
    }

    public void rent(Customer customer, int days) {
        this.setAvailable(false);
        System.out.println("Car rented successfully");
    }

    public void returnVehicle() {
        this.setAvailable(true);
        System.out.println("Car returned successfully");
    }

    public double calculateRentalCost(int days) {
        System.out.println(this.getBaseRentalRate() * (double)days);
        return this.getBaseRentalRate() * (double)days;
    }

    public String toString() {
        return "Cars= vehicleId:" + this.getVehicleId() + ",model:" + this.getModel() + ",baseRentalRate:" + this.getBaseRentalRate() + "}";
    }
}
