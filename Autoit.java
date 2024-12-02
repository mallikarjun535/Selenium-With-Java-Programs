package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {
    public static void main(String[] args) throws  Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://practice.expandtesting.com/upload#google_vignette");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='file']")).click();
        Runtime.getRuntime().exec("C:\\Users\\malli\\OneDrive\\Documents\\Autocoding.exe");


    }
}
