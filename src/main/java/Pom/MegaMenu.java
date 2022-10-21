package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pojo.DriverStatic;

public class MegaMenu extends DriverStatic{
	@FindBy (xpath="(//a[@href='/computers'])[1]") private WebElement computer;
	@FindBy (xpath="(//a[@href='/notebooks'])[1]") private WebElement notebook;
	@FindBy (xpath="(//button[text()='Add to cart'])[4]")private WebElement product;
	
	
	public MegaMenu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void moveToCompuer() {
		Actions act = new Actions(driver);
		act.moveToElement(computer);
		act.perform();
	}
	public void clickOnNotebook() {
		notebook.click();
	}
	public void clickProduct() {
		Actions act = new Actions(driver);
		act.moveToElement(product);
		act.perform();
		product.click();
	}
	
	

}
