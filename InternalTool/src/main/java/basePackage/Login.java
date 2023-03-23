package basePackage;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ERP.pageLocators;

	public class Login extends BaseClass {
		
		pageLocators locators;

		public Login(WebDriver driver) {

			locators = PageFactory.initElements(driver, pageLocators.class);
		}
		
		
		
		public void loginUser() throws IOException {
			try {
				locators.USERNAME_FIELD.sendKeys("administrator");
		        locators.PASSWORD_FIELD.sendKeys("ss-erp@2021");
		        locators.LOGIN_BUTTON.click();
				
			} catch (Exception e) {
				takesScreenShotfull();
				
			}
		}

	}
