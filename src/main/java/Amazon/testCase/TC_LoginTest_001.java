package Amazon.testCase;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Amazon.Reusable.Resubalecomponents;
import Amazon.pageobject.Loginpage;
import Amazon.pageobject.SearchProducts;
import Amazon.utilities.ExcelDriven;
import Amazon.utilities.Sendmail;


public class TC_LoginTest_001 extends Resubalecomponents{
	
	@BeforeTest
	public void initialize() throws IOException {
		try {
			driver=setup();
		}catch(Exception e) {
			
		}
		
	}
	
	@Test
	public void loginTest() throws IOException {
		
		driver.get(baseURL);
		logger.info("Url is opened");
		Loginpage lp=new Loginpage(driver);
		lp.clicksign().click();
		lp.username().sendKeys(username);
		logger.info("Username is send");
		lp.continueA().click();
		lp.password().sendKeys(password);
		logger.info("password is send");
		lp.submit().click();
		
		
		
	}
	@Test(priority=2,dataProvider="getexceldata")
	public void SearchProducts(String search) throws IOException, InterruptedException {

		driver.get(baseURL);
		SearchProducts sp=new SearchProducts(driver);
		sp.search().click();
		sp.search().sendKeys(search);
		Thread.sleep(2000L);
		sp.search().sendKeys(Keys.ENTER);
		sp.search().clear();
		
	}
	
	
	@DataProvider
	public Object[][] getexceldata() throws IOException{
		ExcelDriven d=new ExcelDriven();
		ArrayList<String> data= d.getData("Amazon");
		int s=data.size();
		Object[][] searchdata=new Object[s][1];
		for(int i=0;i<s;i++) {
			searchdata[i][0]=data.get(i);
		}
		return searchdata;
		
	}
	@AfterSuite
	public void test() {
		Sendmail.sentEmail();
	}
	
	
}
