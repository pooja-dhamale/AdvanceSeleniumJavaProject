package Reports;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReport {
	
	@Test
	
	public void Script()
	{
		 WebDriver driver;
		 LocalDateTime dateTime=LocalDateTime.now();
		 String date=dateTime.toString().replace(":","-");
		 ScreenShotMethod ss=new ScreenShotMethod();
		 ExtentReports reports = new ExtentReports();
		 ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./reportFile/\"+date+\".htmll");
		 reports.attachReporter(extentSparkReporter);
		 ExtentTest test=reports.createTest("Login");
		 driver=new ChromeDriver();
		 test.log(Status.INFO, "driver is getting a launched");
		 driver.manage().window().maximize();
		 test.log(Status.INFO, "browser is maximized");
		 driver.get("https://demowebshop.tricentis.com/");
		 test.log(Status.INFO, "Demo webshop web site is launched");
		 driver.findElement(By.linkText("Log in")).click();
		 test.log(Status.INFO, "user is able to click on login text");
		 driver.findElement(By.id("Email")).sendKeys("poojadhamale85@gmail.com");
		 test.log(Status.INFO, "user is able to add the email address");
		 driver.findElement(By.id("Password")).sendKeys("Pooja@123");
		 test.log(Status.INFO, "user is able to add the password in password field");
		 driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		 test.log(Status.INFO, "user is able to  login successfully");
		 
		 try {
				if(driver.findElement(By.linkText("Log out")).isDisplayed()) {
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ss.takesScreenShot(driver)).build());
				}
			}catch(Exception e) {
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ss.takesScreenShot(driver)).build());
				}
		 reports.flush();
		
		 
	}

}
