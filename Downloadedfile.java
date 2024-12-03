package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;

public class Downloadedfile {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromeprefs = new HashMap<String, Object>();
        chromeprefs.put("profile.default_content_settings.popus", 0);
        String downloadfilepath = System.getProperty("user.dir");
        chromeprefs.put("download.default_directory", downloadfilepath);
        options.setExperimentalOption("prefs", chromeprefs);
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.pexels.com/photo/silver-iphone-x-with-airpods-788946/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        File directory = new File(downloadfilepath);
        File[] files = directory.listFiles(File::isFile);

        for (File file : files) {
            file.delete();
        }
        driver.findElement(By.linkText("Free download")).click();
        Thread.sleep(5000);


        for (File file : files) {

            System.out.println(file.getName());

        }

        long lastModifiedTime = Long.MIN_VALUE;

        File chosenFile = null;

        /*if (files != null) {
            for (File file : files) {
                System.out.println(file.lastModified());
                if (file.lastModified() <= lastModifiedTime ) {
                    chosenFile = file;
                    lastModifiedTime = file.lastModified();
                    //System.out.println(chosenFile);
                    //System.out.println(lastModifiedTime);
                }
            }
        }*/
    }
}
