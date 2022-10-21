package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pojo.DriverStatic;

public class NopComLoginPage extends DriverStatic{
	@FindBy (xpath="//a[@class='ico-register']")private WebElement register;
	@FindBy (xpath="//input[@id='gender-male']")private WebElement male;
	@FindBy (xpath="//input[@id='FirstName']")private WebElement firstName;
	@FindBy (xpath="//input[@id='LastName']")private WebElement lastName;
	@FindBy (xpath="//select[@name='DateOfBirthDay']")private WebElement daydropDown;
	@FindBy (xpath="//select[@name='DateOfBirthMonth']")private WebElement monthdropDown;
	@FindBy (xpath="//select[@name='DateOfBirthYear']")private WebElement yeardropDown;
	@FindBy (xpath="//input[@id='Email']")private WebElement email;
	@FindBy (xpath="//input[@id='Password']")private WebElement password;
	@FindBy (xpath="//input[@id='ConfirmPassword']")private WebElement confirmPassword;
	@FindBy (xpath="//button[@id='register-button']")private WebElement confirmRegister;
	@FindBy (xpath="//a[text()='Log in']")private WebElement login;
	
	
	
	public NopComLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnRegister() {
		register.click();
	}
	public void clickOnmale() {
		male.click();
	}
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}
	public void selectDay() {
		Select select = new Select(daydropDown);
		select.selectByIndex(2);
	}
	public void selectMonth() {
		Select select = new Select(monthdropDown);
		select.selectByIndex(3);
	}	
	public void selectYear() {
		Select select = new Select(yeardropDown);
		select.selectByIndex(6);
	}	
	public void enterEmail(String emailid) {
		email.sendKeys(emailid);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void enterconfirmPassword(String confirmpass) {
		confirmPassword.sendKeys(confirmpass);
	}
	public void clickOncofirmRegister() {
		confirmRegister.click();
	}
	public void clickLogin() {
		Actions act = new Actions(driver);
		act.moveToElement(login);
		act.perform();
		login.click();
	}
	

}
