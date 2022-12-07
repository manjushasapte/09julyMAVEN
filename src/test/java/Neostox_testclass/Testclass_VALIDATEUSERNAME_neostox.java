package Neostox_testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Neostox_baseclass.baseclass_neostox;
import Neostox_pomclass.Neostoxpomclass1_LOGINPAGE;
import Neostox_pomclass.Neostoxpomclass2_PASSWORDPAGE;
import Neostox_pomclass.Neostoxpomclass3_HOMEPAGE;
import Neostox_utilityclass.Utilityclass_neostox;
@Listeners(Neostox_Listeners.Listener.class)
public class Testclass_VALIDATEUSERNAME_neostox extends baseclass_neostox{
Neostoxpomclass1_LOGINPAGE login;
Neostoxpomclass2_PASSWORDPAGE password;
Neostoxpomclass3_HOMEPAGE homepage;
  @BeforeClass
  public void launchneostox() throws IOException {
	  launchBrowser();
	  login=new Neostoxpomclass1_LOGINPAGE(driver);
      password=new Neostoxpomclass2_PASSWORDPAGE(driver);
      homepage=new Neostoxpomclass3_HOMEPAGE(driver);
	   }
  @BeforeMethod
  public void signintoneostox() throws InterruptedException, IOException {
	login.entermobileno(driver, Utilityclass_neostox.readdatafromPropertyfile("mobileno"));  
	Thread.sleep(1000);
	login.clicksigninbutton(driver);
	Thread.sleep(1000);
	password.enterpassword(driver, Utilityclass_neostox.readdatafromPropertyfile("password") );
	password.clickonsubmitbutton(driver);
	Thread.sleep(1000);
	homepage.handlepopup(driver);
  }
  @Test
  public void validateusername() throws IOException
  {Assert.assertEquals(homepage.getusername(),Utilityclass_neostox.readdatafromPropertyfile("expectedusername"),"TC failed,actual and expected username are not matching" );
}
  @AfterMethod
  public void logoutneostox() {
	homepage.logoutfromapplication(driver);  
  }
  @AfterClass
  public void closebrowser() {
	  driver.close();
  }}


