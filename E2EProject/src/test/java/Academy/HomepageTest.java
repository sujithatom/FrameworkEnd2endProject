package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LogingPage;
import resources.Base;

public class HomepageTest extends Base {
	public WebDriver driver;//Declaring here bcz when test running parallelly there may get an error.now we have a local copy of it
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException
	{
		driver=InitializeDriver();//This method returns driver
		driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		lp.getLogin().click();
		LogingPage lg=new LogingPage(driver);
		lg.getEmail().sendKeys(username);
		lg.getPassword().sendKeys(password);
		//System.out.println(text);
		log.info(text);
		lg.getLogin().click();
		 //ForgotPassword fp=lg.ForgotPassword();
		// fp.getEmail().sendKeys("laura");
		// fp.SendInstn().click();
				
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="nonrestricted@123";
		data[0][2]="nonrestricted";
		data[1][0]="restricted@gmail.com";
		data[1][1]="restricted@123";
		data[1][2]="restricted";
		return data;
	}

}
