package listners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Comons.Utilbase;

public class listner extends Utilbase implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is started ");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is passed");
		this.driver = ((Utilbase)result.getInstance()).driver;
		/*Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		
		File dti=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(dti, new File("C:\\Users\\user\\AutomationWinterCoding\\AutomationFrameworkStructure\\src\\test\\Passed\\"+si+"Picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			shots("Passed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is failed");
		this.driver = ((Utilbase)result.getInstance()).driver;
		/*Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		
		File dti=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(dti, new File("C:\\Users\\user\\AutomationWinterCoding\\AutomationFrameworkStructure\\src\\test\\Failed\\"+si+"Picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			shots("Failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	/*i)Create new package
	 * ii)Crete the java class and name as listner
	 * iii)Implement Itestlistner interface
	 * iv)Add unimplemented methods
	 * v)Add listners into xml file
	 */
}
