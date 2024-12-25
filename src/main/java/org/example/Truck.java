package org.example;

public class Truck extends Vehicle {
    public void rent(Customer customer, int days) {
        this.setAvailable(false);
        System.out.println("Truck rented successfully");
    }

    public void returnVehicle() {
        this.setAvailable(true);
        System.out.println("Truck returned successfully");
    }

    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate, true);
    }

    public double calculateRentalCost(int days) {
        return this.getBaseRentalRate() * (double)days;
    }

    public boolean isAvailableForRental() {
        return this.isAvailable();
    }

    public String toString() {
        return "Truck= vehicleId:" + this.getVehicleId() + ",model:" + this.getModel() + ",baseRentalRate:'" + this.getBaseRentalRate() + "'}";
    }
}
