package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class PageObjectBase {

    public WebDriver driver;
    public PageObjectBase() {
        this.driver = Hooks.getDriver();
    }

    public void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public By getDynamicPath(String element, String packageName){
        By tempPath =  By.id(element + "-" + packageName);
        return tempPath;
    }

}
