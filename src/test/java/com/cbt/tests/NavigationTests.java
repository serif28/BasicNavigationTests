package com.cbt.tests;

import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationTests {
    public static void main(String[] args) {

        safari();
        chromeBr();
        fireBr();
    }

    public static void chromeBr(){

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals("google", googleTitle);
        driver.navigate().forward();
        StringUtility.verifyEquals("etsy", etsyTitle);
        driver.close();
    }

    public static void fireBr(){

        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals("google", googleTitle);
        driver.navigate().forward();
        StringUtility.verifyEquals("etsy", etsyTitle);
        driver.close();
    }

    public static void safari(){


        SafariDriver driver = new SafariDriver();
        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals("google", googleTitle);
        driver.navigate().forward();
        StringUtility.verifyEquals("etsy", etsyTitle);
        driver.close();
    }
}
