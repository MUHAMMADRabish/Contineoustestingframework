package Comons;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Utilbase {
	public WebDriver driver;
	String tu=System.getProperty("user.dir");
	@BeforeClass
	@Parameters("browser")
	public void browsers(String browser) throws IOException {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", tu+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.com");//how to open the URL in the browsers
			driver.manage().window().maximize();
			shots("");
		}else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", tu+"\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
		}else {
			System.out.println("Correct browser name");
		}
	}
	
	public void shots(String Compsite) throws IOException {
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		
		File dti=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(dti, new File(tu+"\\src\\test\\"+Compsite+"\\"+si+"Picture.png"));
		
	}
	@AfterClass
	public void Afterclass() throws IOException {
		shots("");
	}
}
