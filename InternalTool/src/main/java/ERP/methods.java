package ERP;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;
import basePackage.UserInformation;

public class methods extends BaseClass {

	pageLocators locators;

	UserInformation user = new UserInformation();

	String EmployeeID = "";

	public methods(WebDriver driver) {

		locators = PageFactory.initElements(driver, pageLocators.class);
	}

	// Click on HRTab
	public void clickOnHRTab() {
		waitForElementClickable(locators.HR_TAB);
		locators.HR_TAB.click();
		System.out.println("The 'HR' tab has been clicked");

	}

	/*
	 * public void clickOnEmployeeButton() {
	 * waitForElementClickable(locators.EMPLOYEE_BUTTON);
	 * locators.EMPLOYEE_BUTTON.click();
	 * System.out.println("The 'Employee' button has been clicked"); }
	 * 
	 * public void createNewEmployee(String Fname,String Lname,String DOJ,String
	 * LeavePolicy,String WorkExp) throws InterruptedException {
	 * locators.ADD_EMPLOYEE.click();
	 * System.out.println("Clicked on 'Add New Employee'");
	 * locators.EMPLOYEE_FIRSTNAME.sendKeys(Fname);
	 * locators.EMPLOYEE_LASTNAME.sendKeys(Lname);
	 * locators.EMPLOYEE_GENDER.sendKeys(user.Employee_Gender);
	 * locators.EMPLOYEE_DOB.sendKeys(user.Employee_DOB);
	 * locators.EMPLOYEE_DOJ.sendKeys(DOJ);
	 * System.out.println("Entered the employee details for '"+Fname+" "
	 * +Lname+"' with a joining date of " + DOJ);
	 * locators.EMPLOYEE_LEAVE_APPROVER.sendKeys(user.Employee_Leave_Approver);
	 * System.out.println("Selected '"+user.
	 * Employee_Leave_Approver+"' as the employee leave approver");
	 * locators.EMPLOYEE_PROJECT_MANAGER.sendKeys(user.Employee_Project_Manager);
	 * System.out.println("Selected '"+user.
	 * Employee_Project_Manager+"' as the employee project manager");
	 * waitForElement(locators.ATTENDANCE_LEAVE_BUTTON);
	 * locators.ATTENDANCE_LEAVE_BUTTON.click();
	 * locators.LEAVE_POLICY_DETAIL.sendKeys(LeavePolicy);
	 * System.out.println("Selected '"+LeavePolicy+"' as the employee leave policy"
	 * ); locators.HOLIDAY_LIST.sendKeys(user.Employee_Holiday_List);
	 * locators.DEFAULT_SHIFT.sendKeys(user.Employee_Shift);
	 * System.out.println("Selected '"+user.
	 * Employee_Shift+"' as the employee shift time.");
	 * waitForElement(locators.PREVIOUS_WORK_EXP_BUTTON);
	 * locators.PREVIOUS_WORK_EXP_BUTTON.click();
	 * selectByVisibletext(locators.PREVIOUS_WORK_EXP_OPTION,WorkExp);
	 * waitForElement(locators.EMPLOYEE_SAVE); locators.EMPLOYEE_SAVE.click();
	 * waitForElement(locators.POPUP_ALERT);
	 * VerifyTextValidation(locators.POPUP_ALERT, constants.Success_Text);
	 * waitForElement(locators.CLOSE_POPUP_ALERT);
	 * locators.CLOSE_POPUP_ALERT.click(); Thread.sleep(3000); EmployeeID =
	 * locators.EMPLOYEE_ID.getText(); System.out.
	 * println("The new employee has been created with an employee ID of '"
	 * +EmployeeID+"'"); }
	 * 
	 * 
	 * public void clickOnAppLogoButton() { waitForElement(locators.CLICK_APP_LOGO);
	 * locators.CLICK_APP_LOGO.click();
	 * System.out.println("Clicked on the 'ERP App logo'");
	 * 
	 * }
	 * 
	 * 
	 * Verifying the total leaves allocated for the employee
	 * 
	 * @param date
	 * 
	 * @throws InterruptedException
	 * 
	 * public void verifyTotalLeaveAllocation(String Total_Allocated_Leaves) throws
	 * InterruptedException {
	 * System.out.println("Validating Total Allocated Leaves for an Employee");
	 * waitForElement(locators.LEAVE_APPLICATION_BUTTON);
	 * locators.LEAVE_APPLICATION_BUTTON.click();
	 * locators.ADD_LEAVE_APPLICATION_BUTTON.click();
	 * waitForElementClickable(locators.LA_EMPLOYEE_NAME);
	 * locators.LA_EMPLOYEE_NAME.sendKeys(EmployeeID+Keys.ENTER);
	 * mouseoveractions(locators.TOTAL_ALLOCATED_LEAVE);
	 * VerifyTestResult(locators.TOTAL_ALLOCATED_LEAVE, Total_Allocated_Leaves);
	 * System.out.println("Verified the Total Leave allocation for an employee."); }
	 */
	public void createNewLeaveApplication() throws InterruptedException {
		locators.LEAVE_APPLICATION_BUTTON.click();
		locators.ADD_LEAVE_APPLICATION_BUTTON.click();
		waitForElementClickable(locators.LA_EMPLOYEE_NAME);
		locators.LA_EMPLOYEE_NAME.sendKeys(user.Leave_Employee_Name + Keys.ENTER);
		Scrolljavascriptexecutor("down", locators.LEAVE_FROM_DATE);
		locators.LEAVE_FROM_DATE.sendKeys(user.Employee_LEAVE_FROM_DATE + Keys.ENTER);
		locators.LEAVE_TO_DATE.sendKeys(user.Employee_LEAVE_TO_DATE + Keys.ENTER);
		Thread.sleep(20);
		locators.LA_SAVE_BUTTON.click();
		locators.HR_TAB.click();

	}

	public void Create_Leave_Application_on_already_createdDate() throws InterruptedException {
		locators.LEAVE_APPLICATION_BUTTON.click();
		locators.ADD_LEAVE_APPLICATION_BUTTON.click();
		waitForElementClickable(locators.LA_EMPLOYEE_NAME);
		locators.LA_EMPLOYEE_NAME.sendKeys(user.Leave_Employee_Name + Keys.ENTER);
		Scrolljavascriptexecutor("down", locators.LEAVE_FROM_DATE);
		locators.LEAVE_FROM_DATE.sendKeys(user.Employee_LEAVE_FROM_DATE + Keys.ENTER);
		locators.LEAVE_TO_DATE.sendKeys(user.Employee_LEAVE_TO_DATE + Keys.ENTER);
		Thread.sleep(20);
		locators.LA_SAVE_BUTTON.click();
		System.out.println(gettext(locators.LEAVE_APPLICATION_ALERT_MESSAGE));

	}

	public void ApproveLeaveApplication() {
		locators.LEAVE_APPLICATION_BUTTON.click();
		locators.CLICK_DRFT_LEAVE_APPLICATION.click();
		Scrolljavascriptexecutor("down", locators.SCROLL_LEAVE_APPLICATION_STATUS);
		
		selectByVisibletext(locators.SELECT_LEAVE_APPLICATION_STATUS, "Approved");
		locators.SAVE_LEAVE_APPLICATION_STATUS.click();
		waitForElementClickable(locators.CLICK_ACTION_BUTTON);
		locators.CLICK_ACTION_BUTTON.click();
		locators.CLICK_ACTION.click();
		locators.CLICK_APPROVE.click();

	}

}