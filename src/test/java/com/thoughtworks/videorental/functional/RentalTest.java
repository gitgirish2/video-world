package com.thoughtworks.videorental.functional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class RentalTest {

    private FirefoxDriver driver;

    @Before
    public void setup(){
        driver=new FirefoxDriver();
        String url = "http://localhost:8080/login";
        driver.get(url);
        Select element=new Select(driver.findElement(By.name("username")));
        element.selectByValue("Anil Kumar Kodi");
        driver.findElement(By.id("loginBtn")).click();
    }

    @Test
    public  void testRentVideoShouldSelectAMovie(){
        FirefoxDriver driver = new FirefoxDriver();
        String url = "http://localhost:8080/login";
        driver.get(url);
        Select element=new Select(driver.findElement(By.name("username")));
        element.selectByValue("Anil Kumar Kodi");
        driver.findElement(By.id("loginBtn")).click();
//        driver.findElement(By.cssSelector("input[type='checkbox'][value='Finding Nemo']"));
//        driver.findElement(By.cssSelector("input[type='button'][value='Next>']"));
//        Select rentalDuration=new Select(driver.findElement(By.name("")));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
