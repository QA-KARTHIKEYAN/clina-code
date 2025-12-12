package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Admin_login_loc;

public class Admin_login_stepdef {
	
	
	WebDriver driver;
    Admin_login_loc LP;
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
		Driverfactory.initDriver(); // Start driver
		driver = Driverfactory.getDriver(); // Get instance
		LP = new Admin_login_loc(driver);
		LP.openLoginPage();
		
	}

	    @When("user enters valid username and password")
	    public void user_enters_valid_username_and_password() {
	        System.out.println("User enters credentials");
	        LP.enterUsernamepassword("admin", "!Q2w3e4r");
	    }

	    @Then("user should be logged in")
	    public void user_should_be_logged_in() throws InterruptedException {
	        System.out.println("User is logged in");
	        LP.clickLoginButton();
	        Thread.sleep(1000);
	     WebElement message = driver.findElement(By.xpath("//div[@aria-label='Please enter valid email']"));
	    String tt =  message.getText();
	     System.out.println("message:"+ tt);
	     
	       
	    }
	    
	    
	    
	    
	}


