package locators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.Driverfactory;

public class Admin_login_loc {
	
	
	@FindBy(xpath="//input[@id='mat-input-0']")
    private WebElement txtUsername;
    @FindBy(xpath="//input[@id='mat-input-1']")
    private WebElement txtPassword;
    
    
   // private WebElement txtUsernameandpassword;
    
    
    @FindBy(xpath="//span[text()='Login']")
    private WebElement btnLogin;
    
    private WebDriver driver;

    public Admin_login_loc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
     
 	public void openLoginPage() {
       driver.get("https://xclinic.latlontech.com/#/doctor");
    }
    public void enterUsernamepassword(String user, String pwd) {
    	
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    wait.until(ExpectedConditions.visibilityOf(txtUsername));
    	    txtUsername.sendKeys(user);

    	    wait.until(ExpectedConditions.visibilityOf(txtPassword));
    	    txtPassword.sendKeys(pwd);
    	
//    	txtUsername.sendKeys(user);
//    	txtPassword.sendKeys(pwd);
    }


    public void clickLoginButton() {
        btnLogin.click();
    }
	
	

}
