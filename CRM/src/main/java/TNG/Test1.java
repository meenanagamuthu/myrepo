package TNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1
{
   @Test
   
   public void amazonlogin()
   {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in");
	   Reporter.log("amazon",true);
   }
   @Test
   public void faceebooklogin()
   {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   Reporter.log("facebook",true);
   }
}
