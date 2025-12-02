package Practice;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_MouseHover {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.linkText("Electronics"));
		action.moveToElement(element).build().perform();
		
		WebElement element1 = driver.findElement(By.linkText("Apple"));
		action.moveToElement(element1).click().build().perform();
		
		Thread.sleep(2000);
		driver.close();
	}

}
