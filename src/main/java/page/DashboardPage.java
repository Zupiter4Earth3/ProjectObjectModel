package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
//	Element list
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement dashboardHeaderElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement customersMenuElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement addCustomersMenuElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement listCustomersMenuElement;
	//*[@id="side-menu"]/li[3]/ul/li[1]/a
	public void verifyDashboardPage(String dashboardText) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(dashboardHeaderElement));
		Assert.assertEquals(dashboardHeaderElement.getText(),dashboardText,"Wrong page!!!!");
	}
	public void clickCustomers() {
		customersMenuElement.click();
	}
	public void clickAddCustomers() {
		addCustomersMenuElement.click();
	}
	public void clickListCustomers() {
		listCustomersMenuElement.click();
	}

}
