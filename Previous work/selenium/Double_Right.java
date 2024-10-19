package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Right {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.Driver",
				"C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		// DoubleClick
		WebElement dclick = driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
		Actions act = new Actions(driver);
		act.doubleClick(dclick).perform();

		// RightClick
//      WebElement rclick=driver.findElement(By.xpath("//*[@id=\"textbox1\"]"));
//      Actions act=new Actions(driver);
//      act.contextClick(rclick).perform();

	}
}
