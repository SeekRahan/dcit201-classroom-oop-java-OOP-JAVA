package rental;

import org.assets.Vehicle;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int days;

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
        // Rental Transactions - Payments and Receipts
    public double calculateTotalCost() {
        return this.vehicle.calculateRentalCost(this.days);
    }
}
