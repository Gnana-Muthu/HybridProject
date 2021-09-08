package Amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Amazon.uistore.LoginpageUI;



public class Loginpage extends LoginpageUI  {
public WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement clicksign()
    {
		try
		{
    	   return driver.findElement(signin);
		}
		catch(Exception e)
		{
			System.out.println("cannot able to clicksign");
			return null;
		}
		
    }
	
	public WebElement username()
    {
    	try
		{
    	   return driver.findElement(emailid);
		}
		catch(Exception e)
		{
			System.out.println("cannot able to enterusername");
			return null;
		}
    }
	
	
	 public WebElement continueA()
     {
		 try
		 {
     	   return driver.findElement(continue1);
		 }
		 catch(Exception e)
		 {
			 System.out.println("cannot able to continue");
			 return null;
		 }

     }
 
     public WebElement password()
     {
    	 try
    	 {
     	    return driver.findElement(password);
    	 }
     	
     	catch(Exception e)
		 {
     		System.out.println("cannot able to enter password");
     		return null;
		 }
		
     }
     
     
     public WebElement submit()
     {
    	 try
    	 {
    		    System.out.println("cannot able to submit");
    			return driver.findElement(LoginpageUI.submit);
    	 }
     	
     	catch(Exception e)
		 {
     		return null;
		 }
     }
     public WebElement Search()
     {
    	 try
    	 {
    		   
    			return driver.findElement(LoginpageUI.search);
    	 }
     	
     	catch(Exception e)
		 {
     		 System.out.println("cannot search");
     		return null;
		 }
     }
     
	
	
}
