package uk.co.amazon.pages.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.amazon.framework.BrowserWindow;

import java.util.ArrayList;
import java.util.List;


public class AmazonSearchResultsList {


    public String getPriceForItem(int itemNumber) {
        return getResultItem(itemNumber).getPrice();
    }

    public List<ResultItem> getResultsList() {
        List<ResultItem> resultsList = new ArrayList<ResultItem>();
        for(WebElement elm : BrowserWindow.findElements(By.xpath("//div[contains(@class,'prod celwidget')]"))){
            resultsList.add(new ResultItem(elm));
        }
        return resultsList;
    }

    public ResultItem getResultItem(int itemNumber) {
        return getResultsList().get(itemNumber-1);
    }
}
