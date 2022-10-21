package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopComMyaccount {
	@FindBy (xpath="(//a[@href='/computers'])[1]")private WebElement compuer;
	@FindBy (xpath="(//a[@href='/notebooks'])[1]")private WebElement notebook;
	@FindBy (xpath="//input[@name='Email']")private WebElement email;
	@FindBy (xpath="//input[@id='Password']")private WebElement password;
	@FindBy (xpath="(//button[@type='submit'])[2]")private WebElement login;
	
	
	public NopComMyaccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickLogin() {
		login.click();
	}
	
	
	

}
