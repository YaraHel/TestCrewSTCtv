package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class WebFactory {


    public static WebDriver createChromeWebDriver() {
        WebDriverManager.chromedriver().reset();
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
