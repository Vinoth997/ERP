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

	@FindBy(xpath = "//input[@data-fieldname='first_name']")
	public WebElement EMPLOYEE_FIRSTNAME;

	@FindBy(xpath = "//input[@data-fieldname='last_name']")
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

	@FindBy(xpath = "//div[@id='alert-container']//../div[@class='alert-message']")
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

	@FindBy(xpath = "//input[@data-fieldname='from_date']")
	public WebElement LEAVE_FROM_DATE;

	@FindBy(xpath = "//input[@data-fieldname='to_date']")
	public WebElement LEAVE_TO_DATE;

	@FindBy(xpath = "//button[@data-label='Save']")
	public WebElement LA_SAVE_BUTTON;

	@FindBy(xpath = "(//span[text()=' Draft'])[1]/preceding::a[@data-doctype='Leave Application']")
	public WebElement CLICK_DRFT_LEAVE_APPLICATION;

	@FindBy(xpath = "(//div[@class='row form-section card-section visible-section' ][2])")
	public WebElement SCROLL_LEAVE_APPLICATION_STATUS;

	@FindBy(xpath = "//select[@data-fieldtype='Select' and @data-doctype='Leave Application']")
	public WebElement SELECT_LEAVE_APPLICATION_STATUS;

	@FindBy(xpath = "//button[@data-label='Save']")
	public WebElement SAVE_LEAVE_APPLICATION_STATUS;

	@FindBy(xpath = "(//span[text()=' Draft'])[1]")
	public WebElement LEAVE_APPLICATION_STATUS;

	@FindBy(xpath = "//div[@class='actions-btn-group']//span[@data-label='Actions']/ancestor::button")
	public WebElement CLICK_ACTION_BUTTON;

	@FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-menu-right show\"]//span[@data-label='Approve']")
	public WebElement CLICK_APPROVE;
	
	@FindBy(xpath = "//span[@class='menu-item-label' and text()='pprove']")
	public WebElement CLICK_ACTION;

	@FindBy(xpath = "//div[@class='msgprint']")
	public WebElement LEAVE_APPLICATION_ALERT_MESSAGE;

}
