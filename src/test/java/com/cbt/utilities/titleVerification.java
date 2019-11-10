package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class titleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String [] title = new String [3];
        for (int i=0; i<urls.size(); i++){
            driver.get(urls.get(i));
            StringUtility.verifyEquals("Practice",driver.getTitle());

        }
        driver.quit();

    }
}
