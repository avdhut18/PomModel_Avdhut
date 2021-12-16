package testjava;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLoginWithCorrectCred() {
		login.login();
	}
	
	@Test
	public void verifyTitleOfLoginPage() {
		login.verifyPageTitle("OrangeHRM");
	}
	
	@Test
	public void verifyLoginPageUrl() {
		login.verifyPageUrl("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void verifyLoginBtnIsClickable() {
		login.verifyLoginBtnClickable();
	}
}
