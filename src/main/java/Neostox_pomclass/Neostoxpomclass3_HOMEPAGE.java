package Neostox_pomclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Neostox_pom_testngUsingPropertyfile.Utilityclass_neostox;



public class Neostoxpomclass3_HOMEPAGE {
	@FindBy(id="lbl_username")private WebElement username;
	@FindBy(id="lbl_curbalancetop")private WebElement balance;
	@FindBy (xpath="//span[text()='Logout']']")private WebElement logoutbutton;
	@FindBy (xpath="//a[text()='ok'])[2]")private WebElement popupOkbutton;
	@FindBy (xpath="//a[text()='close'])[5]")private WebElement popupClosebutton;
	public Neostoxpomclass3_HOMEPAGE (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getusername() {
			String actualusername = username.getText();
			Reporter.log("getting actual username..",true);
		return actualusername ;}
		
		
		public  String getbalance()
		{
		String actualbalance = balance.getText();
		Reporter.log("getting balance..",true);
	return actualbalance ;
		}
	public void handlepopup(WebDriver driver) {
		Utilityclass_neostox.Wait(driver, 500);
		popupOkbutton.click();
		Utilityclass_neostox.Wait(driver, 500);
		Utilityclass_neostox.scrollintoview(driver, popupClosebutton);
		popupClosebutton.click();
Reporter.log("handling popup",true);
	}
public void logoutfromapplication(WebDriver driver)
			{
			username.click();
			Utilityclass_neostox.Wait(driver, 500);
			logoutbutton.click();
			Reporter.log("logging out..",true);
			
			}
}
