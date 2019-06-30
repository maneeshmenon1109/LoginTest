package myGroup.TestLogin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "json:target/cucumber/Cucumber.json",
				 "usage:target/cucumber/Cucumber.json", 
				"junit:target/cucumber/Cucumber.xml",
				 "html:target/cucumber"},
		features= {"login.feature"},
		tags= {"@Testtag"},
		//tags= {"@positive-1"},
		glue={"myGroup/TestLogin"},
		monochrome = true
		)
public class TestRunner {
	
	

}
