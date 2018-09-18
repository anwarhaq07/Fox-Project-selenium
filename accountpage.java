package projectfox.projectfox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class accountpage {
	
	WebDriver driver;
	
	By signup = By.tagName("button");
	By login = By.xpath("//button[@class='Account_signIn_Q0B7n']");
	By email = By.name("signinEmail");
	By pass = By.name("signinPassword");
	By button = By.xpath("//button[@class='Account_desktopButton_c7YuN']");
	
	public void login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setsignup(WebDriver driver) {
		driver.findElement(signup).click();
	}

	public void setlogin(WebDriver driver) {
		driver.findElement(login).click();
	}
	
	public void setemail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	
	public void setpassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	
	public void clickbutton() {
		driver.findElement(button).click();
	}
}
