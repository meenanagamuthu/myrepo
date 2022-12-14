package Fileutilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public WebDriver driver;
	
	@BeforeSuite
	public void dbconfig()
	{
		System.out.println("connect to DB");
	}
	@BeforeClass
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("browser launched");

	}
    @BeforeMethod
    public void LoginToApp()
    {
    	driver.get("https://www.facebook.com");
    	System.out.println("successfully logged in");
    
    }
    @AfterMethod
    public void logoutFromApp()
    {
    	System.out.println("logout From App");
    	
    	
    }
    @AfterClass
    public void closebrowser()
    {
    	driver.quit();
    	System.out.println("browser closed");
    	
    }
    @AfterSuite
    public void dbclose()
    {
    	System.out.println("close Db connection");
    }
    
}
