package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.TestBase;

public class DashboardStepDefiniton extends TestBase{

	DashboardPage dashboardpage;
	  
	@Then ("User should be landing on dashboard page")
	public void user_should_be_landing_on_dashboard_page() {
		
	dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	
	String expectedDashboardText = "Dashboard";
	String actualDashboardText = dashboardpage.getDashboardText();
	Assert.assertEquals(expectedDashboardText, actualDashboardText);
	
	}
	@When("clicks on list accounts link")
	public void clicks_on_list_accounts_link() {
		dashboardpage.clickListAccount();
	}
	    
}
