package co.com.choucair.certificatio.exito.stepdefinitions;

import co.com.choucair.certificatio.exito.tasks.SearchCategory;
import co.com.choucair.certificatio.exito.tasks.OpenPage;
import co.com.choucair.certificatio.exito.tasks.SearchProduct;
import co.com.choucair.certificatio.exito.tasks.SearchSubcategory;
import co.com.choucair.certificatio.exito.utils.SelectRandomProduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.util.ElementScanner9;
import java.util.List;

public class ExitoStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("than I enters the exito page")
    public void thanIEntersTheExitoPage() {
        OnStage.theActorCalled("ronald").wasAbleTo(OpenPage.thePage());
    }

    @Given("select a category")
    public void selectACategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCategory.selectCategory());
    }

    @Given("select a subcategory")
    public void selectASubcategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchSubcategory.selectSubCategory());
    }

    @When("randomly selects five products")
    public void randomlySelectsFiveProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchProduct.selectProduct());
    }

    @Then("the name of the aggregated products are equeals in the cart")
    public void theNameOfTheAggregatedProductsAreEquealsInTheCart() {
    }

    @Then("The total of the prices of the products added should be the same as in the cart")
    public void theTotalOfThePricesOfTheProductsAddedShouldBeTheSameAsInTheCart() {

    }

    @Then("The quantities of the products added must be the same as in the cart")
    public void theQuantitiesOfTheProductsAddedMustBeTheSameAsInTheCart() {

    }

    @Then("The number of products added must be the same as in the cart")
    public void theNumberOfProductsAddedMustBeTheSameAsInTheCart() {

    }

}
