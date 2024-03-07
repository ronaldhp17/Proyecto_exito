package co.com.choucair.certificatio.exito.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/exito.feature",
        tags = "@stories",
        glue = "co.com.choucair.certificatio.exito.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ExitoRunner {
}
