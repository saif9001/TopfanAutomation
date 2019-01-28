package com.LoginRgistrationPageTestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import Base.TestBase;

public class LoginPagee extends TestBase{
	
	String foundelement;
	
public LoginPagee() throws IOException  {
		super();
		PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		
		// TODO Auto-generated constructor stub
	}
//WebElement of login and registration page

 @FindBy(xpath="//a[@class='login-btn']")
public
 WebElement login1;

  @FindBy(id="user_name")
public
  WebElement username;

   @FindBy(id="password")
public
   WebElement password;

   @FindBy(id="login_btn")
public
   WebElement login;
  
   @FindBy(linkText="Register")
   WebElement register;
  
   @FindBy(linkText="Forgot Password?")
   WebElement forgotpassword;
   
   
   public void userlogin(String username1,String userpassword1) throws InterruptedException{
	   
	   login1.click();
	   
	   username.sendKeys(username1);
	   
	   password.sendKeys(userpassword1);
	   
	   Thread.sleep(5000);
	  
		  
		   
	   
	      
	   
	   login.click();
		   
			  
	   
   }
  
  public  void verifyforgotpasswordlink() throws InterruptedException  {
	  
	  login1.click();
	 //driver.findElement(By.linkText("Forgot Password?")).click();
	 forgotpassword.click();
	  //login.click();
	  
	     if(driver.findElements(By.id("email")).size() != 0){
	    	 foundelement="True";
	    	 }else{
	    		 foundelement="False";
	    	 
	    	 }
	     
	     AssertJUnit.assertEquals(foundelement,"True");
	     }
  
  public void login(String username,String password){
	  
	  
	  
	  
  }
  
  @SuppressWarnings("unused")
public void verifyforgotpasswordfunctionality() throws InterruptedException{
	  
	  login1.click();
	  forgotpassword.click();
	  
	  driver.findElement(By.id("email")).sendKeys("saif.sultan@kiwitech.com");
	  driver.findElement(By.id("forgot_password_submit")).click();
	  
	  driver.get("https://www.google.com/gmail/about/");
	  driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	  
	  //driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	  
	    Thread.sleep(30000);
	  
	//  Thread.sleep(30000);
	/*  boolean s1 = false;
	  
	  while(s1 == false){
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	   s1 = ((String) js.executeScript("return document.readyState")).equals("complete");
	   System.out.println("NOT NOT NOT NOT");
	  }*/
	  
	//  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	//  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	  
	  
	  
	  WebElement user=driver.findElement(By.xpath("//input[@type='email']"));
	  user.click();
	  user.sendKeys("saif.sultan@kiwitech.com");
	  
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  
	 // Thread.sleep(10000);
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);

	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']"))); 
	  
	  

	  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("sheezan100");
	  
      wait = new WebDriverWait(driver, 10);

	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']"))); 
	  
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("Test App Password Reset Instructions");
	
	driver.findElement(By.xpath("//button[@class='gbqfb']")).click();
	
	driver.findElement(By.xpath("//a[text()='Reset Password']")).click();
	
	//Apply window switch logic.
	
	driver.findElement(By.xpath("//input[@id='user_reset_password_token']")).sendKeys("Samm@123456789");
	
	driver.findElement(By.xpath("//input[@id='user_reset_password_token']")).sendKeys("Samm@123456789");
	
	driver.findElement(By.xpath("//input[@name='commit']")).click();
	

	  
  }
  
}
