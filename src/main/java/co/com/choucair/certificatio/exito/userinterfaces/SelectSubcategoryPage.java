package co.com.choucair.certificatio.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectSubcategoryPage extends PageObject {
    public static final Target SELECT_SUBCATEGORY= Target.the("select subcategory").
            located(By.xpath("//*[@id=\"column-1\"]/li[1]/div/a"));
}
