package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement addContactHeaderElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"account\"]") WebElement fullNameElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"cid\"]") WebElement companyElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]") WebElement emailElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"phone\"]") WebElement phoneElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"address\"]") WebElement addressElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"city\"]") WebElement cityElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"state\"]") WebElement stateElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"zip\"]") WebElement zipCodeElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"country\"]") WebElement countryElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"submit\"]") WebElement saveButtonElement;
	
	
	
	
	
	public void verifyAddContactHeaderText(String ecpectedText) {
		Assert.assertEquals(addContactHeaderElement.getText(), ecpectedText, "Landed on wrong page!!");
	}
	public void insertFullName(String userFullName) {
		fullNameElement.sendKeys(userFullName + generatedRandomNumber(999));
	}
	public void selectCompanyName(String company) {
		selectFromDropdown(companyElement, company);
	}
	public void insertEmail(String email) {
		emailElement.sendKeys(generatedRandomNumber(999)+email);
	}
	public void insertAddress(String address) {
		addressElement.sendKeys(address + generatedRandomNumber(999));
	}
	public void insertCity(String city) {
		cityElement.sendKeys(city + generatedRandomNumber(999));
	}
	public void insertState(String state) {
		stateElement.sendKeys(state + generatedRandomNumber(999));
	}
	public void insertZipCode(String zipCode) {
		zipCodeElement.sendKeys(zipCode + generatedRandomNumber(999));
	}
	public void selectCountry(String country) {
		selectFromDropdown(countryElement, country);
	}
	public void clickSaveButton() {
		saveButtonElement.click();

	}
	
	
}
