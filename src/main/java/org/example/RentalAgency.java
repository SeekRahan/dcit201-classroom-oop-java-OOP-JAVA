package org.example;

public class RentalAgency {
    private Car[] cars;

    public Car findAvailableVehicle() {
        Car[] cars = this.cars;
        int days = cars.length;

        for(int i = 0; i < days; ++i) {
            Car car = cars[i];
            if (car.isAvailableForRental()) {
                return car;
            }

            System.out.println("None is available");
        }

        return null;
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
        }

    }
}
