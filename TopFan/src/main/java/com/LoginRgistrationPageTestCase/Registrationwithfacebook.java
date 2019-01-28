package com.LoginRgistrationPageTestCase;

import java.awt.List;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import Base.TestBase;

public class Registrationwithfacebook extends TestBase {
	
	
	String foundelement;
	
	String parent;
	
	String userprofiletextexpected="pariss";
	
	String userprofiletextactuall;
	
	
	 
	 public Registrationwithfacebook() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[@class='hamburger is-closed']")
	 
	 WebElement hamburgericon;
	
      @FindBy(xpath="//img[@src='https://tamm-assets.top-fan.com/profilepic_1531319223_thumb.jpg']")
	 
	 WebElement userprofileicon;
	
	
	 
	 @FindBy(xpath="//a[text()='Register']")
	 
	 WebElement register;
	 
       @FindBy(xpath="//button[@id='fb-login_btn']")
	 
	 WebElement loginwithfacebook;
	 
	 
	@FindBy(xpath="//button[@id='login_btn' and @type='button']")
	 
	 WebElement registerwithfacebook;
	 
	@FindBy(xpath="//input[@id='email']")
	WebElement useremailfacebook;

	@FindBy(xpath="//input[@id='pass']")
	WebElement userpasswordfacebook;
	
	
	@FindBy(xpath="//label[@class='uiButton uiButtonConfirm uiButtonLarge']")
	WebElement facebooklogin;
	
	@FindBy(xpath="//input[@id='user_user_name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='user_password']")
	WebElement userpassword;
	
	@FindBy(xpath="//input[@id='user_email']")
	WebElement useremail;
	
	@FindBy(xpath="//input[@id='user_location']")
	WebElement userlocation;


	@FindBy(xpath=".//*[@class='pac-item']")
	
	List locationoptions;
	
    @FindBy(xpath="//textarea[@id='user_bio']")
	WebElement userbio;
	
    @FindBy(xpath="//button[@id='edit_profile_btn']")
	WebElement updateprofile;
    
    @FindBy(xpath="//img[@src='https://tamm-assets.top-fan.com/profilepic_1531730403_thumb.jpg' and @class='mCS_img_loaded']")
   	WebElement userprofileimage;
	
	
	public void validateregistrationwithfacebook(String facebookid ,String facebookpassword,String username1,String password1,String email1,String location,String aboutme) throws InterruptedException{
		
		hamburgericon.click();
		
		register.click();
		
		 parent=driver.getWindowHandle();
		
		registerwithfacebook.click();
		
		//method to switch to current window
		
		//String parent=driver.getWindowHandle();
		 Set<String> childwindow= driver.getWindowHandles();
		 
		 for(String child:childwindow){
			 
			 if(!child.equalsIgnoreCase(parent)){
				 
				 driver.switchTo().window(child);
			 }
		 }
		
		useremailfacebook.sendKeys(facebookid);
		
		userpasswordfacebook.sendKeys(facebookpassword);
		
		driver.findElement(By.xpath("//label[@class='uiButton uiButtonConfirm uiButtonLarge']")).click();
		
	    driver.switchTo().window(parent);
		
	    username.sendKeys( username1);
	
	    userpassword.sendKeys(password1);
	
        useremail.sendKeys(email1);
       
        userlocation.sendKeys(location);
	
	   for(WebElement option: driver.findElements(By.xpath(".//*[@class='pac-item']"))){
		   
		    if(option.getText().equals("NoidaUttar Pradesh, India")) {
		    	
		    	option.click();
		    	break;
		    }
		   
	   }
	   
	  
	   
	   
	   userbio.sendKeys(aboutme);
	   
	   updateprofile.click();
	   
	 WebElement referusername=  driver.findElement(By.xpath("//input[@id='referred_user']"));
	 
	 if(driver.findElements(By.xpath("//input[@id='referred_user']")).size() != 0){
    	 foundelement="True";
    	 }
	 else{
    		 foundelement="False";
    	 
    	 }
	 
	AssertJUnit.assertEquals(foundelement, "True");
		

		}
	
	
	public void validateloginwithfaceboook(String facebookid,String facebookpassword){
		
		hamburgericon.click();
		
		parent=driver.getWindowHandle();
		
		loginwithfacebook.click();
		
	   Set<String> childwindow=driver.getWindowHandles();
	
	     for(String child:childwindow){
		
		if(!child.equalsIgnoreCase(parent)){
			
			
	    driver.switchTo().window(child);
			
		}
		
	}
	
		
		
		
        useremailfacebook.sendKeys(facebookid);
		
		userpasswordfacebook.sendKeys(facebookpassword);
		
		facebooklogin.click();
		
		driver.switchTo().window(parent);
		
		hamburgericon.click();
		
		
		
     //WebElement tool=	driver.findElement(By.xpath("//img[@src='https://tamm-assets.top-fan.com/profilepic_1531730403_thumb.jpg' and @class='mCS_img_loaded']"));
    
		 userprofiletextactuall=userprofileimage.getAttribute("title");
     
     AssertJUnit.assertEquals(userprofiletextexpected,userprofiletextactuall );
    
		
		
		}
	
	
}
