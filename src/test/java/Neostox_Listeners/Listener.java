package Neostox_Listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Neostox_baseclass.baseclass_neostox;
import Neostox_utilityclass.Utilityclass_neostox;

public class Listener extends baseclass_neostox implements ITestListener {



public void onTestSuccess(ITestResult result) {
Reporter.log("TC"+result.getName()+"passed successfully",true);	
	
} 
public void onTestFailure(ITestResult result) {
Reporter.log("TC"+result.getTestName()+"failed",true);

{
		
					try {
						Utilityclass_neostox.screenshot(driver, result.getName());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 					
}}
	



