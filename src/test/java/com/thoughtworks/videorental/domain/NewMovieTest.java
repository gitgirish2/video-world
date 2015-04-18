package com.thoughtworks.videorental.domain;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NewMovieTest {

    @Test
    public void testGetChargeForNewMovie() throws Exception {
        Movie movie=new NewMovie("SOS");
        double charge = movie.getCharge(5);
        assertEquals(9.0,charge);
    }

    @Test
    public void testGetChargeForNewMovieForLessTime() throws Exception {
        Movie movie=new NewMovie("SOS");
        double charge = movie.getCharge(1);
        assertEquals(3.0,charge);
    }

    @Test
    public void testShouldGetPointsForOneDay(){
        Movie movie=new NewMovie("RaceGurram");
        int points = movie.getPoints(1);
        assertEquals(2,points);
    }

    @Test
    public void testShouldGetPoints(){
        Movie movie=new NewMovie("RaceGurram");
        int points = movie.getPoints(4);
        assertEquals(8,points);
    }

}