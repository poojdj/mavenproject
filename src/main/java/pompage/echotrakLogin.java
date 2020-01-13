package pompage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class echotrakLogin {
	WebDriver driver;
	Alert alt;
	String exp="Invalid Username/Password",act;
	@FindBy(id="txtCustomerID")
	WebElement uname;
	@FindBy(id="txtPassword")
	WebElement pawd;
	@FindBy(id="Butsub")
	WebElement login;
	@FindBy(id="lblMsg")
	WebElement err;
	
	//Constructor
			public echotrakLogin(WebDriver driver){
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
			public void setUname(String un){
				uname.sendKeys(un);
			}
			public void setPassword(String pwd){
				pawd.sendKeys(pwd);
			}
			public void clicklogin(){
				login.click();
			}
			public void checkerror() {
	
	System.out.println(err.getText());
			}
			public void testMsg(String un){
				this.setUname(un);
				this.clicklogin();
				//this.validateAlert();
			}
			
		



		
		
		
		

		}






