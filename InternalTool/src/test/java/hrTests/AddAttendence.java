package hrTests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ERP.methods;
import basePackage.BaseClass;
import basePackage.Login;
import basePackage.UserInformation;

public class AddAttendence extends BaseClass{

	
	methods Methods;
	UserInformation user = new UserInformation();

	@BeforeTest
	private void open() throws IOException, InterruptedException {
		browserOpen();
		new Login(driver).loginUser();
		Methods = new methods(driver);
		
	}
	
	@Test(priority = 0)
	public void HR()
	{
		Methods.HR1();
	}
	
	@Test
	public void addAttendence()
	{
		Methods.addAttendence("Absent");
	}
}
