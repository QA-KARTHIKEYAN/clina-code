package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UserCredentails.UserCredentials;
import database.DButils;
import factory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Admin_login_loc;

public class Admin_login_stepdef {
	
	//private UserCredentials userCredentials;
	//private DButils dButils;
	WebDriver driver;
    Admin_login_loc LP;
	

	@Given("user is on login page for role {string} from database")
	public void user_is_on_login_page(String role) throws Exception{
		System.out.println("User is on login page");
	//	userCredentials = DButils.getUserCredentialsByRole(role);
		
		Driverfactory.initDriver(); // Start driver
		driver = Driverfactory.getDriver(); // Get instance
		LP = new Admin_login_loc(driver);
		LP.openLoginPage();
		
	}

	    @When("user enters valid username and password")
	    public void user_enters_valid_username_and_password() throws Exception {
//	        System.out.println("User enters credentials");
//	        LP.enterUsernamepassword("admin", "!Q2w3e4r");
	    	
	    	
//	        String username = userCredentials.getUsername();
//	        String password = userCredentials.getPassword();
//
//	        System.out.println("Username: " + username);
//	        System.out.println("Password: " + password);
	        

	        // ✅ Fetch credentials from DB
	        UserCredentials user = DButils.getCredentials();

	        // ✅ Use DB values in UI
	        LP.enterUsernamepassword(
	            user.getUsername(),
	            user.getPassword()
	        );
	    }

	    @Then("user should be logged in")
	    public void user_should_be_logged_in() throws InterruptedException {
	      
	        LP.clickLoginButton();
	        Thread.sleep(1000);
//	     WebElement message = driver.findElement(By.xpath("//div[@aria-label='Please enter valid email']"));
//	    String tt =  message.getText();
//	     System.out.println("message:"+ tt);
	     
	       
	    }
	    
	    
	    
	    
	}


