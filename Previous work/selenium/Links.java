package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
//	int	total=driver.findElements(By.name("radiooptions")).size();
//	System.out.println(total);
	
	  List<WebElement> total=driver.findElements(By.name("radiooptions"));
		System.out.println(total.size());           //total.size() = 2
	
		               
		for (int i=0; i<total.size(); i++) {
			
			System.out.println(total.get(i).getAttribute("value"));
			
		}
	
}
}