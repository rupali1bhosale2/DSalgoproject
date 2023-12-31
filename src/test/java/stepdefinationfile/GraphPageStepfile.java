package stepdefinationfile;

import java.io.IOException;

import com.pages.GraphPage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPageStepfile {

	GraphPage graphPage = new GraphPage(DriverFactory.getDriver());
	SignInPage signIn = new SignInPage(DriverFactory.getDriver());


	@Given("I am on Ds-algo Home Page")
	public void i_am_on_ds_algo_home_page() throws IOException {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
		signIn.clickSignIn();
		signIn.sendUsername();
		signIn.sendPassword();
		signIn.clickLoginBtn();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click the GetStared button under Graph subtitle")
	public void i_click_the_get_stared_button_under_graph_subtitle() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.clickGraphGetstarted();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Home page")
	public void navigates_to_graph_home_page() {
		graphPage.ClickGraphLink();
	}

	@When("I click the Graph Link")
	public void i_click_the_graph_link() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphLink();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Page")
	public void navigates_to_graph_page() {
	}

	@When("I click the Try Here>>> button")
	public void i_click_the_try_here_button() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphTry();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to TryEditor Page")
	public void navigates_to_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I Enter {string} in text area")
	public void i_enter_in_text_area(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.PrintGraph();
	   // throw new io.cucumber.java.PendingException();
	}

	@When("click Run")
	public void click_run() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickRunGraph();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("displays {string} in output")
	public void displays_in_output(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the Graph Representations Link")
	public void i_click_the_graph_representations_link() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphRepLink();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Representations Try Page")
	public void navigates_to_graph_representations_try_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("I click Try Here button")
	public void i_click_try_here_button() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphReptry();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to New Try Editor Page")
	public void navigates_to_new_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("Enter {string} in text area")
	public void enter_in_text_area(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.PrintGraphRep();
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click Run")
	public void i_click_run() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickRunGraphRep();
	  //  throw new io.cucumber.java.PendingException();
	}

	@Then("displays {string} in the output")
	public void displays_in_the_output(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@Given("User enters sheetname {string} and rownumber <rowNumber> for GraphPage")
	public void user_enters_sheetname_and_rownumber_row_number_for_tree_page(String sheetName, Integer rowNumber) throws IOException {
		signIn.readDataFromSheet(sheetName, rowNumber);
	}

	@Given("I am on Home Page after signing in for GraphPage")
	public void i_am_on_home_page_after_signing_in_for_graph_page() {
	}
	@Then("Enter username {string} and password {string} to sign in for GraphPage")
	public void enter_username_and_password_to_sign_in_for_graph_page(String string, String string2) throws IOException {
		System.out.println("inside enter username and password");
		signIn.sendUsername();
		signIn.sendPassword();
		signIn.clickLoginBtn();
	}

	@Given("User is on home page for GraphPage")
	public void user_is_on_home_page_for_graph_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
		signIn.clickSignIn();
	}

	@Given("User enters sheetname {string} and rownumber {int} for GraphPage")
	public void user_enters_sheetname_and_rownumber_for_graph_page(String sheetName, Integer rowNumber) throws IOException {
		signIn.readDataFromSheet(sheetName, rowNumber);
	}



}
