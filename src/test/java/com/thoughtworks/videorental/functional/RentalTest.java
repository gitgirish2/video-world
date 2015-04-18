package com.thoughtworks.videorental.functional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;


public class RentalTest {
    private WebDriver driver;

    @Before
    public void setup(){
        driver = new FirefoxDriver();

        driver.get("http://localhost:8080/login");
        Select element = new Select(driver.findElement(By.name("username")));
        element.selectByValue("James Madison");
        driver.findElement(By.id("loginBtn")).click();
    }

    @Test
    public void test_rentVideo() {
        driver.findElement(By.cssSelector("input[type='checkbox'][value='Finding Nemo']")).click();

        driver.findElement(By.cssSelector("input[type='button'][value='Next >']")).click();

        Select rentalDuration = new Select(driver.findElement(By.name("rentalDuration")));
        rentalDuration.selectByValue("7");

        driver.findElement(By.cssSelector("input[type='submit'][value='Done']")).click();


        String statement = driver.findElement(By.id("stmt")).getText();

        String expected = "Rental Record for James Madison\n" +
                "  Finding Nemo  -  $7.0\n" +
                "Amount charged is $7.0";

        assertEquals(expected, statement);
    }


    @After
    public void tearDown(){
//        driver.quit();
    }
}
