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

public class ValidateTitleTest extends Base {
	public WebDriver driver;

	public static Logger log=LogManager.getLogger(Base.class.getName());
	//only declaring but not life
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();//This method returns driver
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));	
		log.info("Navigated to Home page");
	}
	@Test
	public void basePageNavigation() throws IOException     //TESTCASE 1
	{
		
		LandingPage lp=new LandingPage(driver);//giving life
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		log.info("Succesfully validated text message");
	}
	
	/*@Test
	public void ValidateHeader() throws IOException      //TESTCASE 2
	{
		
	 lp=new LandingPage(driver);
		//As the global variable got life from the object creation in testcase1 again dont want to create object
		Assert.assertEquals(lp.getHeader().getText(), "An Academy to learn Everything about Testing");
		//log.info("Succesfully validated text message");
	}*/
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
