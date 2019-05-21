package test.page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.object.FooterMenu;

public class FooterMenuTest extends ApplicationPageBase {

    FooterMenu objOfFooterMenu = null;

    @BeforeMethod
    public void initializationOfElements(){

        objOfFooterMenu = PageFactory.initElements(driver, FooterMenu.class);
    }


    @Test
    public void faqLinkTest() {
        objOfFooterMenu.faqLink();
        Assert.assertEquals(objOfFooterMenu.getFaqPageVerification(),"HELP CENTER");

    }

    @Test
    public void giftCardLinkTest() {
        objOfFooterMenu.giftCardLink();
        Assert.assertEquals(objOfFooterMenu.giftCardVerification(),"PRODUCTS");

    }

    @Test
    public void searchLinkTest() {
        objOfFooterMenu.searchLink();
        Assert.assertEquals(objOfFooterMenu.searchLinkVerification(),"SEARCH FOR ANYTHING IN OUR SHOP.");
    }

}
