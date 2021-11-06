package co.com.automatizacion.iframe.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validacion_iframe.feature",
        glue = "co.com.automatizacion.iframe.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)


public class RunnerTags {
}
