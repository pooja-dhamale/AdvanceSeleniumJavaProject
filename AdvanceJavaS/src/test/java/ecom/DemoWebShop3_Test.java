package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop3_Test {

	
	@Test
	
	public void Register()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Arjavi");
		driver.findElement(By.id("LastName")).sendKeys("Dhamale");
		driver.findElement(By.id("Email")).sendKeys("Arjavi123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Arjavi@1235");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Arjavi@123");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
		
		
	}
}
