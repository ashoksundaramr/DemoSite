package bankTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyLoginTest {

	static WebDriver driver;
	
	  @Test
	  public void f() {
		  driver.findElement(By.id("email")).sendKeys("ashoksundaramr@gmail.com");
		  driver.findElement(By.id("passwd")).sendKeys("swift123");
		  driver.findElement(By.id("SubmitLogin")).click();
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashokkumar\\Downloads\\Selenium\\chromedriver_win32_Version 87\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	  }
	  @AfterClass
	  public void afterClass() {
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getTitle());
		  driver.quit();
	  }
}
