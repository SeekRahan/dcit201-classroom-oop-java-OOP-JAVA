package org.assets;

import rental.Customer;

public class Motorcycle extends Vehicle {
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
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

    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            this.setAvailable(false);
            System.out.println("Motorcycle rent successfully");
        }else{
            System.out.println("Motorcycle already rented");
        }
    }

    public void returnVehicle() {
        if (isAvailable()) {
            this.setAvailable(true);
            System.out.println("Motorcycle returned successfully");
        }else{
            System.out.println("Motorcycle already returned");
        }
    }

    public String toString() {
        return "Vehicle Id:" + this.getVehicleId() + "- model:" + this.getModel() + "- baseRentalRate:" + this.getBaseRentalRate();
    }
}
