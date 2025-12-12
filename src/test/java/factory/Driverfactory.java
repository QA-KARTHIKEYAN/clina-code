package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
        return driver;
    }
	public static void initDriver() {
		if(driver==null) {	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();		
		}			
	}
	public static void quitDriver() {
		
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}

}
