package StepDefinition;

import java.io.IOException;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javaFunctionality.Merchante_User_Functionality;

public class Merchante_User_StepDef {
	Merchante_User_Functionality MerchteUser;

	public Merchante_User_StepDef(TestContext context) {
		MerchteUser = new Merchante_User_Functionality(context);
	}

	@Given("user Lauch the application url {string} and verfiy page title")
	public void user_lauch_the_application_url_and_verfiy_page_title(String url) throws IOException {
		MerchteUser.lauchURl(url);
		MerchteUser.landingpage();
	}

	@And("user click on user button")
	public void user_click_on_user_button() {
		MerchteUser.User_Menu_click();
	}

	@And("user click on new user button")
	public void user_click_on_new_user_button() {
		MerchteUser.New_User_Menu_click();
	}

	@When("user enter the details and click on create user button {string} {string} {string}")
	public void user_enter_the_details_and_click_on_create_user_button(String username, String password, String email) {
		MerchteUser.UserCreation(username, password, email);
	}

	@Then("user see the success message and details on the page")
	public void user_see_the_success_message_and_details_on_the_page() {
		MerchteUser.UserSuccess_check();
	}

	@When("user enter email id in the filter box {string} and click on filter button")
	public void user_enter_email_id_in_the_filter_box_and_click_on_filter_button(String email) {
		MerchteUser.Emailfilter_result(email);
	}

	@Then("user see the created user details in the table  {string}  {string}")
	public void user_see_the_created_user_details_in_the_table(String user, String email) {
		MerchteUser.Filter_tableResult(user, email);
	}

	@And("user get the value from the following resources {string} with {string}")
	public void user_get_the_value_from_the_following_resources_something_with_something(String resources, String id)
			throws Throwable {
		MerchteUser.Resources_check(resources, id);
	}
	
	@And("user update the value from the following resources {string} with {string}")
	public void user_update_the_value_from_the_following_resources_something_with_something(String resources, String id)
			throws Throwable {
		MerchteUser.Resources_UpdateCheck(resources, id);
	}
	
	@And("user delete the value from the following resources {string} with {string}")
	public void user_delete_the_value_from_the_following_resources_something_with_something(String resources, String id)
			throws Throwable {
		MerchteUser.Resources_DeleteCheck(resources, id);
	}
	
	@And("user post the value to the following resources {string}")
	public void user_post_the_value_to_the_following_resources(String resources)
			throws Throwable {
		MerchteUser.Resources_Postcheck(resources);
	}

	@Given("^user launch the base uri \"([^\"]*)\"$")
	public void userLaunchTheBaseUri(String Uri) throws Throwable {
		MerchteUser.LauchURI(Uri);

	}
	
	@Then("user check the status code {string}")
	public void user_check_the_status_code(String code) {
		MerchteUser.Status_check(code);
	}

}
