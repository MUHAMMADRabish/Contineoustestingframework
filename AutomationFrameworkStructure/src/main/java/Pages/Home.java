package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
@FindBy(linkText = "Find a Gift")
WebElement FindAGift;
@FindBy(linkText = "Gift Cards")
WebElement GiftCardsAmazon;
@FindBy(linkText = "Computers")
WebElement Computer;
@FindBy(xpath = "//*[text()='Hello, Sign in']")
WebElement Siginbutton;
@FindBy(xpath = "(//*[text()='Sign in'])[1]")
WebElement Siginlink;
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void FindAGiftClick() {
	FindAGift.click();
}
public void GiftCardsClick()
{
	GiftCardsAmazon.click();
}
public void ComputerOfClick() {
	Computer.click();
}
public WebElement Sigininbuttonclick() {
	
	return Siginbutton;
}
public WebElement SignInlink() {
	return Siginlink;
}
}
