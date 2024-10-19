package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Window {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.Driver","C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://omayo.blogspot.com/");
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());	
		
		
		
	}

}
