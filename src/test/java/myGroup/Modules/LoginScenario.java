package myGroup.Modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myGroup.TestLogin.StepDefinitions;

public class LoginScenario {

	WebDriver dr= StepDefinitions.driver;
	static String pageLoadStatus = null;
	static JavascriptExecutor js;



	public boolean FieldValidation() {


		boolean flag =true;
		try {
		WebElement weUsername=dr.findElement(By.xpath("//*[@selid='autoUser']"));
		WebElement wePassword=dr.findElement(By.xpath("//*[@selid='autoPassword']"));
		WebElement weSubmit=dr.findElement(By.xpath("//*[@selid='autoButton']"));


		//checking the field username existence
		if(weUsername.isDisplayed() || weUsername.isEnabled()) {
			System.out.println("UserName exists");
		}else {
			flag=false;
			System.out.println("UserName Doesn't exists");
		}


		//checking the field password existence
		if(wePassword.isDisplayed() || wePassword.isEnabled()) {

			System.out.println("Password exists");
		}else {
			flag=false;
			System.out.println("Password Doesn't exists");
		}


		//checking the login button existence
		if(weSubmit.isDisplayed() || weSubmit.isEnabled()) {

			System.out.println("Submit exists");
		}else {
			flag= false;
			System.out.println("Submit Doesn't exists");
		}
		}
		catch(Exception e)
		{
			Assert.assertTrue(false);
		}

		return flag;
	}

	public void LoginValidation(String strUsername, String strPassword) {
		try {
			waitForPageLoad();
			Thread.sleep(3000);
			if (FieldValidation())
			{
				WebElement weUsername=dr.findElement(By.xpath("//*[@selid='autoUser']"));
				WebElement wePassword=dr.findElement(By.xpath("//*[@selid='autoPassword']"));
				WebElement weSubmit=dr.findElement(By.xpath("//*[@selid='autoButton']"));


				weUsername.sendKeys(strUsername);
				wePassword.sendKeys(strPassword);
				Thread.sleep(3000);
				weSubmit.click();
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Failed in Primary checks");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			System.out.println("Failed to load the Page");
			Assert.assertTrue(false);
		}

	}

	public void waitForPageLoad() {

		do {
			js = (JavascriptExecutor) dr;
			pageLoadStatus = (String)js.executeScript("return document.readyState");
		} 
		while ( !pageLoadStatus.equals("complete") );	
		System.out.println("Page Loaded.");
	}

}
