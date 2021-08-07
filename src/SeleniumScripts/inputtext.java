package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\OneDrive\\Desktop\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page&campaign=loginCTA");
		driver.manage().window().maximize();
		driver.findElement(By.id("wpName2")).sendKeys("shrikumar");

	}

}
