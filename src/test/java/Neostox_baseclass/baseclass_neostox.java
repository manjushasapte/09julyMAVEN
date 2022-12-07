package Neostox_baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import Neostox_utilityclass.Utilityclass_neostox;


public class baseclass_neostox {
	
	
protected static WebDriver driver;

public void launchBrowser() throws IOException
{

	System.setProperty("webdriver.chrome.driver", "C:\\seleniun download\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(Utilityclass_neostox.readdatafromPropertyfile("devurl"));
	driver.manage().window().maximize();
	Utilityclass_neostox.Wait(driver, 1000);
	Reporter.log("launching browser..",true);
	
	
}

}


