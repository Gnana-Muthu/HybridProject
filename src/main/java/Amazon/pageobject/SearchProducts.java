package Amazon.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Amazon.uistore.LoginpageUI;

public class SearchProducts extends LoginpageUI{
	public WebDriver driver;
	public SearchProducts(WebDriver driver){
		this.driver=driver;
	}
	 
	
	public WebElement search()
    {
		try
		{
			return driver.findElement(search);
		}
		catch(Exception e)
		{
			System.out.println("cannot able to clicksign");
			return null;
		}
		
    }
}
