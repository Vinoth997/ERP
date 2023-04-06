package ERP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;
import basePackage.UserInformation;

public class methods extends BaseClass{
	
	 pageLocators locators;
	 
	 UserInformation user = new UserInformation();
	 
	 String EmployeeID = "" ;
	 String UserEmail = "";
	 String UniqueID = "";
	 String TimesheetID = "";

		public methods(WebDriver driver) {

			locators = PageFactory.initElements(driver, pageLocators.class);
		}
	 
	 //Click on HRTab
	public void clickOnHRTab() {
		waitForElementClickable(locators.HR_TAB);
		locators.HR_TAB.click();
		System.out.println("The 'HR' tab has been clicked");
	}
	
	public void clickOnEmployeeButton() {
		waitForElementClickable(locators.EMPLOYEE_BUTTON);
		locators.EMPLOYEE_BUTTON.click();
		System.out.println("The 'Employee' button has been clicked");
	}
	
	public void createNewEmployee(String Fname,String Lname,String DOJ,String LeavePolicy,String WorkExp) throws InterruptedException {
		locators.ADD_EMPLOYEE.click();
		System.out.println("'Add New Employee' button has been clicked");
		Thread.sleep(2000);
		
		//Employee Details
		waitForElement(locators.EMPLOYEE_FIRSTNAME);
		locators.EMPLOYEE_FIRSTNAME.sendKeys(Fname);
		waitForElement(locators.EMPLOYEE_LASTNAME);
		locators.EMPLOYEE_LASTNAME.sendKeys(Lname);
		locators.EMPLOYEE_GENDER.sendKeys(user.Employee_Gender+ Keys.ENTER);
		locators.EMPLOYEE_DOB.sendKeys(user.Employee_DOB+ Keys.ENTER);
		locators.EMPLOYEE_DOJ.sendKeys(DOJ+ Keys.ENTER);
		locators.EMPLOYEE_SALUTATION.sendKeys(user.Employee_Salutation+ Keys.ENTER);
		locators.EMPLOYEE_ANNUAL_CTC.sendKeys(user.Employee_Annual_Ctc+ Keys.ENTER);
		locators.EMPLOYMENT_TYPE.sendKeys(user.Employment_Type+ Keys.ENTER);
		
		//ERPNext User
		waitForElementClickable(locators.ERPNEXT_USER_BUTTON);
		locators.ERPNEXT_USER_BUTTON.click();
		locators.EMPLOYEE_USER_ID.sendKeys(UserEmail);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@title='"+UserEmail+"']/ancestor::li")).click();
		System.out.println("Entered the employee details for '"+Fname+" "+Lname+"' with a joining date of " + DOJ);
		
		//Department and Grade
		waitForElementClickable(locators.DEPARTMENT_BUTTON);
		locators.DEPARTMENT_BUTTON.click();
		locators.EMPLOYEE_DEPARTMENT.sendKeys(user.Employment_Department);
		locators.EMPLOYEE_DESIGNATION.sendKeys(user.Employment_Designation);
		locators.EMPLOYEE_BRANCH.sendKeys(user.Employment_Branch);
		locators.EMPLOYEE_REPORTS_TO.sendKeys(user.Employment_Reports_To);
		System.out.println("'Department and Grade' has been entered");
		
		
		//Approvers
		locators.EMPLOYEE_LEAVE_APPROVER.sendKeys(user.Employee_Leave_Approver);
		locators.EMPLOYEE_PROJECT_MANAGER.sendKeys(user.Employee_Project_Manager);
		System.out.println("'Approvers' has been entered");
		
		//Attendance and Leave Details 
		waitForElement(locators.ATTENDANCE_LEAVE_BUTTON);
		locators.ATTENDANCE_LEAVE_BUTTON.click();
		locators.ATTENDANCE_DEVICE_ID.sendKeys(UniqueID);
		locators.LEAVE_POLICY_DETAIL.sendKeys(LeavePolicy);
		locators.HOLIDAY_LIST.sendKeys(user.Employee_Holiday_List);
		locators.DEFAULT_SHIFT.sendKeys(user.Employee_Shift);
		System.out.println("'Attendance and Leave Details' has been entered");
		
		//Salary Details
		waitForElement(locators.SALARY_DETAILS_BUTTON);
		locators.SALARY_DETAILS_BUTTON.click();
		waitForElement(locators.EMPLOYEE_BOND);
		selectByVisibletext(locators.EMPLOYEE_BOND, user.Employee_Bond);
		System.out.println("'Salary Details' has been entered");
		
		//Previous Work Experience
		waitForElement(locators.PREVIOUS_WORK_EXP_BUTTON);
		locators.PREVIOUS_WORK_EXP_BUTTON.click();
		selectByVisibletext(locators.PREVIOUS_WORK_EXP_OPTION,WorkExp);
		Thread.sleep(2000);
		if(locators.EXTERNAL_WORK_HISTORY.isDisplayed()) {
			locators.EXTERNAL_WORK_HISTORY.click();
			locators.WORK_EXP_COMPANY_NAME.sendKeys(user.Previous_Company_Name);
			locators.WORK_EXP_DESIGNATION.sendKeys(user.Previous_Company_Designation);
			locators.WORK_EXP_ADDRESS.sendKeys(user.Previous_Company_Address);
			locators.WORK_EXP_IN_YEARS.sendKeys(user.Work_Exp_Years);
			locators.WORK_EXP_IN_MONTHS.sendKeys(user.Work_Exp_Months);
			waitForElementClickable(locators.WORK_EXP_ATTACH_CERTIFICATE_BUTTON);
			locators.WORK_EXP_ATTACH_CERTIFICATE_BUTTON.click();
			locators.CERTIFICATE_UPLOAD.sendKeys(user.Exp_Certificate_Upload);
			locators.UPLOAD_BUTTON.click();
			mouseoveractions(locators.SHORTCUT_KEY);
		}
		
		System.out.println("'Previous Work Experience' has been entered");
		

		
		//Save
		waitForElement(locators.EMPLOYEE_SAVE);
		locators.EMPLOYEE_SAVE.click();
		waitForElement(locators.POPUP_ALERT);
		VerifyTextValidation(locators.POPUP_ALERT, constants.Success_Text);
		waitForElement(locators.CLOSE_POPUP_ALERT);
		locators.CLOSE_POPUP_ALERT.click();
		Thread.sleep(3000);
		
		//Grabing Employee ID
		EmployeeID = locators.EMPLOYEE_ID.getText();
		System.out.println("The new employee has been created with an employee ID of '"+EmployeeID+"'");
	}
	
	
	public void clickOnAppLogoButton() {
		waitForElement(locators.CLICK_APP_LOGO);
		locators.CLICK_APP_LOGO.click();
		System.out.println("Clicked on the 'ERP App logo'");

	}
	
	/**
	 * Verifying the total leaves allocated for the employee
	 * @param date
	 * @throws InterruptedException
	 */
	public void verifyTotalLeaveAllocation(String Total_Allocated_Leaves) throws InterruptedException {
		System.out.println("Validating Total Allocated Leaves for an Employee");
		waitForElement(locators.LEAVE_APPLICATION_BUTTON);
		locators.LEAVE_APPLICATION_BUTTON.click();
		locators.ADD_LEAVE_APPLICATION_BUTTON.click();
		waitForElementClickable(locators.LA_EMPLOYEE_NAME);
		locators.LA_EMPLOYEE_NAME.sendKeys(EmployeeID+Keys.ENTER);
		mouseoveractions(locators.TOTAL_ALLOCATED_LEAVE);
		VerifyTestResult(locators.TOTAL_ALLOCATED_LEAVE, Total_Allocated_Leaves);
		System.out.println("Verified the Total Leave allocation for an employee.");
	}
	
	/**
	 * This method will create a new userid for the employee by first name and last name
	 * @param Fname
	 * @param Lname
	 * @throws InterruptedException
	 */
	public void createNewUser(String Fname,String Lname) throws InterruptedException {
		waitForElement(locators.USERS_TAB);
		Scrolljavascriptexecutor("down", locators.USERS_TAB);
		locators.USERS_TAB.click();
		waitForElementClickable(locators.USER_BUTTON);
		locators.USER_BUTTON.click();
		waitForElementClickable(locators.ADD_USER_BUTTON);
		locators.ADD_USER_BUTTON.click();
		waitForElement(locators.NEW_USER_EMAIL);
		Random rand = new Random();
		int randomNumber = rand.nextInt(90000) + 10000;
        UniqueID = Integer.toString(randomNumber);
		String Email = Fname+Lname+randomNumber+"@softsuave.com";
		UserEmail = Email.toLowerCase();
		locators.NEW_USER_EMAIL.sendKeys(UserEmail);
		waitForElement(locators.NEW_USER_FIRSTNAME);
		locators.NEW_USER_FIRSTNAME.sendKeys(Fname);
		waitForElementClickable(locators.NEW_USER_SAVE_BUTTON);
		locators.NEW_USER_SAVE_BUTTON.click();
		Thread.sleep(3000);
		if(locators.NEW_USER_WELCOME_EMAIL_SENT_POPUP.isDisplayed()) {
			waitForElementClickable(locators.NEW_USER_WELCOME_EMAIL_SENT_POPUP_CLOSE);
//			locators.NEW_USER_WELCOME_EMAIL_SENT_POPUP_CLOSE.click();
			javascriptExecutorForceClick(locators.NEW_USER_WELCOME_EMAIL_SENT_POPUP_CLOSE);
		}
		System.out.println("User mail has been created : "+UserEmail);		
	}
	
	//Click on HRTab
		public void clickOnProjectTab() {
			waitForElementClickable(locators.PROJECTS_TAB);
			locators.PROJECTS_TAB.click();
			System.out.println("The 'Project' tab has been clicked");
			
		}	
	
	public void createTimeSheet(String employeeName) throws InterruptedException {
		waitForElement(locators.TIMESHEET_BUTTON);
		locators.TIMESHEET_BUTTON.click();
		System.out.println("Clicked on Timesheet Button");
		
		waitForElement(locators.ADD_TIMESHEET_BUTTON);
		locators.ADD_TIMESHEET_BUTTON.click();
		System.out.println("Clicked on Add Timesheet Button");
		
		waitForElement(locators.TIMESHEET_EMPLOYEE_ID);
		locators.TIMESHEET_EMPLOYEE_ID.click();
		locators.TIMESHEET_EMPLOYEE_ID.clear();
		Thread.sleep(2000);
//		locators.TIMESHEET_EMPLOYEE_ID.sendKeys(user.Timesheet_Employee_ID);
		locators.TIMESHEET_EMPLOYEE_ID.sendKeys(employeeName);
		WebElement empName = driver.findElement(By.xpath("//p[@title='"+employeeName+"']/ancestor::li"));
		waitForElement(empName);
		empName.click();
		Thread.sleep(2000);
		locators.TIMESHEET_RESOURCE_NAMEFIELD.clear();
		locators.TIMESHEET_RESOURCE_NAMEFIELD.sendKeys(user.Timesheet_Resource_Name);
		locators.TIMESHEET_RESOUCE_NAME.click();
		Thread.sleep(2000);
		
		waitForElementClickable(locators.TIMESHEET_ACTIVITY_TYPE_BTN);
		locators.TIMESHEET_ACTIVITY_TYPE_BTN.click();
		Thread.sleep(2000);
		waitForElementClickable(locators.TIMESHEET_ACTIVITY_TYPE_FIELD);
		locators.TIMESHEET_ACTIVITY_TYPE_FIELD.sendKeys("Testing");
		Thread.sleep(2000);
		waitForElementClickable(locators.TIMESHEET_ACTIVITY_TYPE_NAME);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date currentDate = new Date();
		String formattedDate = format.format(currentDate);
		
		locators.TIMESHEET_DATE.sendKeys(formattedDate);
		locators.TIMESHEET_HOURS.sendKeys("8");
		Thread.sleep(2000);
		waitForElementClickable(locators.TIMESHEET_PROJECT);
		locators.TIMESHEET_PROJECT.sendKeys(user.Timesheet_Project_Name);
		WebElement projectName = driver.findElement(By.xpath("//p[@title='"+user.Timesheet_Project_Name+"']/ancestor::li"));
		waitForElementClickable(projectName);
		projectName.click();
		Thread.sleep(2000);
		waitForElementClickable(locators.TIMESHEET_SAVE_BUTTON);
		locators.TIMESHEET_SAVE_BUTTON.click();
		Thread.sleep(3000);
		boolean SavedPopupIsDisplayed = false;
		try {
		    SavedPopupIsDisplayed = locators.POPUP_ALERT.isDisplayed();
		} catch (NoSuchElementException e) {
		    SavedPopupIsDisplayed = false;
		}
		if(SavedPopupIsDisplayed==true) {
			Thread.sleep(2000);
			TimesheetID = locators.TIMESHEET_ID.getText();
			System.out.println("Timesheet ID : "+TimesheetID);		
		}else if(locators.ALERT_TEXT_MESSAGE.isDisplayed())
		{
			String alerttext = locators.ALERT_TEXT_MESSAGE.getText();
			System.out.println("Error Message : "+alerttext);
			waitForElementClickable(locators.NEW_USER_WELCOME_EMAIL_SENT_POPUP_CLOSE);
			javascriptExecutorForceClick(locators.NEW_USER_WELCOME_EMAIL_SENT_POPUP_CLOSE);
		}
	}
	
}