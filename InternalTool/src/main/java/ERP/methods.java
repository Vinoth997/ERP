package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import basePackage.BaseClass;

public class methods extends BaseClass {

	public methods() {
		PageFactory.initElements(driver, this);
	}
	 pageLocators locators = new pageLocators();
	 
	 //Click on HRTab
	public  void clickOnHRTab() throws InterruptedException {
		System.out.println("HR Tab is clicked");
		driver.findElement(By.xpath(locators.HR_TAB)).click();
		
	}
	
}