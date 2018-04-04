package TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Flight.com_kayak_driver_Init;

public class com_kayak_createNewAccount {
	private WebDriver driver;
  @Test
public void  driverInit() throws IOException {
	  
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rathore\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.11.0\\selenium-chrome-driver-3.11.0.jar");
	 System.out.println("System property is set");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
	  WebDriverWait wait = new WebDriverWait(driver, 36000);
	  wait.until(ExpectedConditions.urlToBe("https://www.kayak.co.in"));
	  
	  com_kayak_driver_Init hp= new com_kayak_driver_Init();
	  hp.kayak_hmPage(driver);
  }
  
}
