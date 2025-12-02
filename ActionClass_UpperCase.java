package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_UpperCase {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		
		WebElement element = driver.findElement(By.className("search-field"));
		
		//Create action class
		Actions actions = new Actions(driver);
		
		//click the textbox
		actions.click(element);
		
		//press shift key
		actions.keyDown(Keys.SHIFT);
		
		//type the message
		actions.sendKeys("hello");
		
		//release the shift key
		actions.keyUp(Keys.SHIFT);
		
		//Build all steps
		Action fullAction = actions.build();
		
		//perform the action
		fullAction.perform();
	}
}
