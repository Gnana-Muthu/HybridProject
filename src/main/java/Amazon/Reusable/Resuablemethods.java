package Amazon.Reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Amazon.uistore.LoginpageUI;


public class Resuablemethods extends LoginpageUI  {

	public WebDriver driver;
	public static By signin=By.id("nav-link-accountList-nav-line-1");
    public static By emailid=By.id("ap_email");
	public static By continue1=By.id("continue");
	public static By password=By.id("ap_password");
	public static By submit=By.id("signInSubmit");


	public void Reusablemethods(WebDriver driver)
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