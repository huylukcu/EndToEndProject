package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DrApptStepDefs {
    @Given("user given api {string}")
    public void user_given_api(String string) {
        Response response = given().when().get("endpoint");
        response.prettyPrint();

    }
    @When("user sends a Get request to {string}")
    public void user_sends_a_get_request_to(String string) {

    }
    @Then("user validates {string}{string}, {string}, {string}, {string}")
    public void user_validates(String string, String string2, String string3, String string4, String string5) {

    }
}
