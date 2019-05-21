package page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchTextPage extends ApplicationPageBase {

    @FindBy(id = "search-toggle")
    private WebElement searchIcon;

    @FindBy(xpath = "//input[contains(@placeholder,'Search Watch Outfitters...')]")
    private WebElement searchTextBox;

    @FindBy(xpath = "//span[contains(@class,'icon-search search-submit')]")
    private WebElement searchButton;

    @FindBy(xpath = "//a[contains(text(),'Next »')]")
    private WebElement nextButton;

    @FindBy(className = "collection_title ")
    private WebElement verifySearchPage;


    public void searchBar() {
        click(searchIcon, "searchIcon");
        sendKeys(searchTextBox, "searchTextBox", "watches");
        click(searchButton, "searchButton");
        click(nextButton,"nextButton");
    }
    public String verifySearchPage(){
        String searchText= getText(verifySearchPage,"searchPageVerification");


        return searchText;

    }
}
