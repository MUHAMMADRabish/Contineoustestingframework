package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create {
public WebDriver driver;
@FindBy (name = "customerName")
WebElement FirstUserName;
@FindBy(name = "email")
WebElement UserIdEmail;
@FindBy(name = "password")
WebElement Psswd;
@FindBy(name = "passwordCheck")
WebElement PswwdIdCheck;
@FindBy(id = "continue")
		//xpath = "//*[contains(text(),'Create your Amazon account')]")
WebElement CreateOfAccount;
@FindBy(xpath = "(//div[contains(text(),'Passwords must be at least')])[2]")
WebElement PsswordsToDisplay;
@FindBy(xpath ="//i[@aria-label='Amazon']")
WebElement Amazon;

public Create(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void FirstUserNameEnter() {
	FirstUserName.sendKeys("JOhn");
}
public void UserIdEmailEnter() {
	UserIdEmail.sendKeys("6@gmail.com");
}
public void PsswdOfAccount() {
	Psswd.sendKeys("John");
}
public void ReenterOfPsswd() {
	PswwdIdCheck.sendKeys("John");
}
public void CreateOfAccountSubmit() {
	CreateOfAccount.click();
}
public WebElement PsswordToVerify() {
	return PsswordsToDisplay;
}
public void AmazonToClick() {
	Amazon.click();
}
}
