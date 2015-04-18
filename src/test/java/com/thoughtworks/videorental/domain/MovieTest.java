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

}