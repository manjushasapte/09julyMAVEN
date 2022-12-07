package Neostox_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Neostox_pom_testngUsingPropertyfile.Utilityclass_neostox;

public class Neostoxpomclass2_PASSWORDPAGE {

	//variable declaration
	
	@FindBy(id="txt_accesspin")private WebElement passwordfield;
	@FindBy(id="lnk_submitaccesspin")private WebElement submitbutton;
	
	
	//variable initialization
	
	public Neostoxpomclass2_PASSWORDPAGE (WebDriver driver)//initialize variable using constructor
	
	{
	PageFactory.initElements(driver, this);
	}
	//variable use
	public void enterpassword(WebDriver driver,String pass)//webdriver driver for wait
	{
	Utilityclass_neostox.Wait(driver, 1000);
	passwordfield.sendKeys(pass);
	Reporter.log("sending password..",true);
	}
	public void clickonsubmitbutton(WebDriver driver)//webdriver driver forwait
	{
		Utilityclass_neostox.Wait(driver, 1000);
		submitbutton.click();
		Reporter.log("clicking on submit button..",true);
	}
	



	
}