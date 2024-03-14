package co.com.choucair.certificatio.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenCartPage extends PageObject {
    public static final Target OPEN_CART = Target.the("open the cart").
            located(By.xpath("//*[@id=\"__next\"]/header/section/div/div[2]/div[2]/button/div"));
}
