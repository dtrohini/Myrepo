package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	public static void main(String[] args) {
		
System.setProperty("webdriver.Chrome.Driver","C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
//	driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
//	Alert alt=driver.switchTo().alert();
//	alt.accept();
	
//	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
//	Alert alt=driver.switchTo().alert();
//	alt.dismiss();
//	String text=driver.findElement(By.id("demo")).getText();
//	System.out.println(text);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	Alert alt=driver.switchTo().alert();
	alt.sendKeys("Pramod");
	alt.accept();
	String text=driver.findElement(By.id("demo1")).getText();
	System.out.println(text);
	}

}
