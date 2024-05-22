package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LogingPage;
import pageObjects.portalHomepage;
import resources.Base;

public class stepDefinition extends Base
{
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=InitializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);//here url is passing through feature file & is passing through arg1

	}

	 @And("^Click on login link in the home page to land on secure Sign in page$")
	    public void click_on_login_link_in_the_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		 LandingPage lp=new LandingPage(driver);
			lp.getLogin().click();
	 }
	

	@When("^User enters \"([^\"]*)\" ang \"([^\"]*)\" and logs in$")
	public void user_enters_ang_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LogingPage lg=new LogingPage(driver);
		lg.getEmail().sendKeys(arg1);
		lg.getPassword().sendKeys(arg2);
		//System.out.println(text);
		//log.info(text);
		lg.getLogin().click();
	}

	@Then("^Verify that user is successfully log in$")
	public void verify_that_user_is_successfully_log_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    portalHomepage p=new portalHomepage(driver);
	    Assert.assertTrue(p.getSearchBox().isDisplayed());
	}

}