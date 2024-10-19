package Ecommakeit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	WebDriver driver;
	
	public void setup(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:60015/");
	}
	
	//public void Login() {
		//WebElement Username = driver.findElement(By.xpath(""));	
		//WebElement Password = driver.findElement(By.xpath(""));
		//WebElement loginButton = driver.findElement(By.xpath(""));
		
		//Username.sendKeys("admin");
		//Password.sendKeys("admin");
		//loginButton.click();
		
	//}
	public static void main(String[] args) {
		LoginTest test = new LoginTest();
		test.setup();
		//test.Login();
	}

}
