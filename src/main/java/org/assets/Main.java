package org.assets;
import rental.Customer;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Adding vehicles
    Car car1 = new Car("1", "Toyota", 60.0D, false);
   Car car2 = new Car("1", "Honda", 60.0D, false);

    Motorcycle motor1 = new Motorcycle("2", "Apsonic", 30.0D);

    Truck truck1 = new Truck("3", "Bulldozer", 90.0D);

    List<Car> cars = new ArrayList<>();
    List<Motorcycle> motors = new ArrayList<>();
    List<Truck> trucks = new ArrayList<>();

    static Scanner choice = new Scanner(System.in);

    public void addVehicles() {

           cars.add(car1);
           cars.add(car2);

        //List<Motorcycle> motors = new ArrayList<>();
        motors.add(motor1);

        //List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);

    }

 // Displying vehicles
    public void displayVehicles() {
        Main run = new Main();

        System.out.println("\n@LIST OF VEHICLES\n");
        System.out.println("--Cars--");


        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\n--Motorcycles--");
        for (Motorcycle motor : motors) {
            System.out.println(motor);
        }

        System.out.println("\n--Trucks--");
        for (Truck truck : trucks) {
            System.out.println(truck);
        }

        run.controlRoom();
    }
    // Renting Vehicles
    public void rent() {
        Main run = new Main();
        System.out.println("Choose vehicle type for rent\n" +
                "Car\n1. " + cars + "\n\n" +
                "Motorcycle\n2. " + motors + "\n\n " +
                "Truck\n3. " + trucks);

        String vrent = choice.next();

        System.out.println("Customer id:");
        String id = choice.next();
        System.out.println("Customer name:");
        String name = choice.next();
        System.out.println("Number of days");
        int days = choice.nextInt();
        choice.nextLine();

        switch (vrent) {
            case "1":
                car1.rent(new Customer(id, name), days);
                car1.calculateRentalCost(days);
                break;
            case "2":
                motor1.rent(new Customer(id, name), days);
                motor1.calculateRentalCost(days);
                break;
            case "3":
                truck1.rent(new Customer(id, name), days);
                truck1.calculateRentalCost(days);
                break;

        }


    }
    // Checking Vehicle availability
    public void checkAvailable() {
        Main run =new Main();
        System.out.println("Choose the vehicle to return\n" +
                "Car\n1. " + cars + "\n\n" +
                "Motorcycle\n2. " + motors + "\n\n" +
                "Truck\n3. " + trucks);


        String ck = choice.nextLine();
        switch (ck) {
            case "1":
                car1.isAvailableForRental();
                break;
            case "2":
                motor1.isAvailableForRental();
                break;
            case "3":
                truck1.isAvailableForRental();
                break;

        }


        run.controlRoom();
    }
    //Returning vehicles
    public void returnRentedVehicle() {
        Main run = new Main();
        System.out.println("Choose the vehicle to return\n" +
                "Car\n1. " + cars + "\n\n" +
                "Motorcycle\n2. " + motors + "\n\n" +
                "Truck\n3. " + trucks);

        String vrt = choice.nextLine();

        switch (vrt) {
            case "1":
                car1.returnVehicle();
                break;
            case "2":
                motor1.returnVehicle();
                break;
            case "3":
                truck1.returnVehicle();
                break;


//        car1.returnVehicle();
        }

        run.controlRoom();
    }

    // Start point containing options
    public void controlRoom () {
            Main run = new Main();


            run.addVehicles();

            System.out.println("Input the corresponding digit" +
                    "\n1. Display vehicles\n" +
                    "2. Rent vehicles\n" +
                    "3. Check availability\n" +
                    "4. Return vehicles");

            String pick = choice.nextLine();



            switch (pick) {
                case "1":
                    run.displayVehicles();
                    break;
                case "2":
                    run.rent();
                    break;
                case "3":
                    run.checkAvailable();
                    break;
                case "4":
                    run.returnRentedVehicle();
                    break;
                default:
                    System.out.println("Wrong input");
            }

    }

    public static void main (String[]args){
            Main run = new Main();
            run.controlRoom();








    }

}
