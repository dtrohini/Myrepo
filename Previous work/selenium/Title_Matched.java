package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Matched {
	
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");  
		 
		  String expectedtitle="register";
		  String actualtitle=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a")).getText();
		  System.out.println(actualtitle);
		  
			/*
			 * if (expectedtitle.equals(actualtitle)) {
			 * 
			 * System.out.println("Title is Matched");
			 * 
			 * } else {
			 * 
			 * System.out.println("Title is not Matched");
			 * 
			 * }
			 */
		  
		  
		  if (expectedtitle.equalsIgnoreCase(actualtitle)) {
				
			  System.out.println("Title is Matched");
			  
		} else {

			System.out.println("Title is not Matched");
			
		}
		
		
	}
}
