package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	
	WebDriver driver; 
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using ="//strong[text()='Dashboard']")
	public WebElement DashboardElement;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'List Accounts')]")
	public WebElement ListAccountsElement;
	
	public String getDashboardText() {
		return DashboardElement.getText();
		
	}

	public void clickListAccount() {
		ListAccountsElement.click();
		
	}
	
	
	
}
