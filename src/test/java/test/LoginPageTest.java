package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPageObj; 
	 @BeforeMethod
	 public void setUp() {
	  initDriver();
	  loginPageObj= PageFactory.initElements(driver, LoginPage.class);
	 } 
	 @Test
	 public void loginTest() throws Throwable {
	  loginPageObj.enterUserName("demo@techfios.com");
	  loginPageObj.enterPassword("abc123");
	  loginPageObj.clickSignInButton();
	  Thread.sleep(3000);
	  takesScreeenShotAtEndOfTest(driver);
	 } 
	 @Test
	 public void pageTitleTest() throws Throwable {
	  loginPageObj.enterUserName("demo@techfios.com");
	  loginPageObj.enterPassword("abc123");
	  loginPageObj.clickSignInButton();
	  String expectedTitle = "Dashboard- iBilling";
	  String actualTitle = loginPageObj.getPageTitle();
	  System.out.println(actualTitle);
	//  Assert.assertEquals(actualTitle, expectedTitle);
	   
	 } 
	 @AfterMethod
	 public void tearDown() {
	  driver.close();
	  driver.quit();
	 }
}
