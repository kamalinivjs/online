package priya1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class prisa {
	@Given("I want to enter username {string}")
	public void i_want_to_enter_username(String string) {
	    System.out.println(string);
	}

	@Given("I want to enter password {string}")
	public void i_want_to_enter_password(String string) {
		 System.out.println(string);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		 System.out.println("login");
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
		 System.out.println("home");
	}

}
