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
    public void testIsNewMovie() throws Exception {
        Movie movie=new Movie("SOS",true);
        boolean result=movie.isNewReleaseMovie();
        assertEquals(true, result);
    }

    @Test
    public void testGetChargeForNewMovie() throws Exception {
        Movie movie=new Movie("SOS",true);
        double charge = movie.getCharge(5);
        assertEquals(9.0,charge);
    }

    @Test
    public void testGetChargeForNewMovieForLessTime() throws Exception {
        Movie movie=new Movie("SOS",true);
        double charge = movie.getCharge(1);
        assertEquals(3.0,charge);
    }
}