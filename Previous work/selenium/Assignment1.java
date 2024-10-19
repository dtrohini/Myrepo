package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.Driver","C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement male=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		//male.click();
		boolean m=male.isSelected();
		
		if (m==true) {
			
			WebElement cricket=driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
			cricket.click();
		
		}else {
			
			driver.findElement(By.id("checkbox3")).click();
			
		}
	
}
}