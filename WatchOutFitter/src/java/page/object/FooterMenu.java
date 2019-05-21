package page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterMenu extends ApplicationPageBase {
    @FindBy(xpath = "//p[@class='message']")
    private WebElement verifyThankYoutText;

    @FindBy(xpath = "//a[@title='FAQs']")
    private WebElement faqLink;

    @FindBy(id = "why-is-my-tracking-number-not-updating-online-question")
    private WebElement link1;

    @FindBy(id = "how-long-does-shipping-take-question")
    private WebElement link2;

    @FindBy(id = "orders-with-incorrect-address-information-question")
    private WebElement link3;

    @FindBy(xpath = "//h1[contains(text(),'Help Center')]")
    private WebElement faqPageVerification;

    @FindBy(xpath = "//a[contains(text(),'Search')]")
    private WebElement searchLink;

    @FindBy(xpath = "//p[@class='quote']")
    private WebElement verifySearchLink;

    @FindBy(xpath = "//a[@title='Gift Cards']")
    private WebElement giftCardLink;

    @FindBy(xpath = "//a[@href='/collections/all']")
    private WebElement continueShoppingLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-collection-template\"]/div[2]/h1")
    private WebElement verification;

    @FindBy(xpath = "//p[@class='quote']")
    private WebElement verifyGiftCardLink;


    @FindBy(xpath = "//a[@title='About us']")
    private WebElement aboutUsLink;

    @FindBy(className = "collection_title")
    private WebElement verifyAboutUsLink;

    @FindBy(xpath = "//a[@title='Contact us']")
    private WebElement contactUsLink;

    @FindBy(className = "collection_title")
    private WebElement verifyContactUsLink;

    @FindBy(xpath = "//a[@title='Privacy policy']")
    private WebElement privacyPolicyLink;

    @FindBy(className = "collection_title")
    private WebElement verifyPrivacyPolicyLink;

    @FindBy(xpath = "//a[@title='Refund Policy']")
    private WebElement refundPolicyLink;

    @FindBy(className = "collection_title")
    private WebElement verifyRefundPolicyLink;


    public void faqLink () {
        click(faqLink, "helpCenterLink");
        click(link1, "Link1");
        click(link2, "Link2");
        click(link3, "Link3");
    }

    public void giftCardLink() {
        click(giftCardLink, "giftCardLink");
        continueShoppingLink.click();

    }

    public void searchLink() {
        click(searchLink, "searchLink");

    }
    public String getFaqPageVerification() {
        String faqText = getText(faqPageVerification, "faqVerification");

        return faqText;
    }
    public String giftCardVerification() {
        String giftText = getText(verification, "GiftPageVerification");

        return giftText;
    }
    public String searchLinkVerification() {
        String searchText = getText(verifySearchLink, "searchLinkVerification");

        return searchText;
    }
}
