package projectfox.projectfox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {
	
	WebDriver driver;

	By label = By.id("path-1");
	
	public void clicklabel(WebDriver driver) {
		
		driver.findElement(label).click();
	}
	
}
