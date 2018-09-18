package projectfox.projectfox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signuppage {
	
	WebDriver driver;
	
	By firstname = By.name("signupFirstName");
	By lastname = By.name("signupLastName");
	By email = By.name("signupEmail");
	By password = By.name("signupPassword");
	By gender = By.cssSelector(".AccountSignupDropdown_container_14l8_");
	By birthdate = By.xpath("//input[@placeholder='Birthdate']");
	By create = By.xpath("//button[@class='Account_defaultButton_1_BBq Account_desktopButton_c7YuN']");
	
	
	public void signup(WebDriver driver) {
		
		this.driver = driver;
	}

	public void setfirstname(String strfname) {
		
		driver.findElement(firstname).sendKeys(strfname);
		
	}
	
	public void setlastname(String lname) {
		
		driver.findElement(lastname).sendKeys(lname);
	
	}
	
	public void setemail(String mail) {
		
		driver.findElement(email).sendKeys(mail);
	}
	
	public void setpassword(String pass) {
		
		driver.findElement(password).sendKeys(pass);
		
	}
	
	public void setgender() {
		
		driver.findElement(gender).click();
		//driver.findElement(By.cssSelector(".AccountSignupDropdown_item_SGgzW")).click();
	}
	
	public void setbirth(String date) {
		driver.findElement(birthdate).sendKeys(date);
		
	}
	
	public void clickcreate() {
		driver.findElement(create).click();
	}
	
	public void selectgender() {
		driver.findElement(By.cssSelector(".AccountSignupDropdown_item_SGgzW")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
