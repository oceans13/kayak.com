package Flight;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.google.common.io.Files;

import TestScripts.com_kayak_createNewAccount;

public class com_kayak_driver_Init {
	WebDriver driver;
	By myAccnt=By.xpath("//*[text()='My account']");
	By signUp=By.xpath("//*[text()='Sign up']");
	By userName=By.id("qTOh-username");
	String uname="nirajkat787@gmail.com";
	
	//here we are navigating to the site of Kayak
	/*-------------------------------------------
	 *Author-Niraj , Date-04-04-2018
	 ------------------------------------------*/
public  void kayak_hmPage(WebDriver driver) throws IOException {
	this.driver=driver;
driver.get("https://www.kayak.co.in");//navigated to website
String siteTitle=driver.getTitle();
String expectedSiteTitle="Search Flights, Hotels & Rental Cars | KAYAK"; 
System.out.println(siteTitle);
if (siteTitle.equals(expectedSiteTitle));

	{  
		//TakesScreenshot ss= (TakesScreenshot)driver;
		
	    File inMemNow=driver.findElement(myAccnt).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(inMemNow,new File("Kayak001/src/main/resources"));
	    driver.findElement(myAccnt).click();
		driver.findElement(signUp).click();
		driver.findElement(userName).sendKeys(uname);
} 
}
	
}


