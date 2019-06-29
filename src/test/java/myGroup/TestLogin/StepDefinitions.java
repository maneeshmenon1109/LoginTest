package myGroup.TestLogin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myGroup.Modules.LoginScenario;

public class StepDefinitions {

	public static WebDriver driver = null; 

	public void setUp(){ 
		String driverPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath+"\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
	} 

	@Given("^The application is launched$") 
	public void goToApplication() { 

		setUp();

		//Navigating to page
		driver.navigate().to("http://localhost:8085/login"); 
	} 


	@When("^all input fields are available$") 
	public void validatePage()
	{
		LoginScenario loginObject=new LoginScenario();
		loginObject.FieldValidation();
	}


	@And("^Enter the valid \"(.*)\" and valid \"(.*)\" with case-sensitive$")
	public void EnterInput_1(String strUsername,String strPassword)
	{
		LoginScenario loginObject=new LoginScenario();
		loginObject.LoginValidation(strUsername, strPassword);
	}

	@Then("^it should be navigated to result page$")
	public void postiveValidation1()
	{
		try {
			WebElement weHeading=driver.findElement(By.xpath("//*[@selid='autoHeading']"));
			if(weHeading.isDisplayed()) {
				System.out.println("Validation Success");
				Assert.assertTrue(true);
			}else {
				System.out.println("Validation Failed");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			System.out.println("Validation Failed");
			Assert.assertTrue(false);
		}
	}

	@Then("^Role of use should be displayed result page$")
	public void postiveValidation2()
	{
		try {
			WebElement weRule=driver.findElement(By.xpath("//div[@selid='autoRole']/p"));
			if(weRule.isDisplayed()) {
				System.out.println("Validation Success");
				Assert.assertTrue(true);
			}else {
				System.out.println("Validation Failed");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			System.out.println("Validation Failed");
			Assert.assertTrue(false);
		}
	}

	@Then("^Proper Error Message should be displayed in the Login page$")
	public void negativeValidation1()
	{
		try {
			WebElement weMessage=driver.findElement(By.xpath("//*[@id='displayMsg']"));
			if(weMessage.isDisplayed()) {
				System.out.println("Validation Success");
				Assert.assertTrue(true);
			}else {
				System.out.println("Validation Failed");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			System.out.println("Validation Failed");
			Assert.assertTrue(false);
		}

	}

	@And("^Enter the valid \"(.*)\" and Invalid \"(.*)\"$")
	public void EnterInput_2(String strUsername,String strPassword)
	{
		LoginScenario loginObject=new LoginScenario();
		loginObject.LoginValidation(strUsername, strPassword);
	}	

	@And("^Enter the Invalid \"(.*)\" and valid \"(.*)\"$")
	public void EnterInput_3(String strUsername,String strPassword)
	{
		LoginScenario loginObject=new LoginScenario();
		loginObject.LoginValidation(strUsername, strPassword);
	}	

	@And("^Enter the valid \"(.*)\" and valid \"(.*)\" with case-insensitive$")
	public void EnterInput_4(String strUsername,String strPassword)
	{
		LoginScenario loginObject=new LoginScenario();
		loginObject.LoginValidation(strUsername, strPassword);
	}	


	@After
	public void closure() throws InterruptedException
	{
		Thread.sleep(3000);
		CucumberResultsOverview results = new CucumberResultsOverview();
		results.setOutputDirectory(".//target//cucumber");
		results.setOutputName("Cucumber Report");
		results.setSourceFile(".//target//cucumber//Cucumber.json");
		try {
			results.executeFeaturesOverviewReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
	}

}


