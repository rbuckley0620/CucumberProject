package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountListPage {
	WebDriver driver;

	public AccountListPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Account List')]")
	public WebElement AccountListElement;
	@FindBy(how = How.XPATH, using = "//button[text()='Add Account']") 
	public WebElement AddAccountButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_name\"]")
	public WebElement AccountName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	public WebElement AccountDescription;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	public WebElement AccountInitialBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	public WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	public WebElement AccountContactNumber;
	@FindBy(how =  How.XPATH, using = "//*[@id=\"accountSave\"]")
	public WebElement SaveButton;

	public String getAccountListText() {
		return AccountListElement.getText();
		
	}
	
	public void clickAddAccountButton() {
		AddAccountButton.click();
	}
	public void enterAccountName(String accountname) {
		AccountName.sendKeys(accountname);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	public void enterAccounenterAccountDescriptiontDescription(String description) {
		AccountDescription.sendKeys(description);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	
	public void enterAccountInitialBalance(String initialBalance) {
		AccountInitialBalance.sendKeys(initialBalance);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	public void enterAccountContactNumber(String contactNumber) {
		AccountContactNumber.sendKeys(contactNumber);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	public void clickSavebutton() {
		SaveButton.click();
	}
	
	
	
}
