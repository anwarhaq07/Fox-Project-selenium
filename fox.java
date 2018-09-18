package projectfox.projectfox;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.internal.selenesedriver.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fox {
	
	homepage objhome;
	accountpage objaccount;
	signuppage objsignup;
	shows objshows;
	
	public class config {
		
		WebDriver driver;
		 
		@BeforeTest
		public void configuration() throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/anwarulhaqmohammed/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.fox.com/movies/battle-of-the-year_2013/");
		driver.manage().window().maximize();

		//driver.close();
	
		}
		
		/*@Test
		public void Signup() {
			
			objhome = new homepage();
			objaccount = new accountpage();
			objsignup = new signuppage();
			objshows = new shows();
		
			//on homepage towards account
			objhome.clicklabel(driver);
			
			//on account page towards signup
			objaccount.setsignup(driver);
			
			//Signing Up
			objsignup.signup(driver);
			objsignup.setfirstname("abc");
			objsignup.setlastname("xyz");
			objsignup.setemail("abc@xyz");
			objsignup.setpassword("password");
			objsignup.setgender();
			objsignup.selectgender();
			objsignup.setbirth("mm/dd/yyyy");
			objsignup.clickcreate();		
		}*/
		@Test
		public void login() {
			objaccount =new accountpage();
			driver.get("https://www.fox.com/account/");
			//objaccount = new accountpage();
			objaccount.setlogin(driver);
			
			//****important referencing driver to webpage or else throws null pointer exception 
			objaccount.login(driver);
			objaccount.setemail("abc@xyz");
			objaccount.setpassword("password");
			objaccount.clickbutton();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		@Test
		public void shows() {
			objshows = new shows();
			objshows.webdriver(driver);
			objshows.clickshows();
			objshows.size();
			
		}
		
		
	}
		
	}
	
	
	


