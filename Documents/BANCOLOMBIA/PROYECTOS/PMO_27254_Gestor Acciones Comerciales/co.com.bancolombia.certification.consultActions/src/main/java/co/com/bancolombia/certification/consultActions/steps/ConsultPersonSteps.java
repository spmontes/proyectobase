package co.com.bancolombia.certification.consultActions.steps;

import static net.serenitybdd.rest.RestRequests.when;
import static net.serenitybdd.rest.SerenityRest.then;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Step;

public class ConsultPersonSteps {
	private  String api;
	
	@Step("Given the  REST API for person information")
		public void withPersonUrl() {
			api = "https://reqres.in/api/users/{person}";
	}

	
	@Step("When Get {0} information for api")
	public void getInformationPerson(int person) {
		when().get(api, person);
	}
	
	@Step("Then status code is  {0}")
	public void responseStatusCode(int statusCode) {
		then().statusCode(statusCode);		
	}
}
