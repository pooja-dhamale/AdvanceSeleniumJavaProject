package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script01_Test {
	
	@Test
	public void nyka()
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.nykaa.com/");
		String url = System.getProperty("url");
		driver.get(url);
		Reporter.log("nyka website is getting a launch",true);
		driver.manage().window().maximize();
		driver.quit();
	}

}
