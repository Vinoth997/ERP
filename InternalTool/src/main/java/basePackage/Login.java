package basePackage;
import java.io.IOException;
import ERP.pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

	public class Login extends BaseClass {

		public Login() {

			PageFactory.initElements(driver, this);
		}
		
		public void loginUser() throws IOException {
			pageLocators Locators = new pageLocators();
			try {
				driver.findElement(By.xpath(Locators.USERNAME_FIELD)).sendKeys("administrator");
		        driver.findElement(By.xpath(Locators.PASSWORD_FIELD)).sendKeys("ss-erp@2021");
		        driver.findElement(By.xpath(Locators.LOGIN_BUTTON)).click();
				
			} catch (Exception e) {
				takesScreenShotfull();
				
			}
		}

	}
