package feb3;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

/* This is working 
		System.setProperty("webdriver.chrome.driver", "/Users/ambuj.namdeo/Documents/Ambuj/Learning/drivers/chromedriver");
*/

/* We can simply put the unix excutable file of either chromedriver or geckodriver direclty to "/usr/local/bin" folder,
		this will stop the dependency to setting of setProperty. 
*/
		
// Launching chrome without set property  - because issue was with chrome driver version	
		
	//	System.setProperty("webdriver.chrome.driver", "/Users/ambuj.namdeo/Documents/Ambuj/Learning/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement homeEle = driver.findElement(By.xpath("//a[.='Home']"));
		
		homeEle.click();
		
		WebElement regEle = driver.findElement(By.xpath("//a[.='REGISTER']"));

		regEle.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		
		firstName.sendKeys("Ambuj");

		
		
   //     driver.quit();


 // Launching Firefox browser
	/*	System.setProperty("webdriver.gecko.driver","/Users/ambuj.namdeo/Documents/Ambuj/Learning/drivers/geckodriver");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("http://www.google.com");
*/
	}

}
