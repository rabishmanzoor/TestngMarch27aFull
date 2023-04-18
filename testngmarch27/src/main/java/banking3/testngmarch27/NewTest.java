package banking3.testngmarch27;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class NewTest extends baseclass {
	
  
  @Test (groups = {"regression"})
  public void signin_facebbok() throws InterruptedException, IOException {
	  
	 
	  System.out.println("This is test1");
	  Thread.sleep(5000);
	  shotsv2("1");
	  
	  Home ob = new Home(driver);
	  ob.email_field_function("abc@yahoo.com");
	  Thread.sleep(5000);
	  ob.pass_field_function("aaaaqqqwwweee");
	  Thread.sleep(5000);
	  shotsv2("2");
  }
  
  @Test (groups = {"adhoc"})
  public void signin_facebbok2() throws InterruptedException, IOException {
	  
	 
	  System.out.println("This is test1");
	  Thread.sleep(5000);
	  shotsv2("1");
	  
	  Home ob = new Home(driver);
	  ob.email_field_function("abc@yahoo.com");
	  Thread.sleep(5000);
	  ob.pass_field_function("aaaaqqqwwweee");
	  Thread.sleep(5000);
	  shotsv2("2");
  }
  
  


  
 

  

}


