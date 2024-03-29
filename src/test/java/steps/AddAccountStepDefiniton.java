package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountListPage;
import pages.TestBase;

public class AddAccountStepDefiniton extends TestBase {
	
	AccountListPage accountlistpage;
	
	
	@Before
	public void setUp(){
		init();
	 accountlistpage = PageFactory.initElements(driver, AccountListPage.class);
	 
	}

	

	@When("User clicks should land on account list page")
	public void user_clicks_should_land_on_account_list_page() {
		accountlistpage.clickAddAccountButton();
	}
	
	@Then("User should land on account list page")
	public void user_should_land_on_account_list_page() {
	   
	}

	@When("user clicks on add account button")
	public void user_clicks_on_add_account_button() {
	}

	@When("user enters accont name as {string}")
	public void user_enters_accont_name_as(String string) {
	}

	@When("user enters description as {string}")
	public void user_enters_description_as(String string) {
	}

	@When("user enters initial balance as {string}")
	public void user_enters_initial_balance_as(String string) {
	}

	@When("user enters account number as {string}")
	public void user_enters_account_number_as(String string) {
	}

	@When("user enters contact person as {string}")
	public void user_enters_contact_person_as(String string) {
	}
	
	@When ("user clicks on save button")
	public void user_clicks_on_save_button() {		
	}
	
//	@Then ("user should be the account added alert")
//	public void user_should_be_the_account_added_alert() {
		
//	}
	

}
