package com.thoughtworks.videorental.domain;

import lombok.EqualsAndHashCode;

import java.security.Principal;
import java.util.Set;

@EqualsAndHashCode
public class Customer implements Principal{
    private String name;
    private int points=0;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String statement(final Set<Rental> newRentals) {
        String result = "Rental Record for " + getName() + "\n";

        double totalAmount = 0;
        for (Rental rental : newRentals) {
            final Integer rentalDays = rental.getPeriod().getDays();

            result += "  " + rental.getMovie().getTitle() + "  -  $"
                    + String.valueOf(rental.getMovie().getCharge(rentalDays)) + "\n";

            totalAmount += rental.getMovie().getCharge(rentalDays);
            points +=rental.getPoints();
        }

        // add footer lines
        result += "Amount charged is $" + String.valueOf(totalAmount);
        result += "\n Points are" + String.valueOf(points);
        return result;
    }

    public int getPoints() {
        return this.points;
    }
}
