package uk.co.amazon.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import uk.co.amazon.pages.AmazonHomePage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrowserWindow {

    private static WebDriver driver=null;

    public BrowserWindow(){

    }

    public static void initialize(){
        FirefoxProfile profile = new FirefoxProfile();
        driver = new FirefoxDriver(profile);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void navigateTo(String url) {
        driver.get(url);
//        543864iuy34h3
    }

    public static WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public static void close() {
        driver.close();
    }

    public static List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }
}
