package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class titleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");


        String a = "";
        for (int i=0; i<urls.size(); i++){
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            int begin = urls.get(i).indexOf("/");
            int end = urls.get(i).lastIndexOf(".");
            a = urls.get(i).substring((begin+2),end);
            //  System.out.println(a);
            driver.get(urls.get(i));
            //  String title = driver.getTitle();
            //  System.out.println(title);
            if (driver.getTitle().replaceAll(" ","").toLowerCase().contains(a)){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
            driver.close();
        }



    }
}
