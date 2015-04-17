package com.thoughtworks.videorental.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Movie {
    private String title;
    private boolean isNewRelease;

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, boolean isNewRelease) {
        this.title = title;
        this.isNewRelease = isNewRelease;
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(final int daysRented) {
        if (isNewRelease) return daysRented < 2 ? 3 : 3 + (daysRented - 2) * 2;
        else return daysRented;
    }


    public boolean isNewReleaseMovie() {
        return isNewRelease;
    }
}
