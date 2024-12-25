package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getName() {
        return this.name;
    }

    public List<RentalTransaction> getRentalHistory() {
        return this.rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        this.rentalHistory.add(transaction);
    }
}
