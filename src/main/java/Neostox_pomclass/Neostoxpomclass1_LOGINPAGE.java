package Neostox_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Neostox_pom_testngUsingPropertyfile.Utilityclass_neostox;

public class Neostoxpomclass1_LOGINPAGE {

	
	//variable declaration
	
		@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobilenofield;
		@FindBy(xpath="//a[@id=\"lnk_signup1']")private WebElement signin;
		
		
		//variable initialization
		
		public Neostoxpomclass1_LOGINPAGE(WebDriver driver)//initialize variable using constructor
		
		{
		PageFactory.initElements(driver, this);
		}
		//variable use
		public void entermobileno(WebDriver driver,String mob)
		{
			
			Utilityclass_neostox.Wait(driver, 1000);	
		mobilenofield.sendKeys(mob);
		Reporter.log("sending mobile number..",true);
		}
		
		public void clicksigninbutton(WebDriver driver)// webdriver driver this is for wait
		{
			signin.click();
			Utilityclass_neostox.Wait(driver, 1000);
			Reporter.log("clicking on sign in button...",true);
		}
	}


