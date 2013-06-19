package uk.co.amazon.pages.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 19/06/2013
 * Time: 01:09
 * To change this template use File | Settings | File Templates.
 */
public class ResultItem {
    private WebElement baseElement=null;

    public ResultItem(WebElement baseElement) {
        this.baseElement = baseElement;
    }

    public String getPrice() {
        return this.baseElement.findElement(By.cssSelector("span.bld")).getText().trim().substring(1);
        // substring will remove the pound sign
    }
}
