package Neostox_utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utilityclass_neostox {
	public static String readdatafromPropertyfile(String key) throws IOException {
	//crate object of properties class
	Properties prop=new Properties();
	//create object of fileinputstream and pass property file path
	FileInputStream myfile =new FileInputStream("C:\\Users\\visha\\eclipse-workspace\\9july c _morning_selenium\\Neostox_propertyfile");
prop.load(myfile);
String value=prop.getProperty(key);
Reporter.log("reading"+key+"from property file..",true);
return value;}
public static void screenshot(WebDriver driver,String name) throws IOException //use static method
, InterruptedException
		
	{	
		
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


	File destination=new File("C:\\Users\\visha\\OneDrive\\Documents\\screenshot\\trains"+source+".png");	
	FileHandler.copy(source, destination);
	Reporter.log("taking screenshot..",true);
	}
public static void Wait(WebDriver driver,int waittime) {
	
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
	 Reporter.log("waiting for"+waittime+"ms..",true);
}
public static void scrollintoview(WebDriver driver,WebElement element) 

{
	JavascriptExecutor js=(JavascriptExecutor)driver;	
	js.executeScript("arguments[0].scrollIntoView()", element)	;
	Reporter.log("scrolling to element..",true);
	}
	public static void scrollintoview(WebDriver driver,WebElement element,int a) 

{
	JavascriptExecutor js=(JavascriptExecutor)driver;	
	js.executeScript("arguments[0].scrollIntoView()", element)	;
	Reporter.log("scrolling to element..",true);
	}
}


