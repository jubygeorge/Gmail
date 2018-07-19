package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;	

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginStepDefinitions {
	WebDriver driver;
	@Given("^The user is already in the gmail login page$")
	public void UserInLoginPage() {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\George\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		//js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		String title=driver.getTitle();
		Assert.assertEquals("Gmail", title);
		System.out.println(title);
	    
	}

	@When("The user enters the valid username")
	public void the_user_enters_the_valid_username() {
		WebElement UserName = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		UserName.sendKeys("jubygeo33@gmail.com");
	    
	}

	@When("The user press Next button to enter password")
	public void the_user_press_Next_button_to_enter_password() {
		WebElement nextButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content/span"));
		nextButton.click();
	    
	}
	@Then("The user enters the valid password")
	public void the_user_enters_the_valid_password() {
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("perumbil00");
	    
	}
	@Then("The user press Next button to login")
	public void the_user_press_Next_button_to_login() 
	{
		WebElement next1;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		next1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content/span")));
   		next1.click();
   		
	}

	@Then("The user is able to login to the account and successfully logs out")
	public void the_user_is_able_to_login_to_the_account() {
	   String loginPageTitle = driver.getTitle();
	   Assert.assertEquals("Gmail", loginPageTitle);
	   driver.close();
	}
	



}
