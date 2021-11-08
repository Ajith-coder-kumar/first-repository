package orgseleniumday4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium class notes\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//Launch Browser
	WebDriver driver=new ChromeDriver();
		
		//Open Web Page
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btnclickElement = driver.findElement(By.xpath("//span[@title='Overview']"));
		btnclickElement.click();
		Thread.sleep(1000);
		
		WebElement btnclickElement1 = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies S')][1]"));
		 String data = btnclickElement1.getText();
		 System.out.println(data);
		
	}

}
