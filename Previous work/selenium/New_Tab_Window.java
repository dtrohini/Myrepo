package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Tab_Window {
	
public static void main(String[] args){
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
	//New Tab	
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.facebook.com/");
 
     //New Window
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://demo.automationtesting.in/Register.html");
       
}
}