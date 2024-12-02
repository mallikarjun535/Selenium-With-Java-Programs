package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']"))).selectByVisibleText("Option1");
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("select#dropdown-class-example"))).selectByValue("option3");
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("select#dropdown-class-example"))).selectByIndex(0);
        List<WebElement>ddelements=driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
        System.out.println(ddelements.size());
        for (int i=0;i<ddelements.size();i++)
        {
            String ddelementstext=ddelements.get(i).getText();
            System.out.println(ddelementstext);
            Thread.sleep(5000);
            if (ddelementstext.equalsIgnoreCase("Option2")) {
                new Select(driver.findElement(By.cssSelector("select#dropdown-class-example"))).selectByIndex(1);

                break;
            }

        }
        Thread.sleep(3000);
        driver.quit();

    }
}
