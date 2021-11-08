package orgseleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium class notes\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		
		//Open Web Page
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Locate condition element
		WebElement condition = driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=200545940&ref_=footer_cou']"));
		String text = condition.getText();
		
		//Print Condition text
		System.out.println(text);
	}

}
