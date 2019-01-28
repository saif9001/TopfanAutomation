package com.TestNGTestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LoginRgistrationPageTestCase.Registrationwithfacebook;

import Base.TestBase;

public class ValidatefacebookregistrationTest extends TestBase{
	
	Registrationwithfacebook obj;
	
	
	public ValidatefacebookregistrationTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void before() throws IOException{
		
		 initialization();
		
	      obj=new Registrationwithfacebook();
		}
  @Test(priority=0)
  public void f() throws InterruptedException {
	  
	 String facebook= prop.getProperty("facebookurl");
	 
	 driver.get("https://www.orangeherd.com/");
	  
	  obj.validateregistrationwithfacebook(prop.getProperty("userfacebookid"),prop.getProperty("userfacebookpassword"),prop.getProperty("username"),prop.getProperty("userpassword"),prop.getProperty("useremail"),prop.getProperty("userlocation"),prop.getProperty("userabout"));
	  
}
  @Test(priority=1)
  

  
  public void facebookvalidate() throws InterruptedException{
	  
	  driver.get("https://www.orangeherd.com/");
	  obj.validateloginwithfaceboook(prop.getProperty("userfacebookid"),prop.getProperty("userfacebookpassword"));
  }
  
  @AfterMethod
  public void clean(){
	  driver.close();
	  

  }
  }

 

  

