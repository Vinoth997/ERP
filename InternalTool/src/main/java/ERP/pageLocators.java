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
	
	@FindBy(xpath = "//div[@class='standard-sidebar-section']//span[contains(text(),'HR')]")
	public WebElement HR_TAB;
	
	@FindBy(xpath = "//span[@title='Employee']/ancestor::div[contains(@class,'shortcut-widget-box')]")
	public WebElement EMPLOYEE_BUTTON;
	
	@FindBy(xpath = "//span[@data-label='Add%20Employee']/ancestor::button")
	public WebElement ADD_EMPLOYEE;
	
	@FindBy(xpath = "//input[@data-fieldname='first_name' and @data-doctype='Employee']")
	public WebElement EMPLOYEE_FIRSTNAME;
	
	@FindBy(xpath = "//input[@data-fieldname='last_name' and @data-doctype='Employee']")
	public WebElement EMPLOYEE_LASTNAME;
	
	@FindBy(xpath = "//input[@data-fieldname='gender']")
	public WebElement EMPLOYEE_GENDER;
	
	@FindBy(xpath = "//input[@data-fieldname='date_of_birth']")
	public WebElement EMPLOYEE_DOB;
	
	@FindBy(xpath = "//input[@data-fieldname='date_of_joining']")
	public WebElement EMPLOYEE_DOJ;
	
	@FindBy(xpath = "//input[@data-fieldname='leave_approver']")
	public WebElement EMPLOYEE_LEAVE_APPROVER;
	
	@FindBy(xpath = "//input[@data-fieldname='project_manager']")
	public WebElement EMPLOYEE_PROJECT_MANAGER;
	
	@FindBy(xpath = "//div[contains(text(),'Attendance and Leave Detail')]")
	public WebElement ATTENDANCE_LEAVE_BUTTON;
	
	@FindBy(xpath = "//input[@data-fieldname='leave_policy_detail']")
	public WebElement LEAVE_POLICY_DETAIL;

	@FindBy(xpath = "//input[@data-fieldname='holiday_list']")
	public WebElement HOLIDAY_LIST;

	@FindBy(xpath = "//input[@data-fieldname='default_shift']")
	public WebElement DEFAULT_SHIFT;

	@FindBy(xpath = "//div[contains(text(),'Previous Work Experience')]")
	public WebElement PREVIOUS_WORK_EXP_BUTTON;

	@FindBy(xpath = "//select[@data-fieldname='previous_work_exp']")
	public WebElement PREVIOUS_WORK_EXP_OPTION;

	@FindBy(xpath = "//button[@data-label='Save']")
	public WebElement EMPLOYEE_SAVE;
	
	@FindBy(xpath = "//div[@id='alert-container']//div[@class='alert-message']")
	public WebElement POPUP_ALERT;
	
	@FindBy(xpath = "//a[@class='close']")
	public WebElement CLOSE_POPUP_ALERT;
	
	@FindBy(xpath = "//a[@class='navbar-brand navbar-home']")
	public WebElement CLICK_APP_LOGO;
	
	@FindBy(xpath = "//span[text()='Leave Application']/ancestor::a")
	public WebElement LEAVE_APPLICATION_BUTTON;
	
	@FindBy(xpath = "//span[@data-label='Add%20Leave%20Application']/ancestor::button")
	public WebElement ADD_LEAVE_APPLICATION_BUTTON;
	
	@FindBy(xpath = "//div[contains(@class,'visible-section')]//input[@data-fieldname='employee']")
	public WebElement LA_EMPLOYEE_NAME;
	
	@FindBy(xpath = "//ul[@id='navbar-breadcrumbs']//a[contains(text(),'SS')]")
	public WebElement EMPLOYEE_ID;
	
	@FindBy(xpath = "(//tr/td[@class='text-right'])[1]")
	public WebElement TOTAL_ALLOCATED_LEAVE;
	
	@FindBy(xpath = "//input[@data-fieldname='salutation']")
	public WebElement EMPLOYEE_SALUTATION;
	
	@FindBy(xpath = "//input[@data-fieldname='annual_ctc']")
	public WebElement EMPLOYEE_ANNUAL_CTC;
	
	@FindBy(xpath = "//input[@data-fieldname='employment_type']")
	public WebElement EMPLOYMENT_TYPE;
	
	@FindBy(xpath = "//div[contains(text(),'ERPNext User')]")
	public WebElement ERPNEXT_USER_BUTTON;
	
	@FindBy(xpath = "//span[text()='Users']/ancestor::a")
	public WebElement USERS_TAB;
	
	@FindBy(xpath = "//span[@title='User']/ancestor::div[contains(@class,'widget-shadow')]")
	public WebElement USER_BUTTON;
	
	@FindBy(xpath = "//span[@data-label='Add%20User']/ancestor::button")
	public WebElement ADD_USER_BUTTON;
	
	@FindBy(xpath = "//label[text()='Email']/following::input[@data-fieldname='email']")
	public WebElement NEW_USER_EMAIL;
	
	@FindBy(xpath = "//label[text()='First Name']/following::input[@data-fieldname='first_name']")
	public WebElement NEW_USER_FIRSTNAME;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement NEW_USER_SAVE_BUTTON;
	
	@FindBy(xpath = "//div[@class='modal-dialog msgprint-dialog']")
	public WebElement NEW_USER_WELCOME_EMAIL_SENT_POPUP;
	
	@FindBy(xpath = "//div[@class='modal-dialog msgprint-dialog']//button[@class='btn btn-modal-close btn-link']")
	public WebElement NEW_USER_WELCOME_EMAIL_SENT_POPUP_CLOSE;
	
	@FindBy(xpath = "//input[@data-fieldname='user_id']")
	public WebElement EMPLOYEE_USER_ID;
	
	@FindBy(xpath = "//div[contains(text(),'Department and Grade')]")
	public WebElement DEPARTMENT_BUTTON;
	
	@FindBy(xpath = "//label[text()='Department']/../..//input[@data-fieldname='department']")
	public WebElement EMPLOYEE_DEPARTMENT;
	
	@FindBy(xpath = "//input[@data-fieldname='designation']")
	public WebElement EMPLOYEE_DESIGNATION;
	
	@FindBy(xpath = "//input[@data-fieldname='branch']")
	public WebElement EMPLOYEE_BRANCH;
	
	@FindBy(xpath = "//input[@data-fieldname='reports_to']")
	public WebElement EMPLOYEE_REPORTS_TO;
	
	@FindBy(xpath = "//input[@data-fieldname='attendance_device_id']")
	public WebElement ATTENDANCE_DEVICE_ID;
	
	@FindBy(xpath = "//div[contains(text(),'Salary Details')]")
	public WebElement SALARY_DETAILS_BUTTON;
	
	@FindBy(xpath = "//select[@data-fieldname='bond']")
	public WebElement EMPLOYEE_BOND;
	
	@FindBy(xpath = "//a[@href='/app/projects']")
	public WebElement PROJECTS_TAB;
	
	@FindBy(xpath = "//span[@title='Timesheet']/ancestor::div[contains(@class,'shortcut-widget-box')]")
	public WebElement TIMESHEET_BUTTON;
	
	@FindBy(xpath = "//span[@data-label='Add%20Timesheet']/ancestor::button")
	public WebElement ADD_TIMESHEET_BUTTON;
	
	@FindBy(xpath = "//input[@data-doctype='Timesheet' and @data-target='Employee']")
	public WebElement TIMESHEET_EMPLOYEE_ID;
	
	@FindBy(xpath = "//input[@data-fieldname='cus_resource_name']")
	public WebElement TIMESHEET_RESOURCE_NAMEFIELD;
	
	@FindBy(xpath = "//p[@title='Free Resource']/ancestor::li")
	public WebElement TIMESHEET_RESOUCE_NAME;
	
	@FindBy(xpath = "(//div[@class='data-row row']/div[@data-fieldname='activity_type'])[2]")
	public WebElement TIMESHEET_ACTIVITY_TYPE_BTN;
	
	@FindBy(xpath = "//input[@data-fieldname='activity_type']")
	public WebElement TIMESHEET_ACTIVITY_TYPE_FIELD;
	
	@FindBy(xpath = "//p[@title='Testing']/ancestor::li")
	public WebElement TIMESHEET_ACTIVITY_TYPE_NAME;
	
	@FindBy(xpath = "//input[@data-fieldname='from_time']")
	public WebElement TIMESHEET_DATE;
	
	@FindBy(xpath = "//input[@data-fieldname='hours']")
	public WebElement TIMESHEET_HOURS;
	
	@FindBy(xpath = "//input[@data-fieldname='project']")
	public WebElement TIMESHEET_PROJECT;
	
	@FindBy(xpath = "//button[@data-label='Save']")
	public WebElement TIMESHEET_SAVE_BUTTON;
	
	@FindBy(xpath = "//li[@class='disabled']/a[contains(@href,'/app/timesheet/')]")
	public WebElement TIMESHEET_ID;
	
	@FindBy(xpath = "//div[@class='msgprint']")
	public WebElement ALERT_TEXT_MESSAGE;
	
	@FindBy(xpath = "//label[text()='External Work History']/..//button[contains(text(),'Add Row')]")
	public WebElement EXTERNAL_WORK_HISTORY;
	
	@FindBy(xpath = "//input[@data-fieldname='company_name']")
	public WebElement WORK_EXP_COMPANY_NAME;
	
	@FindBy(xpath = "//input[@data-fieldname='designation' and @data-doctype='Employee External Work History']")
	public WebElement WORK_EXP_DESIGNATION;
	
	@FindBy(xpath = "//textarea[@data-fieldname='address' and @data-doctype='Employee External Work History']")
	public WebElement WORK_EXP_ADDRESS;
	
	@FindBy(xpath = "//input[@data-fieldname='total_experience_in_years' and @data-doctype='Employee External Work History']")
	public WebElement WORK_EXP_IN_YEARS;
	
	@FindBy(xpath = "//input[@data-fieldname='total_experience_in_months' and @data-doctype='Employee External Work History']")
	public WebElement WORK_EXP_IN_MONTHS;
	
	@FindBy(xpath = "//button[@data-fieldtype='Attach' and @data-doctype='Employee External Work History']")
	public WebElement WORK_EXP_ATTACH_CERTIFICATE_BUTTON;
	
	@FindBy(xpath = "//input[@type='file']")
	public WebElement CERTIFICATE_UPLOAD;
	
	@FindBy(xpath = "//button[@type='button' and text()='Upload']")
	public WebElement UPLOAD_BUTTON;
	
	@FindBy(xpath = "//kbd[text()='Ctrl + Up']")
	public WebElement SHORTCUT_KEY;
	
}
