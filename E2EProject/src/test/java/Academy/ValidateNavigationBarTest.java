package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LogingPage;
import resources.Base;

public class ValidateNavigationBarTest extends Base {
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();//This method returns driver
		driver.get(prop.getProperty("url"));	
	}
	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		LandingPage lp=new LandingPage(driver);
		Assert.assertTrue(lp.getNavigation().isDisplayed());  
		log.info("Navigation bar is displayed");

		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
