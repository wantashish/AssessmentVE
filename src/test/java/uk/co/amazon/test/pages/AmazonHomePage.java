package uk.co.amazon.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.amazon.test.framework.BrowserWindow;

public class AmazonHomePage {


    private static String homePageUrl = "http://www.amazon.co.uk";

    public AmazonHomePage(){
        BrowserWindow.navigateTo(homePageUrl);
    }

    public void enterSearchItem(String searchString) {
        WebElement elm = BrowserWindow.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        elm.clear();
        elm.sendKeys(searchString);
    }

    public AmazonSearchResultPage clickGo(){
        BrowserWindow.findElement(By.xpath("//input[@value='Go']")).click();
        return new AmazonSearchResultPage();
    }
}
