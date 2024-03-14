package co.com.choucair.certificatio.exito.questions;

import co.com.choucair.certificatio.exito.userinterfaces.SelectInfoCartPage;
import co.com.choucair.certificatio.exito.userinterfaces.SelectInfoProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateNameProduct implements Question<Boolean> {

    private boolean answer;
    private String[][] productMatrix;

    public static ValidateNameProduct theNameProduct() {
        return new ValidateNameProduct();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        for (int i = 0; i < 5; i++) {
            productMatrix = actor.recall("productInformation");
            answer = SelectInfoCartPage.PRODUCT_NAME.of(String.valueOf(i+1)).resolveFor(actor).getTextContent().contains(productMatrix[i][0]);
        }

        return answer;
    }
}
