package co.com.choucair.certificatio.exito.tasks;

import co.com.choucair.certificatio.exito.userinterfaces.SelectCategoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SearchCategory implements Task {

    public static SearchCategory selectCategory() {
        return Tasks.instrumented(SearchCategory.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectCategoryPage.CLOSE_AD),
                Click.on(SelectCategoryPage.CATEGORIES),
                MoveMouse.to(SelectCategoryPage.SELECT_CATEGORY));
    }
}
