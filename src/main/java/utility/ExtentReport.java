package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
 public static ExtentReports getReports() {
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(spark);
	extent.setSystemInfo("reported by", "Chetan");
	extent.setSystemInfo("TestType", "Regression");
	return extent;
}
}
