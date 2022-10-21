package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Pojo.DriverStatic;



public class Listners extends DriverStatic implements ITestListener{
public void onTestSuccess(ITestResult result) {
	System.out.println("Test is successful" + result.getName());
}
public void onTestFailure(ITestResult result) {
	try {
		Screenshot.getScreenshot(result.getName());
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
public void onTestSkipped(ITestResult result) {
	System.out.println("Test is skipped" + result.getName());
}
public void onTestStart(ITestResult result) {
	System.out.println("test is started" + result.getName());
}
}