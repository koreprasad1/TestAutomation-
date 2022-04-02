package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
  @Test
  public void test1() {
	  driver.manage().window().maximize();
	  WebElement uname = driver.findElement(By.id ("username"));
	  uname.sendKeys("koreprasad1"); 
	  driver.findElement(By.id("password")).sendKeys("Prako@123");
	  driver.findElement(By.id("login")).click();

	  new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
	  new Select(driver.findElement(By.id("hotels"))).selectByIndex(3); // xpath //select[@id='hotels']
	  new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);// room_type
	  new Select(driver.findElement(By.id("room_nos"))).selectByIndex(2);// //select[@id='room_nos']

	  WebElement date = driver.findElement(By.id ("datepick_in"));// datepick_in
	  date.click();
	  date.clear();
	  date.sendKeys("1/04/2022");
	  WebElement dat = driver.findElement(By.id ("datepick_out"));
	  dat.click();
	  dat.clear();
	  dat.sendKeys("6/04/2022");

	  new Select(driver.findElement(By.id("adult_room"))).selectByIndex(3);
	  new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);

	  driver.findElement(By.cssSelector("#Submit")).click();
	  driver.findElement(By.id("radiobutton_0")).click();
	  driver.findElement(By.cssSelector("#continue")).click(); 
	  driver.findElement(By.name("first_name")).sendKeys("Prasad");
	  driver.findElement(By.name("last_name")).sendKeys("Kore");
	  driver.findElement(By.name("address")).sendKeys("Pune");
	  driver.findElement(By.id ("cc_num")).sendKeys("1234567894561455");

	  new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2); 
	  new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(4);
	  new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(10);
	  driver.findElement(By.id ("cc_cvv")).sendKeys("562");
	  driver.findElement(By.cssSelector("#book_now")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Prasad\\Capita\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://adactinhotelapp.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
