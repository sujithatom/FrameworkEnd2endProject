 package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features",
		glue= "stepDefinitions")            //passing the information about feature file and the mapping file(stepdefinitionfile)
public class TestRunner {

}
