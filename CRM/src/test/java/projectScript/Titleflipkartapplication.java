package projectScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Titleflipkartapplication {


	private static char[] title;

	public static void main(String[] args)
	{
	    //welcome to facebook	
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com");
	    String url = driver.getTitle();
	    System.out.println(title);
	    //completion of test

	}

}
