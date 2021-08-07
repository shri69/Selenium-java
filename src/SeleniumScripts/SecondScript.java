package SeleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\OneDrive\\Desktop\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		
		
		
		
		
		String title1= driver.getTitle();
		  
		  // PageLoadTimeout: Selenium will wait for 2 sec as the page loads
		  
		  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		  
		  // Navigate to another Page on the same window
		  
		  driver.navigate().to("https://www.selenium.dev/downloads/");
		  
		  String title= driver.getTitle();
		  System.out.println(" title of new page is:"+ title);
		  
		  String url= driver.getCurrentUrl();
		  System.out.println(" URL of new page is:"+ url);
		  
		  if(url.contains("selenium.dev"))
		  {
		   System.out.println("url of the Page is Correct");
		  }
		  
		  else {
		   System.out.println("url of the Page is not Correct");
		  }
		  
		  
		  Thread.sleep(2000);
		  
		  driver.navigate().back();
		  
		  Thread.sleep(3000);
		  
		  if(title1.contains("Wikipedia"))
		  {
		   System.out.println("you are on the Wiki Page");
		  }
		  
		  driver.navigate().forward();
		  
		  if(title.contains("Downloads"))
		  {
		   System.out.println("you are on the selenium Page");
		  }
		  
		  Thread.sleep(3000);
		  
		  driver.close();
		  

	}

}
