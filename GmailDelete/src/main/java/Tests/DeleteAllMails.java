package Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteAllMails {
	WebDriver driver;
	JavascriptExecutor js;
	@Given("The user is already logged in gmail")
	public void the_user_is_already_logged_in_gmail() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\George\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.get("http://www.gmail.com");
			String title=driver.getTitle();
			Assert.assertEquals("Gmail", title);
			System.out.println(title);
			WebElement UserName = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
			UserName.sendKeys("jubygeo33@gmail.com");
			WebElement nextButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content/span"));
			nextButton.click();
			WebElement password = driver.findElement(By.name("password"));
		    password.sendKeys("perumbil00");
		    WebElement next1;
			WebDriverWait wait = new WebDriverWait(driver, 100);
			next1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content/span")));
	   		next1.click();
		
	   
	}

	@When("The user selects all the mails from a particular sender spreading across multiple pages")
	public void the_user_selects_all_the_mails_from_a_particular_sender_spreading_across_multiple_pages() throws InterruptedException {
		WebElement SearchButton,SearchBox, Delete, SelectAll;
		js = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 50);
		SearchBox=driver.findElement(By.id("gbqfq"));
		SearchBox.sendKeys("Gmail Team ");
		SearchButton = driver.findElement(By.cssSelector("#gbqfb"));
		SearchButton.click();
		//.equals("SelectAll");
		SelectAll=driver.findElement(By.xpath("//*[@id=\":ix\"]/div[1]/span/div"));
      SelectAll.click();
       	WebElement button ;
     	button= driver.findElement(By.className("ar9.-I-J3.-J5-Ji"));
     	
    System.out.println(button.getText());
     	
             //Delete= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div[2]/div[3]/div/divv")));
       // Delete.click();
     	//Thread.sleep(100);
       // System.out.println("Delete all check box is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Select']")).isDisplayed()+"");
        //System.out.println("Delete all check box is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Select']")).isEnabled()+"");
        //driver.findElement(By.xpath("//div[@aria-label='Select']")).click();//Delete All Check BOX
        
        System.out.println("Check box selected");
        System.out.println("Delete button is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isDisplayed()+"");
        System.out.println("Delete button is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isEnabled()+"");
        //driver.findElement(By.xpath("//div[@aria-label='Delete']")).click();//Delete BUtton
       
                }
        		
           	   

	@When("The user clicks the delete button and deletes all the mails")
	public void the_user_clicks_the_delete_button_and_deletes_all_the_mails() {
		
		
	}

	@Then("The usr successfully logs out with appropriate message")
	public void the_usr_successfully_logs_out_with_appropriate_message() {
		driver.close();
	    
	}

	
	

}
