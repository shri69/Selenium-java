package SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\OneDrive\\Desktop\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Wikipedia, the free encyclopedia"))
		{
			System.out.print("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
