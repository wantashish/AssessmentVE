package uk.co.amazon.test.pages.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
