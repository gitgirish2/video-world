package com.thoughtworks.videorental.domain;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ClassicMovieTest {

    @Test
    public void testShouldGetChargeForTheClassicMovieForOneDay() {
        Movie lageRaho = new ClassicMovie("Lage Raho");
        double actualMovieCharge = lageRaho.getCharge(1);
        double expectedMovieCharge = 0.5;
        assertEquals(expectedMovieCharge, actualMovieCharge);
    }

    @Test
    public void testShouldGetChargeForTheClassicMovieForTwoDays() {
        Movie lageRaho = new ClassicMovie("Lage Raho");
        double actualMovieCharge = lageRaho.getCharge(2);
        double expectedMovieCharge = 1.0;
        assertEquals(expectedMovieCharge, actualMovieCharge);
    }

    @Test
    public void testShouldGetChargeForTheClassicMovieForSevenDays() {
        Movie lageRaho = new ClassicMovie("Lage Raho");
        double actualMovieCharge = lageRaho.getCharge(7);
        double expectedMovieCharge = 3.0;
        assertEquals(expectedMovieCharge, actualMovieCharge);
    }

    @Test
    public void testShouldGetChargeForTheClassicMovieForEightDayd() {
        Movie lageRaho = new ClassicMovie("Lage Raho");
        double actualMovieCharge = lageRaho.getCharge(8);
        double expectedMovieCharge = 3.5;
        assertEquals(expectedMovieCharge, actualMovieCharge);
    }

    @Test
    public void testShouldGetPointsForOneDay() {
        Movie lageRaho = new ClassicMovie("Lage Raho");
        double actualMovieCharge = lageRaho.getCharge(1);
        int points = lageRaho.getPoints(actualMovieCharge);
        assertEquals(0,points);
    }

    @Test
    public void testShouldGetPointsForSixDays() {
        Movie lageRaho = new ClassicMovie("Lage Raho");
        double actualMovieCharge = lageRaho.getCharge(6);
        int points = lageRaho.getPoints(actualMovieCharge);
        assertEquals(3,points);
    }



}