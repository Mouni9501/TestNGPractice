import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ITestResultExample {
    @Test
    public void m1()
    {
      int a= 45;
      int b =90;
      int c =a+b;
          Assert.assertEquals(c,95);
        System.out.println("m1 got failed");
    }
    @Test
    public void m2()
    {
        int a= 45;
        int b =90;
        int c= b-a;
        Assert.assertEquals(c,45);
    }
    @AfterMethod
    public void getStatus(ITestResult result)
    {
      if(result.getStatus()==ITestResult.SUCCESS)
      {
          System.out.println("This method got succeed " +result.getMethod().getMethodName());
      }
      else if (result.getStatus()==ITestResult.FAILURE) {
          System.out.println("This method got failed " +result.getMethod().getMethodName());
      }
    }
}
