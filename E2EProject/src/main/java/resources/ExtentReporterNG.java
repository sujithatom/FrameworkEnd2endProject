package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	 static ExtentReports extent;
	
 public  static ExtentReports getReportObject()//This method is responsible to complete all configurations
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";//user.dir will give the project path until extended report
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);//responsible to create html file and configurations
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sujitha George");//Tester name
		return extent;
		
	}

}
