package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_ple {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.Driver","C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://omayo.blogspot.com/");

		WebElement	multi=driver.findElement(By.id("multiselect1"));
		//WebElement multi=d.findElement(By.id("drop1"));
		Select ml=new Select(multi);
		boolean multiple=ml.isMultiple();
		System.out.println(multiple);
		
			
}
}