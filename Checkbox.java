package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) throws  Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement>elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(elements.size());
        for (int i=0;i<elements.size();i++)
        {
            Thread.sleep(3000);
            elements.get(i).click();
            if (elements.get(i).isSelected())
            {
                System.out.println("Check box is" +i+ " selected");
            }
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
