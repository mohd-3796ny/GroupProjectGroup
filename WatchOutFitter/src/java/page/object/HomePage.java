package page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends ApplicationPageBase {
    @FindBy(xpath = "//a[contains(@class,'top-link')][contains(text(),'Brand')]")
    private WebElement brandLink;

    @FindBy(className = "collection_title")
    private WebElement verifyBrandLink;

    @FindBy(className = "icon-account")
    private WebElement logInIcon;

    @FindBy(className = "collection_title")
    private WebElement verifyLogInIconPage;

    @FindBy(xpath = "//a[@href='/collections']")
    private WebElement shopHoverOverMenu;

    @FindBy(xpath = "//a[@href='/collections/wooden-watches-1']")
    private WebElement woodwatches;

    @FindBy(xpath = "//h1[@class='collection_title']")
    private WebElement productVerification;

    @FindBy(xpath = "//a[contains(@class,'top-link')][contains(text(),'Contact Us')]")
    private WebElement contactUsButton;

    @FindBy(className = "collection_title")
    private WebElement verifyContactUsLink;

    @FindBy(xpath = "//span[@class='js-social-icons']//li[@class='email']")
    private WebElement emailIcon;

    @FindBy(xpath = "//a[@id='search-toggle']")
    private WebElement searchIcon;

    @FindBy(xpath = "//a[@class='icon-cart cart-button']//span[contains(text(),'Cart')]")
    private WebElement shoppingCartIcon;

    @FindBy(xpath = "//a[@class='mm-subclose continue']")
    private WebElement verifyShoppingCartLink;

    @FindBy(xpath = "//a[contains(text(),'Shop now')]")
    private WebElement shopNowActionButton;

    @FindBy(xpath = "//h1[contains(text(),'Best sellers')]")
    private WebElement verifyShopNowButton;

    @FindBy(xpath = "//span[contains(text(),'Quarta')]")
    private WebElement quartaWatch;

    @FindBy(partialLinkText = "Gift Cards")
    private WebElement giftCardsLink;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[1]")
    private List<WebElement> dm;

    @FindBy(xpath = "//span[@class='arrow']")
    private WebElement hovover;

    public void clickingBrandLink() {
        click(brandLink, "brandLink");

    }

    public void clickingContactUsLink() {

        click(contactUsButton, "contactUsButton");
    }

    public void selectingFromShopMenu() throws InterruptedException {
        shopHoverOverMenu.click();
        click(woodwatches, "luxuryWoodenWatches");
        Thread.sleep(3000);
        driver.navigate().back();
    }

    public void shopHoverOverMenu() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.moveToElement(hovover).build().perform();

        for (int i = 0; i < dm.size(); i++) {
            String tittles = dm.get(i).getText();
            System.out.println(tittles);
        }
        for (WebElement titles : dm) {
            System.out.println(titles.getText());
        }
    }

    //// AssertionsMethods for verification


    public String  verifyBrandLink() {
        String actualText=getText(verifyBrandLink,"BrandPageVerification");

        return actualText;
    }

    public String verifyContactUsLink() {
        String contactUsText=getText(verifyContactUsLink,"contactUsVerification");

        return contactUsText;
    }

    public String verifyShopMenu(){
        String actualText= getText(productVerification,"productVerification");
        return actualText;
    }

}
