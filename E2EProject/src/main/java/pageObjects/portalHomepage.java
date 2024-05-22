package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//2.PAGE AFTER CLICKING on "login" & PROVIDE USERNAME AND PASSWORD
public class portalHomepage {
	
	public WebDriver driver;
	
	
	By searchbox=By.name("query");
	
	
	
	public portalHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

    
	/*public ForgotPassword ForgotPassword()
	{
	 driver.findElement(forgotpswd).click();
	 return new ForgotPassword(driver);
	 
	}*/
	public WebElement getSearchBox()
	{
		return driver.findElement(searchbox);
	}
	
	

}
