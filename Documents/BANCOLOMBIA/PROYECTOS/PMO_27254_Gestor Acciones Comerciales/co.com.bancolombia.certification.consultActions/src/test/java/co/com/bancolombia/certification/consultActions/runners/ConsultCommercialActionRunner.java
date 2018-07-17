package co.com.bancolombia.certification.consultActions.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features="src/test/resources/features/Consult_Commercial_Action.feature",
    glue="co.com.qvision.google.stepdefinitions",
    snippets = SnippetType.CAMELCASE
)

public class ConsultCommercialActionRunner {

}
