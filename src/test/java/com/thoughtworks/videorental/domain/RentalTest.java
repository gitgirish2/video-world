package com.thoughtworks.videorental.domain;

import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    @Test
    public void testGetMovie() throws Exception {

    }

    @Test
    public void testGetCustomer() throws Exception {

    }

    @Test
    public void testGetPeriod() throws Exception {

    }

    @Test
    public void testGetRentedOn() throws Exception {

    }

    @Test
    public void testGetEndDate() throws Exception {

    }


    @Test
    public void testShouldGetPointsForNewMovie(){
        NewMovie movie = new NewMovie("movie1");
        Customer customer = new Customer("anil");
        Period period=new Period(0,0,0,1,0,0,0,0);
        LocalDateTime localDateTime = new LocalDateTime();
        Rental rental = new Rental(customer, movie, period,localDateTime);
        int points = rental.getPoints();
        assertEquals(2,points);
    }

    @Test
    public void testShouldGetPointsForClassicMovie(){
        ClassicMovie movie = new ClassicMovie("movie1");
        Customer customer = new Customer("anil");
        Period period=new Period(0,0,0,1,0,0,0,0);
        LocalDateTime localDateTime = new LocalDateTime();
        Rental rental = new Rental(customer, movie, period,localDateTime);
        int points = rental.getPoints();
        assertEquals(0,points);
    }
    @Test
    public void testShouldGetPointsForRegularMovie(){
        Movie movie = new Movie("movie1");
        Customer customer = new Customer("anil");
        Period period=new Period(0,0,0,5,0,0,0,0);
        LocalDateTime localDateTime = new LocalDateTime();
        Rental rental = new Rental(customer, movie, period,localDateTime);
        int points = rental.getPoints();
        assertEquals(5,points);
    }
}