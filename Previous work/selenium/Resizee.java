package selenium;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizee {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.Chrome.Driver","C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/resizable/");

   driver.switchTo().frame(0);   
	WebElement	rs=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(rs, 350, 100).perform();
	
	

}
}