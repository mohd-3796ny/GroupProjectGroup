package test.page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.object.LoginPage;

import java.io.File;

public class LoginPageTest extends ApplicationPageBase {
    LoginPage objOfLoginPage = null;


    @BeforeMethod
    public void initializationOfElements() {
        objOfLoginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void InvalidLoginTest() {
        objOfLoginPage.InvalidLogIn();
        objOfLoginPage.verifyInvalidLogIn();

    }
    @Test
    public void ValidLogInTest() {
        objOfLoginPage.ValidLogIn();
        objOfLoginPage.verifyValidLogin();

    }




//    @DataProvider(name = "DP")
//    public Object[][] getTestData() throws Exception {
//        File filepath = new File(System.getProperty("user.dir") +  "/Users/tawhidurislam/selenium/WebAutomation-Feb/WatchOutFitter/src/java/testData/TestData");
//        MyDataReader dr = new MyDataReader();//
//        //Show me where is data file
//        dr.setExcelFile(filepath.getAbsolutePath());
//        String[][] data = dr.getExcelSheetData("Sheet3");
//        return data;
//    }

    @Test(dataProvider = "DP")
    public void invalidSignIn(String email, String password,String expectedErrorMessage) throws InterruptedException {
        objOfLoginPage.getLogInPage();
        objOfLoginPage.login(email, password);
        String errorMessage=   expectedErrorMessage;
        String actualText= objOfLoginPage.getErrorMessage();
        Assert.assertEquals(actualText,expectedErrorMessage);


    }
}
