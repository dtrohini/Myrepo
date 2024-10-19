package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

//What is Frame:Is a html document inside any other html document it means any webpage inside any other webpage its called Frame.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dtroh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");

		// Total no of Frames:
//			int total = driver.findElements(By.tagName("iframe")).size();//select with <iframe>
//			System.out.println(total);

		// 1.Single Frame:
		 driver.switchTo().frame(0);//By index
		 //driver.switchTo().frame("singleframe");//By Id
		// driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"singleframe\"]")));//By
		 //WebElment
		 driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Lucky");

		// 2.Nested Frame
//			driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
//			Thread.sleep(2000);
//			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
//			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Tester");

		// 3.Switch over Parent Frame or web page
		//	Thread.sleep(2000);
		// driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]")).click();
		//	driver.close();

	}

}
