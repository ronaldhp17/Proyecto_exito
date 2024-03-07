package co.com.choucair.certificatio.exito.tasks;

import co.com.choucair.certificatio.exito.userinterfaces.SelectSubcategoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchSubcategory implements Task {


    public static SearchSubcategory selectSubCategory() {
        return Tasks.instrumented(SearchSubcategory.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectSubcategoryPage.SELECT_SUBCATEGORY));
    }
}
