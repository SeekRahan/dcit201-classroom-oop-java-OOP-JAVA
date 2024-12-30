package org.assets;

import rental.Customer;

public class Truck extends Vehicle {
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            this.setAvailable(false);
            System.out.println("Truck rented successfully");
        }else{
            System.out.println("Truck already rented");
        }
    }

    public void returnVehicle() {
        if (isAvailable()) {
            this.setAvailable(true);
            System.out.println("Truck returned successfully");
        }else{
            System.out.println("Truck already returned");
        }
    }

    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate, true);
    }

    public double calculateRentalCost(int days) {
        Main run = new Main();
        System.out.println("Cost of Rent: " +this.getBaseRentalRate() * (double)days);
        run.controlRoom();
        return this.getBaseRentalRate() * (double)days;
    }

    public boolean isAvailableForRental() {
        if (this.isAvailable()) {
            System.out.println("Available");
        } else {
            System.out.println("Unavailable");
        }

        return this.isAvailable();
    }

    public String toString() {
        return "-VehicleId:" + this.getVehicleId() + " -Model:" + this.getModel() + " -BaseRentalRate:" + this.getBaseRentalRate();
    }
}
