package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jai Mahismati");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(2000);
        org.openqa.selenium.Alert alret=driver.switchTo().alert();
        String alrettext=alret.getText();
        System.out.println(alrettext);
        alret.accept();
        Thread.sleep(5000);
        driver.quit();



    }
}
