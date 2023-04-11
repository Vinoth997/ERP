package hrTests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ERP.methods;
import basePackage.BaseClass;
import basePackage.Login;
import basePackage.UserInformation;

public class AddAttendence extends BaseClass{

	
	methods Methods;
	Login Login;
	UserInformation user = new UserInformation();
		
	@BeforeMethod
	private void open() throws IOException, InterruptedException {
		browserOpen();
		Login=new Login(driver);
		Methods = new methods(driver);
	}
	
	@Test(priority = 0)
	public void addAttendence() throws InterruptedException, IOException
	{
		Login.loginUser("adminqa@softsuave.com", "softsuave");
		Methods.hR_Module_Tab();
		Methods.add_Attendence("SS00581","02-03-2023", "Less Hour");
		Methods.clickOnAppLogoButton();
		Methods.logout_User();
		Login.loginUser("juniorbeforedate65267@softsuave.com", "softsuave");
		Methods.HR2();
		Methods.less_Hour_Attendance_Request("02-03-2023");
		Methods.logout_User();
		Login.loginUser("adminqa@softsuave.com", "softsuave");
		Methods.HR2();
		Methods.approve_Leave_Application("Approved");
		Methods.cancel_Less_Hour_Attendance();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Methods.logout_User();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
