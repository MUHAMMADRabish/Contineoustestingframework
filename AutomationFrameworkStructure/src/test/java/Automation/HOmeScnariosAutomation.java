package Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Comons.Utilbase;
import Pages.Create;
import Pages.Home;
import Pages.Sign;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class HOmeScnariosAutomation extends Utilbase{
	
  @Test(priority = 1)  //Method
  public void f() {
	  Home ob=new Home(driver);
	  ob.GiftCardsClick();
	  ob.FindAGiftClick();
	  
	 
  }
  @Test(priority = 2)
  public void CreateTheAccount() throws InterruptedException {
	  Home home=new Home(driver);
	  Sign login=new Sign(driver);
	  Create create=new Create(driver);
	  Actions actions=new Actions(driver);
	  SoftAssert ob=new SoftAssert();
	  WebElement SignInClick= home.Sigininbuttonclick();
	 WebElement SignInPage=home.SignInlink();
	  actions.moveToElement(SignInClick).build().perform();
	  actions.moveToElement(SignInPage).click().build().perform();
	  login.CreateYourAccountClick();
	  create.FirstUserNameEnter();
	  create.UserIdEmailEnter();
	  create.PsswdOfAccount();
	  	  create.ReenterOfPsswd();
	  Thread.sleep(6000);
	  create.CreateOfAccountSubmit();
	  WebElement PsswdOfText=create.PsswordToVerify();
	  boolean rsults=PsswdOfText.isDisplayed();
	  System.out.println("This is the rsult for displayed ="+rsults);
	 String tx= PsswdOfText.getText();
	 System.out.println(tx);//how to verify the correct text is displaying or not
	 System.out.println("this is before assertion");
	 ob.assertEquals(tx, "Passwords must be at least 6 characters. 666666666");
	 System.out.println("This is after assertion");
	 ob.assertAll();
	 
	 
	 
	  
  }
 

}
