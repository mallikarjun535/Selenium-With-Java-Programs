package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class FileuoloadButton {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://uploadnow.io/en#google-vigneet");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Add files']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("E:\\NOTEPAD\\DimpleYadav.exe");
        Thread.sleep(5000);

        //driver.quit();

       /* try {
            Runtime.getRuntime().exec("C:\\Users\\malli\\OneDrive\\Desktop\\rr.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

    }
}
