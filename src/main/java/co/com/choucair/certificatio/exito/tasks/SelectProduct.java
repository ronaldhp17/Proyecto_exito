package co.com.choucair.certificatio.exito.tasks;

import co.com.choucair.certificatio.exito.userinterfaces.SelectProductPage;
import co.com.choucair.certificatio.exito.userinterfaces.SelectInfoProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;
import java.util.Random;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectProduct implements Task {
    private String[][] productMatrix = new String[5][3];

    public static SelectProduct selectProduct() {
        return Tasks.instrumented(SelectProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int min = 1;
        int maxSelectProduct = 15;
        int maxCantProduct = 9;
        ArrayList<Integer> prevProductNumb = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int numberProductRandom;
            int productQuantity;

            Random random = new Random();
            numberProductRandom = min + random.nextInt((maxSelectProduct - min) + 1);
            productQuantity = min + random.nextInt((maxCantProduct - min) + 1);

            System.out.println("producto seleccionaddo: " + numberProductRandom);
            System.out.println("Cantidad del producto seleccionado: " + productQuantity);

            if (prevProductNumb.contains(numberProductRandom)) {
                i = i - 1;
                continue;
            } else {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                actor.attemptsTo(
                        WaitUntil.the(SelectProductPage.SELECT_PRODUCTS.of(String.valueOf(numberProductRandom)), isCurrentlyEnabled()),
                        DoubleClick.on(SelectProductPage.SELECT_PRODUCTS.of(String.valueOf(numberProductRandom)))
                );
                for (int j = 0; j < productQuantity; j++) {
                    actor.attemptsTo(
                            Click.on(SelectProductPage.BUTTON_PLUS.of(String.valueOf(numberProductRandom)))
                    );
                }
            }
            productMatrix[i][0] = SelectInfoProductPage.NAME_PRODUCT.of(String.valueOf(numberProductRandom)).resolveFor(actor).getAttribute("title");
            productMatrix[i][1] = SelectInfoProductPage.PRICE_PRODUCT.of(String.valueOf(numberProductRandom)).resolveFor(actor).getTextContent();
            productMatrix[i][2] = String.valueOf(productQuantity + 1);

            prevProductNumb.add(numberProductRandom);
        }
        actor.remember("productInformation", productMatrix);
    }
}
