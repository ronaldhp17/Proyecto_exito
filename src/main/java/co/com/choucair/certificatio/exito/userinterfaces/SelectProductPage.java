package co.com.choucair.certificatio.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;


public class SelectProductPage extends PageObject {
    public static final Target SELECT_PRODUCTS = Target.the("select dinamic product").
            locatedBy("//*[@id=\"__next\"]/main/section[3]/div/div[2]/div[2]/div[2]/ul/li[{0}]/article/section/div[2]/div[2]/button");
    public static final Target BUTTON_PLUS = Target.the("add more of some product").
            locatedBy("//*[@id=\"__next\"]/main/section[3]/div/div[2]/div[2]/div[2]/ul/li[{0}]/article/section/div[2]/div[2]/div/button[2]");

}
