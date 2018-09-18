package projectfox.projectfox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.selenesedriver.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

public class shows {
	WebDriver driver;
	
	By show = By.xpath("//a[contains(text(),'Shows')]");
	By image = By.tagName("img");
	By ref = By.tagName("a");
	
	public void webdriver(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void clickshows() {
		
		driver.findElement(ref).click();
		driver.findElement(image).click();
		driver.findElement(show).click();

	}
	

}
