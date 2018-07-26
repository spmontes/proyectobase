package co.com.bancolombia.certification.consultActions.runners;
 
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features="src/test/resources/features/Consult_Commercial_Action.feature",
    glue = {"co.com.bancolombia.certification.consultActions.definitions"},
    snippets = SnippetType.CAMELCASE)

public class ConsultCommercialActionRunner {

}
