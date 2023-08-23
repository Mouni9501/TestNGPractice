import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class ListenersExample extends Screenshot implements ITestListener
{

//    public void onTestStart(ITestResult result) // When Test started executing
//    {
//        System.out.println("onTestStart");
//    }
//
//    public void onTestSuccess(ITestResult result) { //When test got passed
//        System.out.println("onTestSuccess");
//    }

    public void onTestFailure(ITestResult result) { //When test failed
        TakesScreenshot ts = (TakesScreenshot) driver; // typecasting WebDriver instance to TakesScreenshot
        File sourceFile =  ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\javva\\Downloads\\New folder\\img1.jpg");
        try {
            FileUtils.copyFile(sourceFile,destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Screenshot saved successfully");
        System.out.println("onTestFailure");
    }
    public void onTestSkipped(ITestResult result) { //When test skipped
        System.out.println("onTestSkipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage");
    }

    public void onTestFailedWithTimeout(ITestResult result) { //When Test failed because of timeout

        this.onTestFailure(result);
        System.out.println("onTestFailedWithTimeout");
    }
//    public void onStart(ITestContext context) { // When class started executing
//        System.out.println("onStart");
//    }
//
//    public void onFinish(ITestContext context) { // When class execution got finished
//        System.out.println("onFinish");
//    }
}
