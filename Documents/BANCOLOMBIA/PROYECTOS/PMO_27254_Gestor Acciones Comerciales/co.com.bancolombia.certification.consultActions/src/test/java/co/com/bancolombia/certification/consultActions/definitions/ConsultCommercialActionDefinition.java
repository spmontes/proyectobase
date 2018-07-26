package co.com.bancolombia.certification.consultActions.definitions;

import co.com.bancolombia.certification.consultActions.steps.ConsultPersonSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConsultCommercialActionDefinition {
	
	@Steps
	ConsultPersonSteps personSteps;
	
	@Given("^I have visited the consultation service$")
	public void visitedConsultationService() throws Exception{
		personSteps.withPersonUrl();
	}
	
	@When("^Get (.\\d*) information for api$") 
	public void getPersonInformationForApi(int person) throws Exception{
		personSteps.getInformationPerson(person);
	}
	
	@Then("^status code is (.\\d*)$")
	public void verifyStatusCode(int statusCode){
		personSteps.responseStatusCode(statusCode);
	}
	  

}
