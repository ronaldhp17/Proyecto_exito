package co.com.choucair.certificatio.exito.tasks;

import co.com.choucair.certificatio.exito.userinterfaces.SelectSubcategoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class SearchSubcategory implements Task {


    public static SearchSubcategory selectSubCategory() {
        return Tasks.instrumented(SearchSubcategory.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectSubcategoryPage.SELECT_SUBCATEGORY),
                Scroll.to(SelectSubcategoryPage.SECTION_SOLD_BY),
                WaitUntil.the(SelectSubcategoryPage.SECTION_SOLD_BY,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SelectSubcategoryPage.SECTION_SOLD_BY),
                Click.on(SelectSubcategoryPage.SELECT_SELL),
                Click.on(SelectSubcategoryPage.APPLY_FILTERS)
        );
    }
}
