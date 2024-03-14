package co.com.choucair.certificatio.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectInfoProductPage extends PageObject {
    public static final Target NAME_PRODUCT = Target.the("obtain the name product").
            locatedBy("//*[@id=\"__next\"]/main/section[3]/div/div[2]/div[2]/div[2]/ul/li[{0}]/article/section/div[1]/div/h3/a");
    public static final Target PRICE_PRODUCT = Target.the("obtain the price product").
            locatedBy("//*[@id=\"__next\"]/main/section[3]/div/div[2]/div[2]/div[2]/ul/li[{0}]/article/section/div[2]/div[1]/div/div[1]/div/p");
    public static final Target QUANTITY_PRODUCT = Target.the("obtain the quantity of product").
            locatedBy("//*[@id=\"__next\"]/main/section[3]/div/div[2]/div[2]/div[2]/ul/li[1]/article/section/div[2]/div[2]/div/div/p");
}
