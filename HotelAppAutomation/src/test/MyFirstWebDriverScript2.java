package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Prasad\\Capita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname= driver.findElement(By.className("login_input"));
		uname.sendKeys("koreprasad1");
		driver.findElement(By.id("password")).sendKeys("Prako@123");
		driver.findElement(By.className("login_button")).click();
		driver.quit();
	}

}
