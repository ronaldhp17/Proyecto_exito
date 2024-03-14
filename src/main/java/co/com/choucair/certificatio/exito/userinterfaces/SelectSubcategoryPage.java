package co.com.choucair.certificatio.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectSubcategoryPage extends PageObject {
    public static final Target SELECT_SUBCATEGORY= Target.the("select subcategory").
            located(By.xpath("//*[@id=\"column-1\"]/li[2]/div/a"));
    public static final Target SECTION_SOLD_BY = Target.the("show sellers").
            located(By.id("desktop-store-filter-button--4"));

    public static final Target SELECT_SELL = Target.the("select the seller").
            located(By.id("desktop-store-filter-Vendido por-Éxito"));

    public static final Target APPLY_FILTERS = Target.the("Click on aplicar filtros").
            located(By.xpath("//*[@id=\"__next\"]/main/section[3]/div/div[1]/div[2]/button"));
}
