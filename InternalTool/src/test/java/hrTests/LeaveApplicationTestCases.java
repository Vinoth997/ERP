package hrTests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ERP.methods;
import basePackage.BaseClass;
import basePackage.Login;
import basePackage.UserInformation;


public class LeaveApplicationTestCases extends BaseClass {
	methods Methods;
	UserInformation user = new UserInformation();

	@BeforeMethod
	private void open() throws IOException, InterruptedException {
		browserOpen();
		new Login(driver).loginUser();
		Methods = new methods(driver);
	}

	@Test(priority = 0, enabled = false)
	private void Create_Leave_Application() throws InterruptedException {
		Methods.clickOnHRTab();
		Methods.createNewLeaveApplication();

	}

	@Test(priority = 1 , enabled = false )
	private void Create_Leave_Application_on_duplicatedate() throws InterruptedException {
		Methods.clickOnHRTab();
		Methods.Create_Leave_Application_on_already_createdDate();
		driver.close();

	}
	
	@Test(priority = 1, enabled = true )
	private void APProve_Leave_appication() throws InterruptedException {
		Methods.clickOnHRTab();
		Methods.ApproveLeaveApplication();
		driver.close();

	}

}
