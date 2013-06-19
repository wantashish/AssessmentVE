package uk.co.amazon.tests;


import org.testng.annotations.*;
import uk.co.amazon.framework.BrowserWindow;
import uk.co.amazon.pages.AmazonHomePage;
import uk.co.amazon.pages.entities.AmazonSearchResultsList;
import uk.co.amazon.pages.entities.ResultItem;

import java.util.List;

import static org.testng.Assert.assertTrue;


/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 18/06/2013
 * Time: 21:28
 * To change this template use File | Settings | File Templates.
 */
public class ExerciseTests {


    @BeforeMethod
    public void setup(){
        BrowserWindow.initialize();
    }

    @AfterMethod
    public void tearDown(){
        BrowserWindow.close();
    }

    @Test
    public void searchIpadAndAssertFirstPrice(){
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.enterSearchItem("iPad");
        AmazonSearchResultsList amazonSearchResultsList = amazonHomePage.clickGo();
        String firstItemPrice = amazonSearchResultsList.getPriceForItem(1);
        assertTrue(firstItemPrice.equals("300.00"));
    }

    @Test
    public void countSearchResultsAndAssertLastPrice(){
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.enterSearchItem("iPad");
        AmazonSearchResultsList amazonSearchResultsList = amazonHomePage.clickGo();
        int resultCount = amazonSearchResultsList.getResultsList().size();
        System.out.println("Total number of results : "+resultCount);
        String lastItemPrice = amazonSearchResultsList.getResultItem(resultCount).getPrice();
        assertTrue(lastItemPrice.equals("3.99"), "Actual Price: £"+lastItemPrice);
    }



}
