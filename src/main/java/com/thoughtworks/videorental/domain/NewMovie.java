package com.thoughtworks.videorental.domain;

import com.thoughtworks.videorental.domain.Movie;

public class NewMovie extends Movie {
    public NewMovie(String title) {
        super(title);
    }

    @Override
    public double getCharge(int daysRented) {
        return  daysRented < 2 ? 3 : 3 + (daysRented - 2) * 2;
    }
@Override
    public int getPoints(double daysRented) {
        return (int)daysRented*2;
    }
}
