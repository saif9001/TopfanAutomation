package com.TestNGTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LoginRgistrationPageTestCase.RegistrationPage;

import Base.TestBase;

public class ValidateRegisterPageTest extends TestBase {
	
	public ValidateRegisterPageTest() throws IOException {
		super();
		
		
		// TODO Auto-generated constructor stub
	}

RegistrationPage obj;
	
	
	@BeforeMethod
	
	public void setup() throws IOException{
		
		initialization();
		
	 obj=new RegistrationPage();
	 
	 driver.get("https://topfan-web-production.herokuapp.com");
}
	
	
	
  @Test(enabled=true)
  public void validateregistrationofuser() throws InterruptedException, IOException {
	  
	  
	  
	  
	
	  
	  
	  obj.validateresgistrationpage(prop.getProperty("usernametestapp"),prop.getProperty("userpasswordtestapp"),prop.getProperty("useremail"),prop.getProperty("userlocation"),prop.getProperty("userdob"),prop.getProperty("userdoboptional"));
	  }
  
 @Test(enabled=false)
  
  public void validateloweragealert() throws InterruptedException, IOException{
	
	  obj.validateloweragealert(prop.getProperty("usernameforlowerage"),prop.getProperty("userpassword"),prop.getProperty("userloweragemail"),prop.getProperty("userlocation"),prop.getProperty("userloweragedob"),prop.getProperty("userdoboptional"));
	 }

 @Test(enabled=false)
 
 public void validatemandatoryfieldmissingalert() throws InterruptedException{
	 
	 obj.verifymandotryfieldmissingalert(prop.getProperty("userpassword"),prop.getProperty("useremail"),prop.getProperty("userlocation"),prop.getProperty("userdob"),prop.getProperty("userdoboptional"));
	 
	 
 }
  
  @AfterMethod
  public void clean(){
	  driver.close();
	  
	  
  }
 
  
  
  
  
  
  
}
