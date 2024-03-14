package co.com.choucair.certificatio.exito.stepdefinitions;

import co.com.choucair.certificatio.exito.questions.ValidateNameProduct;
import co.com.choucair.certificatio.exito.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

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
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.selectProduct());
    }

    @Then("the name of the aggregated products are equeals in the cart")
    public void theNameOfTheAggregatedProductsAreEquealsInTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenCart.cart());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateNameProduct.theNameProduct()));
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
