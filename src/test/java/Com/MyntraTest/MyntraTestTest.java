package Com.MyntraTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Myntra.MyntraClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyntraTestTest {
	WebDriver driver;

  @BeforeTest
  public void beforeMethodTest() {
    System.setProperty("Webdriver-http-factory","jdk-http-client");
    driver =new ChromeDriver();
    driver.get("https://www.myntra.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.manage().window().maximize();
    }
  @Test
  public void testmethod() throws InterruptedException {
	  MyntraClass myntraobject=new  MyntraClass(driver);
	  Thread.sleep(3000);
	  myntraobject.MouseHover();
	  Thread.sleep(3000);
	  myntraobject.JacketClickButton();
	  myntraobject.CheckBoxClickButton();
	  myntraobject.TitleCount();
	  myntraobject.addmore();
	  myntraobject.SendDuke("Duke");
	 // driver.switchTo().alert().getText();
	  //driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	 // 
	  //driver.switchTo().alert().getText();
//	  myntraobject.DukeCheckBox1();
//	  myntraobject.DukeCheckBox2();
	  
	  myntraobject.CloseFilter();
  }
}
