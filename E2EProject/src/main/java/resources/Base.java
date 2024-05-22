package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver InitializeDriver() throws IOException
	{
	    prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\STUDY MATERIALS\\JAVA_WORKSPACE\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");//read data from maven
		//String browserName=prop.getProperty("browser");//read data from the property file
		System.out.println(browserName);
		
		
		//Executing in headless mode
		if(browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions options=new ChromeOptions();
			if(browserName.contains("headless"))
			{
				options.addArguments("headless","user-agent=mrbean");//heart of this mode of execution
			}
		    driver=new ChromeDriver(options);
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("IE"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	
	}

public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;//ts is responsible for taking screenshot
	File source=ts.getScreenshotAs(OutputType.FILE);//This file has the screenshot of the failed method which is taken by selenium but copy is not in the local system
	String destination=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source, new File(destination));//will give error so need to add apache common io dependenct
	return destination;
}



}















