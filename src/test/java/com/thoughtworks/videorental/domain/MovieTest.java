package com.thoughtworks.videorental.domain;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class MovieTest {

    @Test
    public void testGetCharge() throws Exception {
        Movie movie=new Movie("SOS");
        double charge = movie.getCharge(5);
        assertEquals(5.0,charge);
    }

    @Test
    public void testGetPointsForMovieForOneDay(){
        Movie movie=new Movie("Walking Dead");
        double charge = movie.getCharge(1);
        int points= movie.getPoints(charge);
        assertEquals(1,points);
    }

    @Test
    public void testGetPointsForMovie(){
        Movie movie=new Movie("Walking Dead");
        double charge = movie.getCharge(5);
        int points= movie.getPoints(charge);
        assertEquals(5,points);
    }

}