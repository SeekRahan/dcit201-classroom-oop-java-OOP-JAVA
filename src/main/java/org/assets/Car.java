package org.assets;

import rental.Customer;

public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }



    public void rent(Customer customer, int days) {

        if (isAvailable()) {
            this.setAvailable(false);
            System.out.println("Car rent successfully");
        }else{
            System.out.println("Car already rented");
        }

    }

    public void returnVehicle() {
        if (isAvailable()) {
            setAvailable(true);
            System.out.println("Car returned successfully");
        }else{
            System.out.println("Car already returned");
        }

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
        return "-Vehicle Id:" + this.getVehicleId() + " -Model:" + this.getModel() + " -BaseRentalRate:" + this.getBaseRentalRate();
    }
}

