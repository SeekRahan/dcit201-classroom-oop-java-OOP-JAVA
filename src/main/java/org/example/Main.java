package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("1", "Toyota", 60.0D, true);
        Car car2 = new Car("1", "Honda", 60.0D, false);

        Motorcycle motor1 = new Motorcycle("2", "Apsonic", 30.0D);

        Truck truck1 = new Truck("3", "Bulldozer", 90.0D);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        List<Motorcycle> motors = new ArrayList<>();
        motors.add(motor1);

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);

        System.out.println("\n@LIST OF VEHICLES\n");
        System.out.println("--Cars--");


        for(Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\n--Motorcycles--");
        for(Motorcycle motor : motors){
            System.out.println(motor);
        }

        System.out.println("\n--Trucks--");
        for(Truck truck : trucks) {
            System.out.println(truck);
        }


        System.out.println("\n@Customer Rents car1");
        car1.rent(new Customer("001", "James"), 5);
        System.out.println("Cost of the Rent Given the number of days rented:");
        car1.calculateRentalCost(5);

        System.out.println("\n@Checking Vehicle availability after Rental");
        car1.isAvailableForRental();

        System.out.println("\n@Rented Vehicle being returned");
        car1.returnVehicle();

        System.out.println("\n@Checking Vehicle availability after Return");
        car1.isAvailableForRental();


    }
}