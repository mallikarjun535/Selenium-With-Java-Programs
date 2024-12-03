package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;

public class Down {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        HashMap<String, Object> chromeprefs=new HashMap<String, Object>();
        chromeprefs.put("profile.default_content_settings.popus",0);
        String downloadfilepath=System.getProperty("user.dir");
        chromeprefs.put("download.default_directory",downloadfilepath);
        options.setExperimentalOption("prefs",chromeprefs);
        WebDriver driver=new ChromeDriver(options);
        driver.navigate().to("https://in.pinterest.com/pin/334181234865018467/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@class='rYa kVc adn yQo S9z qrs BG7'])[3]")).click();
        driver.findElement(By.xpath("//span[@title='Download image']")).click();
        Thread.sleep(5000);
       /* File file=new File(downloadfilepath+"\\pexels-jessbaileydesign-788946.jpg");
        if (file.exists())
        {
            System.out.println("File got succesfully downloaded");
        }
        else {
            System.out.println("file didnot get downloaded");
        }*/


    }
}
