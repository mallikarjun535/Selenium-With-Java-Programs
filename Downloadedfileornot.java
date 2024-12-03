package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Downloadedfileornot {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        Map<String, Object>prefs=new HashMap<>();
        prefs.put("download.default_directory","C:\\Users\\malli\\IdeaProjects\\Suresh");
        options.setExperimentalOption("prefs",prefs);
        WebDriver driver=new ChromeDriver(options);
        driver.navigate().to("https://www.zedge.net/wallpaper/da408221-daee-4d63-b191-55c164323966");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Download']")).click();
        //File file=new File()


    }
}
