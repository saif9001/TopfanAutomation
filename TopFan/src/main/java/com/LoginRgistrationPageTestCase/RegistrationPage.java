package com.LoginRgistrationPageTestCase;

import org.testng.AssertJUnit;

import Base.TestBase;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.NamingException;
import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends TestBase {
	
	String foundelement="";
	
	String mandatoryfieldmissingalert="Username can only contain letters, numbers, an underscore, ampersand, or hyphen.";
	
	String loweragealert="You must be 16 years or older to sign up";
	
	public RegistrationPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	//WebElement of login page
    @FindBy(className="register-btn")
	
	WebElement register;
	
	
	//WebEelents of registration page
    @FindBy(xpath="//a[@class='btn theme-btn custom-btn']")
	
	WebElement cookialert;
	

	@FindBy(xpath="//input[@id='user_user_name']")
	
	WebElement username;
	
	@FindBy(xpath="//input[@id='user_password']")
	
	WebElement userpassword;
	
	@FindBy(xpath="//input[@id='user_email']")
	
	 WebElement useremail;
	
	@FindBy(xpath="//input[@id='user_location']")
	
	 WebElement userlocation;
	
	//@FindBy(xpath="//a[contains(text(),'noida']")
	
	//WebElement userlocationclick;
	
	@FindBy(xpath="//input[@id='user_date_of_birth']")
			
	WebElement userdob;		

	@FindBy(xpath="//p[@class='CaptionCont SelectBox']")
			
	WebElement usergender;	
	
	@FindBy(xpath="//li[@class='opt']//label[text()='Male']")
	
	WebElement usergendermale;	
			
			
	
	//@FindBy(xpath="//p[@class='CaptionCont SelectBox']")
	
	// WebElement dropdown1;
//	Select dropdown= new Select(dropdown1);
	
	@FindBy(linkText="Male")
	
	 WebElement malegender  ;
	
	@FindBy(xpath="//input[@id='user_additional_details_label2forothersonly']")
	
	 WebElement extralabel;
	
	@FindBy(xpath="//div[@class='signup-link']//label[@class='checkbox' and @for='user_email_opt']")
	
	 WebElement checkbox1;
	
	@FindBy(xpath="//div[@class='signup-link']//label[@class='checkbox' and @for='user_additional_policy']")
	
	 WebElement checkbox2;

	
	@FindBy(xpath="//button[@id='register_btn']")
	
	WebElement getstarted;
	
	@FindBy(xpath=".//*[@class='pac-item']")
	
	List<WebElement> locationoptions;
	
	
	 
	
	
	
	

public  void validateresgistrationpage(String name,String password,String email,String location,String birthdate,String optionaldob) throws InterruptedException  {

	register.click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//method to scroll downpage
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,200)", "");
	
	cookialert.click();
	
	username.sendKeys(name);
	
	userpassword.sendKeys(password);

	useremail.sendKeys(email);
	
	userlocation.sendKeys(location);
	
	
	
	  // List<WebElement> optionsToSelect = driver.findElements(By.xpath(".//*[@class='pac-item']"));
	   
	   for(WebElement option : locationoptions){
		   
		    if(option.getText().equals("NoidaUttar Pradesh, India")) {
		    	
		    	option.click();
		    	break;
		    }
		   
	   }
	   
	   

	
	
    userdob.sendKeys(birthdate);
         
    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
         
    usergender.click();
    
    usergendermale.click();
    
   /// extralabel.sendKeys(optionaldob);
 
   //checkbox1.click();
   
  // checkbox2.click();
   
     getstarted.click();
     
     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
     
     if(driver.findElements(By.id("referred_user")).size() != 0){
    	 foundelement="True";
    	 }else{
    		 foundelement="False";
    	 
    	 }
     
     AssertJUnit.assertEquals(foundelement,"True");
     
     //driver.getPageSource().contains("You must be 16 years or older to sign up");
     
     
     //method to verify elemnt on page
     
      /*if(driver.findElements(By.xpath("//input[@id='referred_user' and @class='form-control']")).size()> 0){
		  String actual="found";
		  System.out.println("BLOCK");
		  AssertJUnit.assertEquals("found",actual);
		   }*/
     
    // driver.findElement(By.xpath("//input[@id='referred_user' and @class='form-control']")).sendKeys("heloo");
     
   
   //String actualurl= driver.getCurrentUrl();
   //String expectedurl="https://topfan-web-production.herokuapp.com/home?k=8e066aff";
   
  // AssertJUnit.assertEquals(actualurl,expectedurl);
   
   

   
   
   
}

public void validateloweragealert(String name,String password,String email,String location,String birthdate,String optionaldob) throws InterruptedException{

	register.click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//method to scroll downpage
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,200)", "");
	
	cookialert.click();
	
	username.sendKeys(name);
	
	userpassword.sendKeys(password);

	useremail.sendKeys(email);
	
	userlocation.sendKeys(location);
	
	   List<WebElement> optionsToSelect = driver.findElements(By.xpath(".//*[@class='pac-item']"));
	   
	   for(WebElement option : optionsToSelect){
		   
		    if(option.getText().equals("NoidaUttar Pradesh, India")) {
		    	
		    	option.click();
		    	break;
		    }
		   
	   }
	   
	   

	
	
    userdob.sendKeys(birthdate);
         
    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
         
    usergender.click();
    
    usergendermale.click();
    
    //extralabel.sendKeys(optionaldob);
 
   //checkbox1.click();
   
  // checkbox2.click();
   
     getstarted.click();
     
     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
     
     /*if(driver.findElements(By.id("referred_user")).size() != 0){
    	 foundelement="True";
    	 }else{
    		 foundelement="False";
    	 
    	 }
     
     AssertJUnit.assertEquals(foundelement,"True");*/
     
   String lowerage=driver.findElement(By.xpath("//p[text()='You must be 16 years or older to sign up']")).getText();
   AssertJUnit.assertEquals(lowerage, loweragealert);
     
     //method to verify elemnt on page
     
      /*if(driver.findElements(By.xpath("//input[@id='referred_user' and @class='form-control']")).size()> 0){
		  String actual="found";
		  System.out.println("BLOCK");
		  AssertJUnit.assertEquals("found",actual);
		   }*/
     
    // driver.findElement(By.xpath("//input[@id='referred_user' and @class='form-control']")).sendKeys("heloo");
     
   
   //String actualurl= driver.getCurrentUrl();
   //String expectedurl="https://topfan-web-production.herokuapp.com/home?k=8e066aff";
   
  // AssertJUnit.assertEquals(actualurl,expectedurl);
   
}

public void verifymandotryfieldmissingalert(String password,String email,String location,String birthdate, String optionaldob) throws InterruptedException{
	
     register.click();
     
     JavascriptExecutor jse = (JavascriptExecutor)driver;
 	jse.executeScript("window.scrollBy(0,200)", "");
     
     cookialert.click();
     
	userpassword.sendKeys(password);
	
	useremail.sendKeys("saif.sultan@kiwitech.com");
	
	userlocation.sendKeys("Noida");
	
	  List<WebElement> optionsToSelect = driver.findElements(By.xpath(".//*[@class='pac-item']"));
	   
	   for(WebElement option : optionsToSelect){
		   
		    if(option.getText().equals("NoidaUttar Pradesh, India")) {
		    	
		    	option.click();
		    	break;
		    }
		   
	   }
	   
	   userdob.sendKeys(birthdate);
	   
	   driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	   
	   
	   Actions action=new Actions(driver);
	   
	   action.moveToElement(usergender).click();
	   
       
	    //usergender.click();
	   
	   action.moveToElement(usergendermale).click();
	    
	    //usergendermale.click();
	    
	    
	    
	  //  extralabel.sendKeys( optionaldob);
	 
	   //checkbox1.click();
	   
	  // checkbox2.click();
	   
	   //  getstarted.click();
	    
	   getstarted.click();
	   
	   WebElement text=driver.findElement(By.id("user_user_name-error"));
	   String missingfield=text.getText();
	  // System.out.println(text1);
	   
	   AssertJUnit.assertEquals(missingfield,mandatoryfieldmissingalert);
	     
	   
	   //driver.getPageSource().contains("Username cuytjuyjujan only contain letters, numbers, an underscore, ampersand, or hyphen.");
	 
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	

	
	
	
	
	
	
	
	
	


