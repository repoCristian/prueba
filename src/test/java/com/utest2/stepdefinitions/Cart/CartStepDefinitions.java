package com.utest2.stepdefinitions.Cart;


//import com.utest2.questions.CartQuestions;
//import com.utest2.tasks.EnterInfo;
import com.utest2.tasks.GoTo;
//import com.utest2.tasks.cart.CartProductsSelect;
import com.utest2.tasks.cart.CartProductsSelect;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;


public class CartStepDefinitions {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the {} has opened URL")
    public void  givenThatUserHasOpenedWebsite(String actorName){
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }

    @When("the user enter first product and adds it to the cart")
    public void theUserEnterFirstProductAndAddsItToTheCart(DataTable data){
        theActorInTheSpotlight().attemptsTo(CartProductsSelect.Items(data));
    }

    @And("the user enter second product and adds it to the cart")
    public void theUserEnterSecondProductAndAddsItToTheCart(DataTable data){
        theActorInTheSpotlight().attemptsTo(CartProductsSelect.Items(data));
    }

/*
    @Then("user should in the car section 2 products")
    public void thenUserShouldInTheCarSection2Products(){
        theActorInTheSpotlight().should(seeThat(CartQuestions.numberItems(),is(2)));
    }
*/
}