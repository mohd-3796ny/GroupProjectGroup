package page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ApplicationPageBase {
    @FindBy(className = "icon-account")
    private WebElement logInIcon;

    @FindBy(id = "customer_email")
    private WebElement emailBox;

    @FindBy(id = "customer_password")
    private WebElement passwordBox;

    @FindBy(css = "#customer_login > input.btn.action_button")
    private WebElement signInButton;

    @FindBy(css = "#customer_login > div > ul > li")
    private WebElement verfiyInvalidLogin;

    @FindBy(className = "collection_title")
    private WebElement verifyValidLogin;


    public void InvalidLogIn() {
        click(logInIcon, "logInIcon");
        sendKeys(emailBox, "email", "sesire@gmail.com");
        sendKeys(passwordBox, "password", "islam");
        click(signInButton, "signInButton");

    }

    public void ValidLogIn() {
        click(logInIcon, "logInIcon");
        sendKeys(emailBox, "email", "sesire22@gmail.com");
        sendKeys(passwordBox, "password", "sesire22");
        click(signInButton, "signInButton");
    }


    public LoginPage login(String email, String password) {
        click(logInIcon, "logInIcon");
        sendKeys(emailBox, "emailBox", email);
        sendKeys(passwordBox, "passwordBox",password);
        click(signInButton, "submitButton");

        return new LoginPage();

    }


    public String getErrorMessage() {

        String actualText = getText(verfiyInvalidLogin, "errorMessage");

        return actualText;
    }

    public String verifyInvalidLogIn() {

        String actualText = getText(verfiyInvalidLogin, "verifyInvalidLogin");

        return actualText;
    }

    public String verifyValidLogin() {

        String loginText = getText(verifyValidLogin, "validVerification");

        return loginText;
    }

    ///For google sheet API Data
    public LoginPage getLogInPage() {

        logInIcon.click();
        return new LoginPage();

    }
}
