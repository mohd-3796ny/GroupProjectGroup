package test.page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.object.HomePage;

public class HomePageTest extends ApplicationPageBase {

    HomePage objOfHomePage = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void brandLinkTest() {
        objOfHomePage.clickingBrandLink();
        Assert.assertEquals(objOfHomePage.verifyBrandLink(),"ABOUT US");
    }

    @Test
    public void contactUsLinkTest() {
        objOfHomePage.clickingContactUsLink();
        Assert.assertEquals(objOfHomePage.verifyContactUsLink(),"Contact Us");

    }


    @Test
    public void shopHoverOverMenuTest() throws InterruptedException {
        objOfHomePage.shopHoverOverMenu();
    }

    @Test
    public void selectingFromMenuTest() throws InterruptedException {
        objOfHomePage.selectingFromShopMenu();
        Assert.assertEquals(objOfHomePage.verifyShopMenu(),"PRODUCT COLLECTIONS");

    }
}
