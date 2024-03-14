package co.com.choucair.certificatio.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectCategoryPage extends PageObject {

    public static final Target CLOSE_AD = Target.the("close AD").
            located(By.xpath("//*[@id=\"wps-overlay-close-button\"]"));
    public static final Target CATEGORIES = Target.the("show all categories").
            located(By.xpath("//*[@id=\"__next\"]/header/section/div[1]/div[1]/button"));
    public static final Target SELECT_CATEGORY = Target.the("select category").
            located(By.xpath("//*[@id=\"__next\"]/header/aside/ul/section[2]/div/li[12]/div/div/p"));
}
