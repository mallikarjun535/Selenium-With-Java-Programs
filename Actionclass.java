package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
    public static void main(String[] args) throws  Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement element=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
        Actions action=new Actions(driver);
        //Right click
       // action.contextClick(element).build().perform();
        //doubleclick
       // action.doubleClick(element).build().perform();

        JavascriptExecutor jsr=(JavascriptExecutor) driver;
        //to Specify particular Webelement
        jsr.executeScript("arguments[0].scrollIntoView();",element);
       // jsr.executeScript("arg")

        Thread.sleep(5000);
        action.moveToElement(element).build().perform();
        //to scrollup
       // jsr.executeScript("window.scrollTo(800,0)");
       // Thread.sleep(3000);
        //to scrolldown
        //jsr.executeScript("window.scrollTo(0,400)");
        driver.quit();






    }
}
