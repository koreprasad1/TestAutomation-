package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Prasad\\Capita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(mainWindowHandle);
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> itr = allWindowHandles.iterator();
		
		while(itr.hasNext()) {
			String childWindowHandle=itr.next();
			if(!mainWindowHandle.equalsIgnoreCase(childWindowHandle))
			{
				driver.switchTo().window(childWindowHandle);
				WebElement head = driver.findElement(By.id("sampleHeading"));
				System.out.println("The Heading of the window is "+head.getText());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindowHandle);
		driver.quit();
	}

}
