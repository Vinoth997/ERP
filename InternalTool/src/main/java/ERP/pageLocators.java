package ERP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageLocators {

	@FindBy(xpath = "//input[@id='login_email']")
	public WebElement USERNAME_FIELD;
	
	@FindBy(xpath = "//input[@id='login_password']")
	public WebElement PASSWORD_FIELD;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	public WebElement LOGIN_BUTTON;
	
	@FindBy(xpath = "//div[@class='standard-sidebar-section']//span[text()='HR']")
	public WebElement HR_TAB;
	
}
