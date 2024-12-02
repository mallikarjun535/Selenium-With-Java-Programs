package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://uploadnow.io/en#google-vigneet");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Add files']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("E:\\NOTEPAD\\Button.exe");


    }
}
