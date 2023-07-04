package Pages;

import Core.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PackagesPO extends PageObjectBase {

    By chooseYourPlanPO= By.className("mobile-hidden");
    By bodyOfHomePage= By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div/h2/b");
    By descriptionOfHomePage= By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div/h2/span/span");
    By liteTitle= By.id("name-lite");
    By classicTitle= By.id("name-classic");
    By premiumTitle= By.id("name-premium");
    By selectYourCountyButton= By.className("country-current");
    By selectYourCountyTitle= By.id("country-title");
    By kuwaitPO= By.id("kw");
    By BHPO= By.id("bh");
    By SAPO= By.id("sa");
    By currency= By.xpath("//i[text()]");
}