package org.assets;

import rental.Customer;

public interface Rentable {

    void rent(Customer customer, int days);

    void returnVehicle();
}

