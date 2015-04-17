package com.thoughtworks.videorental.domain;

public class ClassicMovie extends Movie {
    private double price = 0.5;

    public ClassicMovie(String title) {
        super(title);
    }


    @Override
    public double getCharge(int daysRented) {
        double price = 0;
        for(int day = 1 ; day <= daysRented ; day++) {
            if(day != 7) {
                price += this.price;
            }
        }
        return price;
    }
}
