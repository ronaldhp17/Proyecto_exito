package co.com.choucair.certificatio.exito.tasks;

import co.com.choucair.certificatio.exito.userinterfaces.SelectProductPage;
import co.com.choucair.certificatio.exito.utils.SelectRandomProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SearchProduct implements Task {
    private String[][] productMatrix = new String[5][3];

    public static SearchProduct selectProduct() {
        return Tasks.instrumented(SearchProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i <= 1; i++) {
            int min = 1;
            int max = 47;
            int numberRandom;
            int count;

            Random random = new Random();
            numberRandom = min + random.nextInt((max - min) + 1);
            actor.attemptsTo();
        }
    }
}
