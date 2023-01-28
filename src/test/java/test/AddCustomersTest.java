package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomersTest {
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToAddCustomers() {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage("Dashboard");
		
		dashboardPage.clickCustomers();
		dashboardPage.clickAddCustomers();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContactHeaderText("Add Contact");
		addCustomerPage.insertFullName("Earth Paddle");
		addCustomerPage.selectCompanyName("Techfios");
		addCustomerPage.insertEmail("abc@pavement.com");
		addCustomerPage.insertAddress("123 Main Street");
		addCustomerPage.insertCity("Houston");
		addCustomerPage.insertState("TX");
		addCustomerPage.insertZipCode("75008");
		addCustomerPage.selectCountry("United States");
		addCustomerPage.clickSaveButton();
		
		
	}

}
