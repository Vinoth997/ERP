package ERP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseClass;

public class methods extends BaseClass {
	private pageLocators locators;
	
	public methods(WebDriver driver) {
		locators = PageFactory.initElements(driver, pageLocators.class);
	
	}
	
	 //Click on HRTab
	public  void clickOnHRTab() throws InterruptedException {
		System.out.println("Performe HR Tab Click");
		locators.HR_TAB.click();
		System.out.println("HR Tab is clicked");

		
	}
	
}