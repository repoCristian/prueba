package com.utest2.tasks.cart;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.HitElement;
import org.openqa.selenium.Keys;


import java.util.List;
import java.util.Map;

import static com.utest2.ui.CartUi.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CartProductsSelect implements Task {

    private DataTable data;
    public CartProductsSelect(DataTable data){
        this.data=data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);

        actor.attemptsTo(
                /*
                Click.on(BTN_UNO),
                Click.on(BTN_DOS),
                WaitUntil.the(BTN_cart,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_cart),
                Click.on(BTN_checkout),
                */
                Click.on(FIRST_PRODUCT),
                Click.on(FIRST_AMOUNT),
                Hit.the(Keys.DELETE).into(FIRST_AMOUNT),
                Enter.theValue(values.get(0).get("Amount2")).into(FIRST_AMOUNT),
                Click.on(ADD_CART),
                Click.on(RETURN_MENU),
                Click.on(SECOND_PRODUCT),
                Click.on(SECOND_AMOUNT),
                Hit.the(Keys.DELETE).into(SECOND_AMOUNT),
                Enter.theValue(values.get(0).get("Amount5")).into(FIRST_AMOUNT),
                Click.on(ADD_CART)
//                Enter.theValue(values.get(0).get("Lastname")).into("//input[@data-test='lastName']"),
//                Enter.theValue(values.get(0).get("Zipcode")).into("//input[@name='postalCode']"),
//                Click.on(BTN_continue)

        );

    }
    public static CartProductsSelect Items(DataTable data){
        return Tasks.instrumented(CartProductsSelect.class,data);
    }
}
