package uk.co.amazon.test.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrowserWindow {

    private static WebDriver driver=null;

    public BrowserWindow(){

    }

    public static void initialize(){
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        FirefoxProfile profile = new FirefoxProfile();
        capabilities.setCapability(FirefoxDriver.PROFILE,profile);
        profile.setPreference("webdriver.load.strategy", "unstable");
        driver = new FirefoxDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        WebDriver driver = new ChromeDriver(capabilities);
    }

    public static void navigateTo(String url) {
        driver.get(url);
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

//    public static void waitFor(ExpectedCondition<WebElement> webElementExpectedCondition) {
//        new WebDriverWait(driver,5).until(webElementExpectedCondition);
//
//    }
}
