package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Prasad\\Capita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/alerts");
		//driver.findElement(By.id("alertButton")).click();
		//driver.switchTo().alert().accept();
		/*
		 * try { driver.findElement(By.id("timerAlertButton")).click(); //Alert alert =
		 * new WebDriverWait(driver, 5).until(ExpectedConditions.alertIsPresent());
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) .pollingEvery(Duration.ofSeconds(5))
		 * .ignoring(NoAlertPresentException.class);
		 * 
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * driver.switchTo().alert().accept(); System.out.println("Alert Accepted");
		 * }catch(Exception e) { System.out.println("Alert did not occur"); }
		 */
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		
			driver.quit();	
	}

}
