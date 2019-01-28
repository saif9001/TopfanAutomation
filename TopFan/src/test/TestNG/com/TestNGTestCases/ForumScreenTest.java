package com.TestNGTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ForumScreen.ForumScreen;
import com.LoginRgistrationPageTestCase.LoginPagee;
import com.beust.jcommander.Strings;

import Base.TestBase;
import excelutils.ExcelUtil;

public class ForumScreenTest extends TestBase  {
	
	public ForumScreenTest() throws IOException {
	super();
		
		
		   
		// TODO Auto-generated constructor stub
	}
	
	
	String actualpost;
	
	
	
	String parent;
	
	Set<String> childs;
	
	String testappproductionurl;
	
	String userpost="user poast123456789";
	
	Boolean foundpost;
	
	Boolean exist=true;
	
	String actualtextpostedbyuser;
	
	String expectedtextpostedbyuser="post by user to check auto572437524";
	
	String expectedidofbudlightbrocosid="1002902";
	
	String broncoslynch2id="1004239";
	
	String budlightbroncoscheersid="1003163";
	
	boolean expected=true;
	
	boolean actual;
	
	String actualusernameonpost;
	
	String expectedusernameonpost="sam222";
	
	String actualuserstatusonpost;
	
	String expecteduserstatusonpost="Silver";
	
	String expectedforumerrormessage="Minimum 10 characters required";
	
	String expectedpostbyuserwithimage="Post to verify that image get uploaded";
	
	String actualtextonpostwithimage;
	
	String actualusernameonimage;
	
	String expectedusernameofimage="sam222";
	
	String actuallikecountafterclicking;
	
	String expecedlikecountafterclicking="1";
	
	String expectedlikecountbeforeclicking="0";
	
	String actuallikecountbeforeclicking;
	
	


	 LoginPagee loginobj;
	
	 ForumScreen forumobj;
	 ExcelUtil excel;
	 
	 @Test
	public static boolean verifypresenceofelement(WebElement element){
		 
		 boolean actual;
		  try{
			  
			  actual=element.isDisplayed();
			  
			  return actual;
		  }
		  
		  catch(Exception e){
			  
			  
			  actual=false;
			  
			  return actual;
		  }
		  
		  
  	   
  	   
  	   
     }
     
     
	
	@DataProvider(name="getdata")
	
public String [][] data() throws Exception{
		String testdatatopick="Invalid Credential";
	//In case of data provider the  2d string declared should be of same size as the number of data returned from excel  	
		String[][] userdata=new String[2][2];
		
		
		
    userdata=ExcelUtil.setExcelFile(ExcelUtil.testDataExcelPath, "sheet1",testdatatopick);
    for(int i=0;i<2;i++){
    	for(int j=0;j<2;j++){
   // userdata[i][j]="Name";
    		
    		System.out.println("Hello"+userdata[i][j]);
    	}
    }
  //  System.out.println("Hello");
    return userdata;
    
		
	
	}
	
	
	
	
	@BeforeMethod
	
	public void setup() throws Exception{
		
		initialization();
		
		loginobj=new LoginPagee();
		
		forumobj=new ForumScreen();
		excel=new ExcelUtil();
		 driver.get("https://topfan-web-production.herokuapp.com");
		//excel.setExcelFile(ExcelUtil.testDataExcelPath, "sheet1");
		
		
		}

	
	@Test(dataProvider="getdata")
	
	
	 public void userlogin(String username1,String userpassword1) throws InterruptedException{
			   
		 loginobj.login1.click();
			   
		 loginobj.username.sendKeys(username1);
			   
		 loginobj.password.sendKeys(userpassword1);
			   
			   Thread.sleep(5000);
			  
				  
				   
			   
			      
			   
			   loginobj.login.click();
				   
					  
	 }
		 
	  
   
   
   
   @Test(enabled=false)
  public void createpostvalidate() throws Exception {
	   
	   String testdatatopick="Invalid Credential";
	   
	//   ExcelUtil.setExcelFile(ExcelUtil.testDataExcelPath, "sheet1",testdatatopick); 
	   
	  
	 
	  
	  //testappproductionurl=prop.getProperty("https://topfan-web-qa.herokuapp.com/");
	  
	  
	  driver.get("https://topfan-web-production.herokuapp.com/");
	  
	  Thread.sleep(6000);
	  
	  
	 
	  loginobj.userlogin("x","y");
	  
	  Thread.sleep(70000);
	  
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 // forumobj.forum.click();
	  
	 // parent=driver.getWindowHandle();
	  
	 // forumobj.forumcreateplusicon.click();
	  
     // childs= driver.getWindowHandles();
      
  /*  for(String child:childs){
			 
			 if(!child.equalsIgnoreCase(parent)){
				 
				 System.out.println("Inside loop");
				 
				 driver.switchTo().window(child);
			 }
		 }*/
      
         // forumobj.placeholder.click();
     /* 
       String parent=driver.getWindowHandle();
      
      
      
      
      char[] seq={'a','b','c','d'};
      
     // WebElement wb = driver.findElement(By.name("phone"));
    //  JavascriptExecutor jse = (JavascriptExecutor)driver;
     // jse.executeScript("arguments[0].value='abcdefgh jkhskah dlhjosi';", forumobj.placeholder);
    //  jse.executeScript("document.getElementById('ssn').value='555-55-5555';");
      
       //forumobj.placeholder.sendKeys(s);
      Actions performAct = new Actions(driver);
      performAct.sendKeys(forumobj.placeholder, "post by user to check auto572437524").build().perform();
        
        		
          
          forumobj.MakeEmojiIcon.click();
          
          for(String child:childs){
 			 
 			 if(!child.equalsIgnoreCase(parent)){
 				 
 				 System.out.println("Inside loop");
 				 
 				 driver.switchTo().window(child);
 			 }
 		 }
       
      //  forumobj.Budlghtbrocos.click();
          
          //forumobj.BroncosLYnch2.click();
          
         // forumobj.BudLightBroncosCheers.click();
          
       //   driver.switchTo().window(parent);
          
         
        //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
                          
        //  forumobj.postlink.click();
          
       /*   if(driver.findElements(By.xpath("//div[@class='title-desc']//p[contains(text(),'Post of forum createddddd')]")).size() != 0){
        	  foundpost=true;
         	 }
     	 else{
     		foundpost=false;
         	 
         	 }
          
         
          AssertJUnit.assertEquals(foundpost, exist);*/

          
       /* try{ 
        	 forumobj.createdpostxpath.isDisplayed();
        	 
        	 System.out.println("Element found");
        	 foundpost=true;
        	
        	}
        catch(Exception e){
        	
        	System.out.println("Element found");
        	foundpost=false;
        	
        	 }*/
          
           
          
         //  actualtextpostedbyuser=forumobj.createdpostxpath.getText();
          
      //     String id=driver.findElement(By.id("1004238")).getAttribute("1004238");
  
      //     System.out.println(id);
        
     
         
        //   AssertJUnit.assertEquals(expectedtextpostedbyuser,actualtextpostedbyuser);
           
           
           
          // actual=ForumScreenTest.verifypresenceofelement(forumobj.BroncosLynch2ofpost);
           
         //  Assert.assertEquals(actual, expected);
           
           
        //    actual=ForumScreenTest.verifypresenceofelement(forumobj.BudLightBroncosofpost);
           
           // Assert.assertEquals(actual, expected);
            
            
          ///  actual=ForumScreenTest.verifypresenceofelement(forumobj.Budlightbroncoscheersofpost);
            
          // Assert.assertEquals(actual, expected);
            
            
         /*   actualusernameonpost =forumobj.usernameonpost.getText();
            
            
            Assert.assertTrue(actualusernameonpost.contains(expectedusernameonpost),"USername ") ;
            
            System.out.println("usernameonpost="+actualusernameonpost);
            
           // Assert.assertEquals(actualusernameonpost,expectedusernameonpost );
            
            actualuserstatusonpost =forumobj.userprofilestatusonpost.getText();
            
            System.out.println("userstatusonpos=="+actualuserstatusonpost);
            
            Assert.assertEquals(actualuserstatusonpost, expecteduserstatusonpost);
            */
            
      }
   
   
         @Test(enabled=false)
   
   
         public void validatemessagelowerthan10charalert() throws InterruptedException{
	   
	   
	     testappproductionurl=prop.getProperty("url");
		  
		  
		  driver.get(testappproductionurl);
		  
		  Thread.sleep(6000);
		  
		  loginobj.userlogin(prop.getProperty("usernametestapp"),prop.getProperty("userpasswordtestapp"));
		  
		  Thread.sleep(7000);
		  
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  forumobj.forum.click();
		  
		  forumobj.forumcreateplusicon.click();
		  
		  Actions performAct = new Actions(driver);
	      performAct.sendKeys(forumobj.placeholder, "post").build().perform();
	      

          Actions action=new Actions(driver);
          action.moveToElement(forumobj.postlink).click().perform();
          
	      
	      
	      
	      
	      
	      
	      String actuallforummeassgealert =forumobj.errormesssagealert.getText();
	      
	      AssertJUnit.assertEquals(actuallforummeassgealert,expectedforumerrormessage );
	      
	      
	      }
   
   
   
           @Test(enabled=false)
   
   
           public void uploadimagevalidate() throws InterruptedException{
	   

	     testappproductionurl=prop.getProperty("url");
		  
		  
		  driver.get(testappproductionurl);
		  
		  Thread.sleep(6000);
		  
		  loginobj.userlogin(prop.getProperty("usernametestapp"),prop.getProperty("userpasswordtestapp"));
		  
		  Thread.sleep(6000);
		  
			WebDriverWait wait = new WebDriverWait(driver, 30);
		  
		    WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forum']")));
	 
		    

	
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  forumobj.forum.click();
		  
		  forumobj.forumcreateplusicon.click();
		  
		  Actions performAct = new Actions(driver);
	      performAct.sendKeys(forumobj.placeholder, "Post to verify that image get uploaded").build().perform();
	      
	      
	    /*  Actions actions2 = new Actions(driver);
	      actions2.moveToElement(forumobj.uploadimagebutton);
	       actions2.click();
	       
	       actions2.sendKeys(forumobj.uploadimagebutton,"/Users/kiwitech/Documents/my message and.png");*/
	      
	     //forumobj.uploadimagebutton.click();
	     
	     WebElement ele = driver.findElement(By.id("post_image"));
	     ele.sendKeys("/Users/kiwitech/Documents/denver.png");
	    
	    //  forumobj.uploadimagebutton.sendKeys("/Users/kiwitech/Documents/pear.png");
	 // actions2.build().perform();
	      
	     // forumobj.uploadimagebutton.sendKeys("/Users/kiwitech/Documents");
	      
	      
	      

           Actions action=new Actions(driver);
           
           action.moveToElement(forumobj.postlink).click().perform();
           
           Thread.sleep(7000);
           
           actualtextonpostwithimage= forumobj.createdpostxpath.getText();
           
           System.out.println(actualtextonpostwithimage);
          
           AssertJUnit.assertEquals(actualtextonpostwithimage,expectedpostbyuserwithimage );
           
           actualusernameonpost =forumobj.usernameonpost.getText();
           
           System.out.println(actualusernameonpost);
           
        //   AssertJUnit.assertTrue(actualusernameonpost.contains(expectedusernameonpost),"USername ") ;
           
           System.out.println("usernameonpost="+actualusernameonpost);
           
           
           actualuserstatusonpost =forumobj.userprofilestatusonpost.getText();
           
           System.out.println("userstatusonpos=="+actualuserstatusonpost);
           
           AssertJUnit.assertEquals(actualuserstatusonpost, expecteduserstatusonpost);
           
           actualusernameonimage=forumobj.userprifileimageonpost.getAttribute("title");
           
           AssertJUnit.assertEquals(actualusernameonimage,expectedusernameofimage);
           
           
           
             WebElement elem= driver.findElement(By.xpath("//img[@class='small-card-locked-img'][1]"));
           
             elem.isDisplayed();
             
             
             
             
           
           
        
           }
           
          /*    @Test(enabled=false)
           
           public void safeJavaScriptClick(WebElement element) throws Exception {
        		try {
        			if (element.isEnabled() && element.isDisplayed()) {
        				System.out.println("Clicking on element with using java script click");

        				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        			} else {
        				System.out.println("Unable to click on element");
        			}
        		} catch (StaleElementReferenceException e) {
        			System.out.println("Element is not attached to the page document "+ e.getStackTrace());
        		} catch (NoSuchElementException e) {
        			System.out.println("Element was not found in DOM "+ e.getStackTrace());
        		} catch (Exception e) {
        			System.out.println("Unable to click on element "+ e.getStackTrace());
        		}
        	}*/
           
           @Test(enabled=false)
           
           public void Validatelikfunctionalityonforum() throws Exception{
        	   System.out.println("Beak Point");

      	     testappproductionurl=prop.getProperty("url");
      		  
      		  
      		  driver.get(testappproductionurl);
      		  
      		  Thread.sleep(6000);
      		  
      		  loginobj.userlogin(prop.getProperty("usernametestapp"),prop.getProperty("userpasswordtestapp"));
      		  
      		  Thread.sleep(6000);
      		  
      			WebDriverWait wait = new WebDriverWait(driver, 30);
      		  
      		    WebElement element = wait
      					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forum']")));
      	 
      		    

      	
      		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      		  
      		  forumobj.forum.click();
      		  
      		  forumobj.forumcreateplusicon.click();
      		  
      		  Actions performAct = new Actions(driver);
      	      performAct.sendKeys(forumobj.placeholder, "Post to verify like functionality on forum").build().perform();
      	      

              Actions action=new Actions(driver);
              
              action.moveToElement(forumobj.postlink).click().perform();
              
             
              
             
              Thread.sleep(5000);
  
          	 
          	WebDriverWait wait3 = new WebDriverWait(driver, 30);
    		  
  		    WebElement element2 = wait
  					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='hamburger is-closed']")));
          	      
 
             forumobj.hamburegericon.click();
              
           
              
              Thread.sleep(5000);
              
              forumobj.userprofileimageonhambureger.click();
              
              forumobj.settingicon.click();
              
              forumobj.logouticon.click();
              
              Thread.sleep(6000);
              
             loginobj.userlogin("kartik50", "Sam@123456789");
             
             Thread.sleep(6000);
     		  
   			WebDriverWait wait1 = new WebDriverWait(driver, 30);
   		  
   		    WebElement element1 = wait1
   					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forum']")));
   	 
   		    

   	
   		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   		  
   		     forumobj.forum.click();
   		     
   		     
   	  actuallikecountbeforeclicking=forumobj.likecount.getText();
   	//	int a = Integer.parseInt(actuallikecountbeforeclickingg);
   		
   		  
   		  System.out.println("like count before click=="+actuallikecountbeforeclicking);
   		  
   		  
   		  
   		  AssertJUnit.assertEquals(expectedlikecountbeforeclicking,actuallikecountbeforeclicking);
   		  
   		  System.out.println("First Assertion successs");
   		  
   		 Thread.sleep(5000);
   		 
   		 System.out.println("befor click on like");
   		 
  /* 	WebDriverWait wait2 = new WebDriverWait(driver, 10);
   	wait2.until(ExpectedConditions.or(
   	    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='like  like-btn']//i[@class='icon-icon_like  new-share-icon '][1]"))
   	   */
   		 
   		 
   	
   	 //  action2.moveToElement(forumobj.likebuttonunhighlighted).click().perform();
   		 
   		  /*long time = System.currentTimeMillis();
   		  long end = time + 20000;
   		  while(time < end){
   			try{
   				System.out.println("inside for");
   				forumobj.likebuttonunhighlighted.isDisplayed();
   				break;
   				
   			
   			}
   			catch(Exception e){}*/
   		
   			
   			
   		  
   		
   		
   		
   				forumobj.likebuttonunhighlighted.click();
   				System.out.println("Inside Try");
   		
   	
   		
   		Thread.sleep(4000);
   		  
   		 actuallikecountafterclicking=forumobj.likecount.getText();
   		
   		 
   		 
   		 
   		 System.out.println("Like count after click=="+actuallikecountafterclicking);
   		 
   		 AssertJUnit.assertEquals(actuallikecountafterclicking, expecedlikecountafterclicking);
   		 
   		 System.out.println("Second Assertion success");
   		 
   		 
   		 //To verify that can't click on like button on self post
   		 
   		 System.out.println("befor click on like for 2nd time");
   		 
   		
   	/*	wait2.until(ExpectedConditions.or(
   		   	    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='like  like-btn']//i[@class='icon-icon_like  new-share-icon '][1]"))
   		   	   
   		   	));
   		   	*/
   		Actions action2 = new Actions(driver);
   	
   		   		 
   		action2.moveToElement(forumobj.likebuttonunhighlighted).click().perform();
   		
   		Thread.sleep(5000);
   		
   		 actuallikecountafterclicking=forumobj.likecount.getText();
   		 
           System.out.println("Like count after click=="+actuallikecountafterclicking);
           
           
           
           
           
   		 
   		 AssertJUnit.assertEquals(actuallikecountafterclicking, expecedlikecountafterclicking);
   		 }
   		 
   		 
   		 
   		 
   		 
   		 
   		  
   		  
   		  
   		  
   		
   		
   		  
   		
              
              
              
              
              
              
              
              
              
      	      
      	      
      	      
        	   
        	   
        	   
           
           @AfterMethod
           public void clean(){
         	 driver.close();
         	  
         	  
           }
          
          
   }


     



          
          
          
          
	