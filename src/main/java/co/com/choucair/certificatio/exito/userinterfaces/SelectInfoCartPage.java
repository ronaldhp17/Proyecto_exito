package co.com.choucair.certificatio.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class SelectInfoCartPage extends PageObject {
    public static final Target PRODUCT_NAME = Target.the("name of product").
            locatedBy("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div[2]/div[{0}]/div/div[4]/span");
    public static final Target QUANTITY_FOR_PRODUCT = Target.the("aggregate quantity of each product").
            locatedBy("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div[2]/div[{0}]/div/div[6]/div/div/div/div/span[1]");
    public static final Target PRODUCT_QUANTITY = Target.the("number of products added").
            locatedBy("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div[2]");
    public static final Target PRICE_PRODUCT_CART = Target.the("price of the product on the cart").
            locatedBy(" //*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div[2]/div[{0}]/div/div[5]/div/span");
}
