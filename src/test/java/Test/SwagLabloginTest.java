package Test;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pojo.Browser1;
import Pojo.DriverStatic;
import Pom.SwagLabLoginPage;
import utility.ExtentReport;
import utility.Parameter;

@Listeners(utility.Listners.class)
public class SwagLabloginTest extends DriverStatic {
ExtentReports extent;
ExtentTest test;
@BeforeTest
public void configureReport() {
	 extent =ExtentReport.getReports();
}
@BeforeMethod
public void openBrowser() {
	driver =Browser1.openBrowser("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
@Test
public void swaglabTest() throws EncryptedDocumentException, IOException {
	test =extent.createTest("swaglabTest");
	SwagLabLoginPage swag = new SwagLabLoginPage(driver);
	
	swag.enterUserName(Parameter.getexcelData("Second", 1, 3));
	swag.enterPassword(Parameter.getexcelData("Second", 1, 3));
	swag.clickLogin();
	String expectedTitle ="https://www.saucedemo.com/inventory.html";
	String actualTitle=driver.getCurrentUrl();
	Assert.assertEquals(actualTitle, expectedTitle);
}
 @AfterMethod
 public void addResult(ITestResult result) {
	 if(result.getStatus()==ITestResult.SUCCESS) {
		 test.log(Status.PASS, result.getName());
	 }
	 else if(result.getStatus()==ITestResult.FAILURE) {
		 test.log(Status.FAIL, result.getName());
	 }
	 else {
		 test.log(Status.SKIP, result.getName());
	 }
 }
 @AfterTest
  public void flushResult() {
	 extent.flush();
 }
}
