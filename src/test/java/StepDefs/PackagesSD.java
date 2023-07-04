package StepDefs;
import Pages.PackagesLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PackagesSD {

    PackagesLogic obj = new PackagesLogic();

    @Given("I am user navigated to STCtv website")
    public void iAmUserNavigatedToSTCtvWebsite() {
        obj.validateHomePageOpened();
    }

    @When("User on subscriptions page for SA")
    public void userOnSubscriptionsPageForSA() {
        obj.validatePlansViewed();
    }

    @Then("User can see {string} of plans options")
    public void userCanSeeOfPlansOptions(String Types) {
        obj.validateTypeTitle(Types);
    }

    @Then("User can see {string} of each {string}")
    public void userCanSeeOfEach(String Prices, String Types) {
        obj.validatePricesAndCurrency(Prices,Types);
    }

    @And("User clicks on Select Your Country menu")
    public void userClicksOnSelectYourCountryMenu() {
        obj.clickOnSelectYourCountryMenu();
    }

    @And("User can see {string} {string} and {string} options")
    public void userCanSeeAndOptions(String Kuwait, String BH, String SA) {
        obj.validateCountries(Kuwait,BH,SA);
    }

    @Then("User can see {string} of plans options for each {string}")
    public void userCanSeeOfPlansOptionsForEach(String Types, String arg1) {
    }

    @And("User navigated to {string} country")
    public void userNavigatedToCountry(String country) {
        obj.validateForEachCountries(country);
    }

    @Then("User can see {string} currency")
    public void userCanSeeCurrency(String country) {
        obj.validateOnCurrency(country);
    }
}
