package uk.co.amazon.pages.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.amazon.framework.BrowserWindow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 19/06/2013
 * Time: 00:39
 * To change this template use File | Settings | File Templates.
 */
public class AmazonSearchResultsList {


    public String getPriceForItem(int itemNumber) {
//        List<String> priceList = new ArrayList<String>();
//        for(WebElement elm : BrowserWindow.findElements())

        return getResultItem(itemNumber).getPrice();
    }

    public List<ResultItem> getResultsList() {
        List<ResultItem> resultsList = new ArrayList<ResultItem>();
        for(WebElement elm : BrowserWindow.findElements(By.xpath("//div[contains(@class,'prod celwidget')]"))){
            resultsList.add(new ResultItem(elm));
        }
        return resultsList;  //To change body of created methods use File | Settings | File Templates.
    }

    public ResultItem getResultItem(int itemNumber) {
        return getResultsList().get(itemNumber-1);
    }
}
