package application.page.base;

import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationPageBase extends CommonAPI {
    public static boolean isEnableStatus(WebDriver driver, WebElement web){
        boolean en = web.isEnabled();
        return en;
    }

    public static void sendKeys(WebElement webElement, String webElementName, String keys){
        webElement.clear();
        TestLogger.log("Sending " + keys + "to" + webElementName);
        webElement.sendKeys(keys);
        TestLogger.log("Keys sent to" + webElementName);
    }
    public static String getText(WebElement webElement, String webElementName){

        TestLogger.log("Getting Text from " + webElementName);
        String actualText = webElement.getText();
        TestLogger.log("Actual text" + actualText);
        return actualText;
    }
    public static void click(WebElement webElement, String webElementName){
        TestLogger.log("Click" + webElementName);
        webElement.click();
        TestLogger.log("Clicked" + webElementName);
    }
   public static Properties loadProperties() throws IOException{
        Properties prop = new Properties();
        File filepath = new File("(user.dir)" + "/Users/tawhidurislam/selenium/WebAutomation-Feb/WatchOutFitter/Extent-Report");
       InputStream ism = new FileInputStream(filepath.getAbsoluteFile());
        prop.load(ism);
        ism.close();
        return prop;

    }
}
