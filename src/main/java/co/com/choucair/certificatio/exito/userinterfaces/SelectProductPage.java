package co.com.choucair.certificatio.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SelectProductPage extends PageObject {
    public static final Target SELECT_PRODUCTS = Target.the("list of products").
            located(By.xpath("//*[@id=\"__next\"]/main/section[6]/div/div[2]/div[2]/div[2]/ul/li[{0}]/article/section/div[2]/div[2]/button"));
}
