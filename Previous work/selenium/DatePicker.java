package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.Driver","C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/");
		
	WebElement date=driver.findElement(By.name("bdaytime"));
	
	date.sendKeys("30/11/2023");
	
	date.sendKeys(Keys.TAB);
	
	date.sendKeys("15:19PM");
	
	WebElement submit=driver.findElement(By.xpath("/html/body/form/input[2]"));
	submit.click();
	
		
		
		
	}

}
