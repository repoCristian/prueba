package com.utest2.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUi {
    public static final Target FIRST_PRODUCT= Target.the("first").locatedBy("//h2[contains(text(),'Évora – 24 rosas')]");
    public static final Target FIRST_AMOUNT= Target.the("first_amount").locatedBy("//input[@class='input-text qty text']");
    public static final Target ADD_CART= Target.the("add_cart").locatedBy("//button[contains(text(),'Añadir al carrito')]");
    public static final Target RETURN_MENU = Target.the("return_menu").locatedBy("//div[@class='header-logo']");
    public static final Target SECOND_PRODUCT = Target.the("second").locatedBy("//h2[contains(text(),'Caja Agata – 24')]");
    public static final Target SECOND_AMOUNT = Target.the("second_amount").locatedBy("//input[@class='input-text qty text']");


}


