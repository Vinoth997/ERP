package hrTests;

import java.io.IOException;

import org.testng.annotations.*;

import ERP.methods;
import basePackage.BaseClass;
import basePackage.Login;



public class HRTestCases extends BaseClass {
	
	methods Methods = new methods();

	@BeforeTest
	private void open() throws IOException, InterruptedException {
		browserOpen();
		new Login().loginUser();

	}

	// Creating a new Employee 
	@Test(priority = 0, description ="Verify the user is able to create the Employee", enabled = true)
	private void create_Employee() throws IOException, InterruptedException {
		Methods.clickOnHRTab();
		System.out.println("creating the Employee details");

		
	}

	@AfterTest
	private void driverClose() throws Exception {

		browserClose();
	}
}