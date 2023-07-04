package Core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private static WebDriver driver;

    @BeforeAll()
    public static void setup(){
        driver = WebFactory.createChromeWebDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://subscribe.stctv.com/sa-en");
    }

    public static WebDriver getDriver(){
        return driver;
    }

    /*public static void navigateToURL(){
        driver.navigate().to("https://subscribe.stctv.com/sa-en");
    }

    @After
    public static void quit(){
        driver.quit();
    }
     */
}