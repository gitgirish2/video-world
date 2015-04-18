package com.thoughtworks.videorental.domain;

public class ClassicMovie extends Movie {

    public ClassicMovie(String title) {
        super(title);
    }

    @Override
    public double getCharge(int daysRented) {
        double price = 0.5;
        double charge = 0;
        for(int day = 1 ; day <= daysRented ; day++) {
            if(day != 7) {
                charge += price;
            }
        }
        return charge;
    }
}
