package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginpage;
	DatabasePage databasePage;
	
	@Before 
	public void setUp() {
		init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = PageFactory.initElements(driver, DatabasePage.class);
	}
	
	@Given("User is on codefios login page")
	public void userIsOnCodefiosLoginPage() {
		
		driver.get("https://qa.codefios.com/login");
		
	}

	@When("User enters username as {string}")
	public void userEntersUsernameAs(String username) {
		
		loginpage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void methodname2(String password) {
		loginpage.enterPassword(password);
	}

	@And("User clicks on sign in button")
	public void userClicksOnSignInButton() {
		loginpage.clickSignInButton();
	}

	
	@After 
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
