 package hrTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class implicitVsExplicit {
	
	WebDriver driver;
	
	@BeforeTest
	public void open() {
		
		
		

	    ChromeOptions options = new ChromeOptions();
//	    options.setHeadless(false);
	    options.addArguments("start-maximized"); // open Browser in maximized mode
	    options.addArguments("disable-infobars"); // disabling infobars
	    options.addArguments("--disable-extensions"); // disabling extensions
	    options.addArguments("--disable-gpu"); // applicable to Windows os only
	    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	    options.addArguments("--no-sandbox"); // Bypass OS security model
	    options.addArguments("--disable-in-process-stack-traces");
	    options.addArguments("--disable-logging");
	    options.addArguments("--log-level=3");
	    options.addArguments("--remote-allow-origins=*");

	    driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@Test
	public void browser() {
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement hideBtn = driver.findElement(By.xpath("//input[@value='Hide']"));
		WebElement showBtn = driver.findElement(By.xpath("//input[@value='Show']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(hideBtn));

	}

}
