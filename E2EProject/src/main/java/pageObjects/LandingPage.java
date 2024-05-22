package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//1.PAGE WHEN LOADING www.qaclickacademy.com and click on "login"
public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='rahulshettyacademy.com/sign_in']");
	By title=By.xpath("//div[@class='text-center']/h2");
	By navigation=By.cssSelector("[role='navigation']");
	//By header=By.cssSelector("div[class*=video-banner] h3");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getLogin()
	{
	return driver.findElement(signin);
	// LogingPage lg=new LogingPage(driver);
	// return lg;
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavigation()
	{
		return driver.findElement(navigation);
	}
	/*public WebElement getHeader()
	{
		return driver.findElement(header);
	}*/
}
