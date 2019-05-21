package test.page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.object.SearchTextPage;

public class SearchTextPageTest extends ApplicationPageBase {
    SearchTextPage objOfSearchPage=null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfSearchPage = PageFactory.initElements(driver, SearchTextPage.class);
    }

    @Test
    public void searchBarTest(){
        objOfSearchPage.searchBar();
        Assert.assertEquals(objOfSearchPage.verifySearchPage(),"Search");


    }
}
