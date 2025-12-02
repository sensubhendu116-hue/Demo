package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
				 
				Thread.sleep(3000);
				
				Actions action = new Actions(driver);
				WebElement drag = driver.findElement(By.id("draggable"));
				WebElement drop = driver.findElement(By.id("droppable"));
				
				action.dragAndDrop(drag, drop).build().perform();
				
				Thread.sleep(3000);
				driver.close();

	}

}
