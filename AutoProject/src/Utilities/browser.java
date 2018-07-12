package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browser 
{
	public WebDriver launchBrowser(String browserName, String URL)
	{
		try
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Test\\Automation Test\\Projects\\AutoProject\\libs\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(URL);
				return driver;
			}
			
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Test\\Automation Test\\Projects\\AutoProject\\libs\\Drivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				System.out.println("Browser Launched");
				driver.get(URL);
				return driver;
			}
			else
			{
				System.setProperty("webdriver.ie.driver", "D:\\Test\\Automation Test\\Projects\\AutoProject\\libs\\Drivers\\IEDriverServer.exe");
				WebDriver driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.get(URL);
				return driver;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Browser Not Launched");
			throw ex;
		}
		
		
	}

}
