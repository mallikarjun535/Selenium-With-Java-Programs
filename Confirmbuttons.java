package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Confirmbuttons {
    public static void main(String[] args) throws Exception {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jai Shree Krishna");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        Thread.sleep(5000);
        Alert confirmbutton=driver.switchTo().alert();
        String confirmbuttontext=confirmbutton.getText();
        Thread.sleep(3000);
        confirmbutton.accept();
        Thread.sleep(5000);
        driver.quit();



    }
}
