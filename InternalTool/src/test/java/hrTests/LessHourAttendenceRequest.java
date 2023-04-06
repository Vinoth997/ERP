package hrTests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ERP.methods;
import basePackage.BaseClass;
import basePackage.Login;
import basePackage.UserInformation;

public class LessHourAttendenceRequest extends BaseClass{
	
	
	methods Methods;
	Login Login;
	UserInformation user = new UserInformation();

	
	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
	    return new Object[][] {
	        {"juniorbeforedate65267@softsuave.com", "softsuave"},
	        {"juniorafterdate56285@softsuave.com", "softsuave"},
	        {"seniorbeforedate44481@softsuave.com", "softsuave"},
	        {"seniorafterdate51778@softsuave.com", "softsuave"}
	    };
	
	}
	
	
	@BeforeMethod
	private void open() throws IOException, InterruptedException {
		browserOpen();
		Login=new Login(driver);
		Methods = new methods(driver);
		
	}
	
	@Test(priority = 0,dataProvider="loginData")
	public void HR(String usernameEmail,String password ) throws IOException, InterruptedException
	{
		Login.loginUser(usernameEmail, password);
		Methods.HR2();
		Methods.lessHourAttendenceRequest();
		
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}

