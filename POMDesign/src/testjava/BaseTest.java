package testjava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.LoginPage;

public class BaseTest extends BaseClass {
	
	@BeforeSuite
	public void WebBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void pageObject() {
		login = new LoginPage(driver);
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
