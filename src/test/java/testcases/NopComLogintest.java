package testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pojo.Browser1;
import Pojo.DriverStatic;
import Pom.MegaMenu;
import Pom.NopComLoginPage;
import Pom.NopComMyaccount;

public class NopComLogintest extends DriverStatic {
	
	@BeforeTest
	public void openEcomSite() {
	 driver = Browser1.openBrowser("https://demo.nopcommerce.com/");
	}
	@Test()
	public void ecomRegister() throws InterruptedException {
		NopComLoginPage nop = new NopComLoginPage(driver);
		nop.clickOnRegister();
		nop.clickOnmale();
		nop.enterFirstName("ajay");
		nop.enterLastName("patil");
		nop.selectDay();
		nop.selectMonth();
		nop.selectYear();
		nop.enterEmail("chyu@jni.com");
		nop.enterPassword("lk1256");
		nop.enterconfirmPassword("lk1256");
		nop.clickOncofirmRegister();
	
	}	
	@Test(priority=1)
	public void login() {
		NopComLoginPage nop = new NopComLoginPage(driver);
		nop.clickLogin();
	}
	@Test(priority =2)
	public void enterInAccount() {
		NopComMyaccount nop =new NopComMyaccount(driver);
		nop.enterEmail("chyu@jni.com");
		nop.enterPassword("lk1256");
		nop.clickLogin();
		System.out.println();
	}
	@Test(priority =3)
	public void purchaseNotebook() {
		MegaMenu menu= new MegaMenu(driver);
		menu.moveToCompuer();
		menu.clickOnNotebook();
		menu.clickProduct();
	}

}
