package pomtest;

import org.testng.annotations.Test;


import pompage.echotrakLogin;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class echotrakloginpagetest {
	private WebDriver driver;
	private echotrakLogin ech;
  @Test
  public void checkerror() {
	  ech.setUname("pooja");
	  ech.setPassword("poo");
	  ech.clicklogin();
	  ech.checkerror();
  }
 
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
      driver = new ChromeDriver();
	 // System.setProperty("webdriver.chrome.driver", "G:\\New folder\\chromedriver.exe");
	  //driver.manage().window().maximize();
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	  ech = new echotrakLogin(driver);
  }

 

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
