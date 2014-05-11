package uk.co.amazon.test.pages;

import uk.co.amazon.test.pages.entities.AmazonSearchResultsList;
import uk.co.amazon.test.pages.entities.ResultItem;

/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 01/05/2014
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public class AmazonSearchResultPage {
    private AmazonSearchResultsList resultList;

    public AmazonSearchResultPage(){
        resultList = new AmazonSearchResultsList();
    }

    public String getPriceForItem(int i){
        return resultList.getPriceForItem(i);
    }

    public int getResultListSize() {
        return resultList.getResultsList().size();
    }

    public ResultItem getResultItem(int itemIndex) {
        return resultList.getResultItem(itemIndex);
    }
}
