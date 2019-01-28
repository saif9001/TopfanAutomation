package com.ForumScreen;

import org.testng.AssertJUnit;

import Base.TestBase;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.AssertJUnit;

public class ForumScreen extends TestBase {
	
	
	   public ForumScreen() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		
		// TODO Auto-generated constructor stub
	   }

	//WebElements of forum community
    @FindBy(xpath="//a[text()='Forum']")
    public
	
	WebElement forum;
    
    public @FindBy(xpath="//a[text()='Community']")
	
	WebElement community;
    

    public @FindBy(xpath="//a[text()='Following']")

    WebElement following;


   public @FindBy(xpath="//a[text()='Popular']")

   WebElement popular;
 

   public @FindBy(xpath="//a[text()='FAN Wall ']")

    WebElement fanwall;



    public @FindBy(xpath="//a[@id='forum_community_members']")

   WebElement communitysearchicon;



   public@FindBy(xpath="//img[@src='/assets/plus-button.png']")

    WebElement forumcreateplusicon;


    public @FindBy(xpath="//button[@id='search_btn']")

     WebElement searchicon;


     public @FindBy(xpath="//a[text()='Feed']")

     WebElement feed;


     public  @FindBy(xpath="//a[text()='Packages']")

     WebElement packages ;

     public @FindBy(xpath="//a[text()='Events']")

     WebElement events;
 
 
     public @FindBy(xpath="//div[@placeholder_text='What’s on your mind?']")

     WebElement placeholder;
     public @FindBy(xpath="//div[@id='makemojifield']")

     WebElement placeholder1;
    
    public @FindBy(xpath="//div[@placeholder_text='What’s on your mind?']")

    WebElement createpostbox;
    
  //span[text()='Post']
    
  //span[text()='Post']
    
    public @FindBy(xpath="//span[text()='Post']")
    
    WebElement postlink;
    
    
    
    
    
  //div[@class='title-desc']//p[contains(text(),'hellodfgfdsgdfsgdfs')]
    
    
    public @FindBy(xpath="//div[@class='title-desc']/p[text()][1]")
    
    WebElement createdpostxpath;
    
    
     public @FindBy(xpath="//span[@class='error']")
    
     WebElement errormesssagealert ;
     
     
     public @FindBy(xpath="//button[@class='hamburger is-closed']")
   //  public @FindBy(xpath="//button")
     WebElement hamburegericon ;
     
     
     public @FindBy(xpath="//figure [@class='user-img']")
     
     WebElement userprofileimageonhambureger ;
     
        public @FindBy(xpath=" //a[@class='setting-icon']")
     
     WebElement settingicon ;
        
      
        
        public @FindBy(xpath=" //a[text()='Logout']")
        
        WebElement logouticon ;
        
        
   
   public @FindBy(xpath="//i[@class = 'icon-icon_like  new-share-icon '][1]")
   
   WebElement likebuttonunhighlighted ;
   
  
   
   
   
   public @FindBy(xpath="//div[@class='post-footer'][1]//span[1]")
   
   WebElement likecount ;
   
   public @FindBy(xpath="//img[@class='small-card-locked-img'][1]")
   
   WebElement useruploadeimageonpost;
   
   
   
 
        
        
        
     
     
     
     
  
     
     
     
   
     
     
     
     
     
     public @FindBy(xpath="//img[@src='https://app-assets.top-fan.com/uploads/client/default_user_avatar_image/19/91a572d0-85b2-0135-9332-0342b7cbc7b0.png'][1]")
     
     WebElement userprifileimageonpost ;
     
     
   //img[@src='https://app-assets.top-fan.com/uploads/client/default_user_avatar_image/19/91a572d0-85b2-0135-9332-0342b7cbc7b0.png'][1]
    
    
  
    
   
    
   public @FindBy(xpath="//div[@class='card-parent-div grid-item col3 article ' and @data-card-id='21330486efdc9dc14e953aed']//img[@src='https://tamm-assets.top-fan.com/5860ACB9-E48E-4306-B378-C0526339DD4C_thumb.jpg']")
    
    WebElement userprofileimageofpostedforum;
   
   //in the above xpath "userprofileimageofpostedforum" when we want to verify user profile image on the forum posted by user
   
   //Xpath of emojis
   
    public @FindBy(xpath="//img[@src='https://d1tvcfe0bfyi6u.cloudfront.net/sdk/MEButtonPlus.png'][1]")
   
   WebElement MakeEmojiIcon;
   
   
   
   public @FindBy(xpath="//div[@class='popover fade top in' ]//div[@id = 'makemojibrowse']//img[@id='1002902'][1]")
   
   WebElement Budlghtbrocos;
   
   
   public @FindBy(xpath="//div[@class='popover fade top in' ]//div[@id = 'makemojibrowse']//img[@id='1004239'][1]")
   
   WebElement BroncosLYnch2;
   
   public @FindBy(xpath="//div[@class='popover fade top in' ]//div[@id = 'makemojibrowse']//img[@id='1003163'][1]")
   
   WebElement BudLightBroncosCheers;
   
   
   
   //xpath of emojis on first post to verify them 
   public @FindBy(xpath="//div[@class='card-parent-div grid-item col3 article '][1]//img[@id='1002902']")
   
   WebElement BudLightBroncosofpost;
   
   public @FindBy(xpath="//div[@class='card-parent-div grid-item col3 article '][1]//img[@id='1004239']")
   
   WebElement BroncosLynch2ofpost;

   public @FindBy(xpath="//div[@class='card-parent-div grid-item col3 article '][1]//img[@id='1003163']")

   WebElement Budlightbroncoscheersofpost;
   
   
    public @FindBy(xpath="//span[@class='profile_name'][1]")

    WebElement userprofilestatusonpost;
   
    public @FindBy(xpath="//label[@class='add-image']")

    WebElement uploadimagebutton;
    
  
   
 //div[@class='name'][1]//p[contains(text(),'sam222')][1]
   
 //div[@class='name'][1]//p[contains(text(),'sam222')][1]
   
   public @FindBy(xpath="//div[@class='name'][1]//p[contains(text(),'sam222')][1]")

   WebElement usernameonpost;
   
   
   
   
   
     public void verifypresenceofemojionpost(WebElement element,String expectedid){
	   
	 String actuallid= element.getAttribute(expectedid);
	 
      System.out.println(actuallid);
	 
	 
	 AssertJUnit.assertEquals(expectedid,actuallid);
	 
	 
	  }

 	
 }
   
   
    
    
    
    
    
 
