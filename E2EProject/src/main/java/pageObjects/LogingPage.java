package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//2.PAGE AFTER CLICKING on "login" & PROVIDE USERNAME AND PASSWORD
public class LogingPage {
	
	public WebDriver driver;
	
	By email=By.cssSelector("input[id='user_email']");
	//By email=By.id("user_email");
	By password=By.cssSelector("input[id='user_password']");
	By login=By.name("commit");
	//By forgotpswd=By.cssSelector("[href*='password/new']");
	
	
	public LogingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

    
	/*public ForgotPassword ForgotPassword()
	{
	 driver.findElement(forgotpswd).click();
	 return new ForgotPassword(driver);
	 
	}*/
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

}
