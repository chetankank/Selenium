package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pojo.Browser1;
import Pojo.DriverStatic;
import Pom.NopComMyaccount;

public class NopComMyaccountTest extends DriverStatic {
	@BeforeMethod
	public void abc() {
		Browser1.openBrowser("https://www.facebook.com/");
	}
	@Test
	public void enterInAccount() {
		NopComMyaccount nop =new NopComMyaccount(driver);
		nop.enterEmail("chyu@jni.com");
		nop.enterPassword("lk1256");
		nop.clickLogin();
	}

}
