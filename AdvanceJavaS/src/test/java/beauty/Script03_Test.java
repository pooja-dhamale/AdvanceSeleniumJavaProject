package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script03_Test {
	
	
	@Test
	public void lakeme()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lakmeindia.com/");
		Reporter.log("lakeme website is getting a launch",true);
		driver.manage().window().maximize();
		driver.quit();
	}

}
