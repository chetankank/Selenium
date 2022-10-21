package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Pojo.DriverStatic;

public class Screenshot extends DriverStatic {
public static void getScreenshot(String name) throws IOException {
	TakesScreenshot t = (TakesScreenshot)driver;
	File source =t.getScreenshotAs(OutputType.FILE);
	File destination = new File("F:\\backup\\e\\software java\\eclipse\\NopCom\\screenshot\\" +name +".png");
	FileHandler.copy(source, destination);
}
}
