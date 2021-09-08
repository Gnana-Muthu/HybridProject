package Amazon.utilities;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Amazon.Reusable.Resubalecomponents;
 

 
public class listeners implements ITestListener{
  
	Resubalecomponents b=new Resubalecomponents();

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
    }
 
    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub

    }
 
    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub

        try {
            b.getScreenshot(result.getName());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }
 
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }
 

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }
 
    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
    	Sendmail sm=new Sendmail();
    	
    	

    }
}
 
    
