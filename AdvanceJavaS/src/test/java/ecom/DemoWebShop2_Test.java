package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop2_Test {
	
	
	@Test
	
	public void Login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("poojadhamale85@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pooja@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.quit();
	}

}
