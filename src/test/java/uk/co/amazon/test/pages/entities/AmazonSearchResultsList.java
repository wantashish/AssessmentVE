package uk.co.amazon.test.pages.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.amazon.test.framework.BrowserWindow;

import java.util.ArrayList;
import java.util.List;


public class AmazonSearchResultsList {

    List<ResultItem> resultsList = null;

    public AmazonSearchResultsList() {
        setResultsList();
    }

    public String getPriceForItem(int itemNumber) {
        return getResultsPriceList().get(itemNumber - 1);
    }

    private List<String> getResultsPriceList() {
        List<String> resultsList = new ArrayList<>();
        for(WebElement elm : BrowserWindow.findElements(By.cssSelector("li.newp span.bld"))){
            resultsList.add(elm.getText().trim().substring(1));
        }
        return resultsList;
    }

    private List<ResultItem> setResultsList() {
        List<ResultItem> resultsList = new ArrayList<>();
        for(WebElement elm : BrowserWindow.findElements(By.cssSelector("div.leftCol div.prod"))){
            resultsList.add(new ResultItem(elm));
        }
        return resultsList;
    }

    public ResultItem getResultItem(int itemNumber) {
        return getResultsList().get(itemNumber-1);
    }

    public List<ResultItem> getResultsList() {
        return resultsList;
    }
}
