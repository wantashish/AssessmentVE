package uk.co.amazon.test.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.amazon.test.framework.BrowserWindow;
import uk.co.amazon.test.pages.AmazonHomePage;
import uk.co.amazon.test.pages.AmazonSearchResultPage;

import static org.testng.Assert.assertTrue;
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
        AmazonSearchResultPage amazonSearchResultPage = amazonHomePage.clickGo();
        String firstItemPrice = amazonSearchResultPage.getPriceForItem(1);
        assertTrue(firstItemPrice.equals("207.00"));
    }

    @Test
    public void countSearchResultsAndAssertLastPrice(){
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.enterSearchItem("iPad");
        AmazonSearchResultPage amazonSearchResultPage = amazonHomePage.clickGo();
        int resultCount = amazonSearchResultPage.getResultListSize();
        System.out.println("Total number of results : "+resultCount);
        String lastItemPrice = amazonSearchResultPage.getResultItem(resultCount).getPrice();
        assertTrue(lastItemPrice.equals("3.99"), "Actual Price: £"+lastItemPrice);
    }



}
