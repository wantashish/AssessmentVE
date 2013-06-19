package uk.co.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.amazon.framework.BrowserWindow;
import uk.co.amazon.pages.entities.AmazonSearchResultsList;

/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 18/06/2013
 * Time: 22:13
 * To change this template use File | Settings | File Templates.
 */
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

    public AmazonSearchResultsList clickGo(){
        BrowserWindow.findElement(By.xpath("//input[@value='Go']")).click();
        return new AmazonSearchResultsList();
    }
}
