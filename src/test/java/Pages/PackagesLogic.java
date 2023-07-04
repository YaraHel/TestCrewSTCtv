package Pages;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class PackagesLogic extends PackagesPO{

    public void validateHomePageOpened(){
        waitForVisibility(driver.findElement(chooseYourPlanPO));
        System.out.println(driver.findElement(chooseYourPlanPO).getText());
    }

    public void validatePlansViewed(){
        waitForVisibility(driver.findElement(bodyOfHomePage));
        System.out.println(driver.findElement(bodyOfHomePage).getText());
        waitForVisibility(driver.findElement(descriptionOfHomePage));
        System.out.println(driver.findElement(descriptionOfHomePage).getText());
    }

    /*public void validateTypeTitle(String Title) {
        switch (Title){
            case "LITE":
                Assertions.assertEquals(Title,driver.findElement(liteTitle).getText());
                System.out.println(driver.findElement(liteTitle).getText());
                break;
            case "CLASSIC":
                Assertions.assertEquals(Title,driver.findElement(classicTitle).getText());
                System.out.println(driver.findElement(classicTitle).getText());
                break;
            case "PREMIUM":
                Assertions.assertEquals(Title,driver.findElement(premiumTitle).getText());
                System.out.println(driver.findElement(premiumTitle).getText());
                break;
            default:
                break;
         }
    }
     */
    public void validateTypeTitle(String Title) {
        Assertions.assertEquals(Title.toUpperCase(),driver.findElement(getDynamicPath("name",Title)).getText());
        System.out.println(driver.findElement(getDynamicPath("name",Title)).getText());
    }

    public void validatePricesAndCurrency(String prices, String types) {
        Assertions.assertEquals(prices,driver.findElement(getDynamicPath("currency",types)).getText());
        System.out.println(driver.findElement(getDynamicPath("currency",types)).getText());
    }

    public void clickOnSelectYourCountryMenu() {
        waitForVisibility(driver.findElement(selectYourCountyButton));
        driver.findElement(selectYourCountyButton).click();
        driver.findElement(selectYourCountyTitle).isDisplayed();
    }

    public void validateCountries(String  Kuwait, String BH, String SA) {
        waitForVisibility(driver.findElement(selectYourCountyTitle));
        Assertions.assertEquals(Kuwait,driver.findElement(kuwaitPO).getText());
        Assertions.assertEquals(BH,driver.findElement(BHPO).getText());
        Assertions.assertEquals(SA,driver.findElement(SAPO).getText());
    }

    public List<WebElement> numbersOfCountries(){
        return driver.findElements(By.xpath("//a[contains(@class, 'country')]"));
    }

    public void validateForEachCountries(String country) {
        for (int i = 0; i< numbersOfCountries().size();i++){
            System.out.println(numbersOfCountries().size());
            if(country.equals(numbersOfCountries().get(i).getText())){
                waitForVisibility(numbersOfCountries().get(i));
                System.out.println(numbersOfCountries().get(i).getText());
                numbersOfCountries().get(i).click();}
        }
    }

    public void validateOnCurrency(String country) {
        switch (country){
            case "KSA":
                Assertions.assertTrue(driver.findElement(currency).getText().contains("SAR"));
                System.out.println(driver.findElement(currency).getText());
                break;
            case "Kuwait":
                Assertions.assertTrue(driver.findElement(currency).getText().contains("KWD"));
                System.out.println(driver.findElement(currency).getText());
                break;
            case "Bahrain":
                Assertions.assertTrue(driver.findElement(currency).getText().contains("BHD"));
                System.out.println(driver.findElement(currency).getText());
                break;
            default:
                break;
        }
    }

    /*public void validateForEachCountries(String country) {
        driver.findElement(kuwaitPO).click();
    }

     */

}
