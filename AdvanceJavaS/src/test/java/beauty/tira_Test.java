package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tira_Test {
	
	@Test
	
	public void tira()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tirabeauty.com/");
		Reporter.log("tirabeauty website is getting a launch",true);
		driver.manage().window().maximize();
		driver.quit();
	}

}
