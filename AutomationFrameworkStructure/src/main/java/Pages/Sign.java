package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public WebDriver driver;
	@FindBy(linkText = "Create your Amazon account")
	WebElement CreateYourAccount;
	@FindBy(name = "email")
	WebElement Username;
	@FindBy(id = "continue")
	WebElement Continue;
	@FindBy(name="password")
	WebElement Psswd;
	@FindBy(id="signInSubmit")
	WebElement Sign;
	public Sign(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void CreateYourAccountClick() {
		CreateYourAccount.click();
	}
	public void UserNameFields(String Users) {
		Username.sendKeys(Users);
	}
	public void Continuebuttonids() {
		Continue.click();
	}
	public void PsswdFieldChar(String psswd) {
		Psswd.sendKeys(psswd);
	}
public void SignToClick() {
	Sign.click();
}
}
