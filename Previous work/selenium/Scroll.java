package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			//Vertical scroll
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)");
			//Scroll down till the bottom of the page
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		
		
	}
}
