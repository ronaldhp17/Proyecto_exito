package co.com.choucair.certificatio.exito.tasks;

import co.com.choucair.certificatio.exito.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenCart implements Task {


    public static OpenCart cart() {
        return Tasks.instrumented(OpenCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OpenCartPage.OPEN_CART));
    }
}
