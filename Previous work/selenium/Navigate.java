package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//forward
		driver.navigate().forward();
		driver.get("https://www.facebook.com/");
		
		//back
		driver.navigate().back();
		
		//Refresh
		driver.navigate().refresh();	
	}}

