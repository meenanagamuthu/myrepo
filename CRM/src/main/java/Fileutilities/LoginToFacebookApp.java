package Fileutilities;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToFacebookApp extends BaseClass{
	
	@Test
	public void loginToFacebookApp()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nhgcghcgjbjh");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("276656775");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	

}
