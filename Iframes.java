package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:/Selft_Practice/fExample1 1.html");
		
		//Find all iframes in the page
		List<WebElement> iframeElements= driver.findElements(By.tagName("iframe"));
		//print how mant iframes are present
		System.out.println("Total no of iframes are: "+ iframeElements.size());
		//switch to the first iframe (index starts from 1)
		driver.switchTo().frame(1);
		
		System.out.println("Frame Source: "+driver.getPageSource());
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.quit();

	}

}
