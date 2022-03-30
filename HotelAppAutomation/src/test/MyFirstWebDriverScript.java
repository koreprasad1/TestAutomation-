package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Prasad\\Capita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname= driver.findElement(By.id("username"));
		uname.sendKeys("koreprasad1");
		driver.findElement(By.id("password")).sendKeys("Prako@123");
		driver.findElement(By.id("login")).click();
		driver.quit();
	}

}
