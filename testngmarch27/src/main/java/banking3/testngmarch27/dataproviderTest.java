package banking3.testngmarch27;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataproviderTest {
	
	public static WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String catchemail, String catpass) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\google\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();  // Opening chrome browser
		
		driver.get("https://www.facebook.com");
	  
WebElement emailfield=	 driver.findElement(By.id("email"));
emailfield.sendKeys(catchemail);

WebElement passfield=	 driver.findElement(By.id("pass"));
passfield.sendKeys(catpass);

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaaaaaaaa" },
      new Object[] { "def@yahoo.com", "bbbbbbbbbb" },
      new Object[] { "ghi@yahoo.com", "aaaaaaaaaa" },
      new Object[] { "jkl@yahoo.com", "bbbbbbbbbb" },
    };
  }
}
