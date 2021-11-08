package orgseleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium class notes\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		
		//Open Web Page
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor s = (JavascriptExecutor)driver;
		//Finding Target Locator
		WebElement text = driver.findElement(By.xpath("//p[@style='text-align:center;']"));
		String text2 = text.getText();
		
		//Print text of the locator
		System.out.println(text2);
		Thread.sleep(1000);
		
		//scroll down 
		s.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(1000);
		
		//scroll up
		s.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(1000);
		WebElement srldwn = driver.findElement(By.xpath("//a[text()='Adactin.com']"));
		
		s.executeScript("arguments[0].scrollIntoView;",srldwn);
	}
	

}
