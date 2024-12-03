package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public static void main(String[] args) throws  Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        WebElement element1=driver.findElement(By.cssSelector("#draggable"));
        Thread.sleep(5000);
        WebElement element2=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

        Actions actions=new Actions(driver);
        //drag and drop
        //actions.dragAndDrop(element1,element2).build().perform();
        //Rightclick on the Specific element
        //actions.contextClick(element2).build().perform();
        //double click on the Specific Webelement
       // WebElement selectable=driver.findElement(By.xpath("(//li[@id='item-1'])[4]"));
        Thread.sleep(5000);
        //actions.doubleClick(selectable).build().perform();



    }
}
