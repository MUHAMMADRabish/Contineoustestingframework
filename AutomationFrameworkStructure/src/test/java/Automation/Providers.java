package Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Comons.Utilbase;
import Pages.Create;
import Pages.Home;
import Pages.Sign;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Providers extends Utilbase{
	//WebDriver driver;
  /*@Test(dataProvider = "dtap",groups = {"Adhoc"})
  public void f(String n, String s) throws InterruptedException, IOException {
	  Home home=new Home(driver);
	  Sign login=new Sign(driver);
	  Create create=new Create(driver);
	  Actions actions=new Actions(driver);
	  SoftAssert ob=new SoftAssert();
	  WebElement SignInClick= home.Sigininbuttonclick();
	 WebElement SignInPage=home.SignInlink();
	  actions.moveToElement(SignInClick).build().perform();
	  actions.moveToElement(SignInPage).click().build().perform();
	 // shots();
	  login.UserNameFields(n);
	 //shots();
	  System.out.println(n);
	  login.Continuebuttonids();
	  login.PsswdFieldChar(s);
	  System.out.println(s);
	  login.SignToClick();
	  Thread.sleep(6000);
	  create.AmazonToClick();
	//shots();
	  Thread.sleep(6000);
	  
	  
	  
  }
@Test(groups = {"Adhoc","smoke"})
public void f6() {
	System.out.println("this is group test 6");
}
@Test(groups = {"Adhoc","smoke","Regression"})
public void f66() {
	System.out.println("this is group test 66");
}*/
@Test//(groups= {"function"})
public void f666() throws IOException {
	Properties pro=new Properties();
	FileInputStream is=new FileInputStream("C:\\Users\\user\\AutomationWinterCoding\\AutomationFrameworkStructure\\src\\main\\Function.properties");
	pro.load(is);
	System.out.println(pro.getProperty("name"));
	System.out.println( pro.getProperty("Education"));
	System.out.println(pro.getProperty("Address"));
	String name=pro.getProperty("name");
	
	
}

  @DataProvider
  public Object[][] dtap() {
    return new Object[][] {
      new Object[] { "John@gmail.com", "Johnoftest" },
      new Object[] { "testing@hotmail.com", "testing" },
      
    };
  }
  

}
	


