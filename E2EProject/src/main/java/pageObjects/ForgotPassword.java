package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//2.PAGE AFTER CLICKING on "login" & PROVIDE USERNAME AND PASSWORD
public class ForgotPassword {
	
	public WebDriver driver;
	
	//By email=By.cssSelector("input[id='user_email']");
	By email=By.id("user_email");
	By sendinstrn=By.cssSelector("[type='submit']");
	
	
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

    
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	



	public WebElement SendInstn() {
		// TODO Auto-generated method stub
		return driver.findElement(sendinstrn);
	}
	

}
