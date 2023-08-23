import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

@Listeners(ListenersExample.class)
public class Screenshot {
    WebDriver driver;
    @BeforeMethod
    public void launchingBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void takingScreenshot() throws IOException {
        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "abc";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test
    public void method1()
    {
       driver.get("https://youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
