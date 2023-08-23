import org.testng.annotations.*;

public class AnnotationsPractice
{
    @BeforeMethod

    public void Method1()
    {
        System.out.println("Before Method Annotation");
    }
    @AfterMethod

    public void Method2()
    {
        System.out.println("After Method Annotation");
    }
    @BeforeClass

    public void Method3()
    {
        System.out.println("BeforeClass");
    }
    @BeforeTest
    public void Method4()
    {
        System.out.println("Before Test Annotation");
    }
    @Test
    public void Method5()
    {
        System.out.println("I am in Method5");
    }//this is your test
    @AfterClass
    public void Method6()
    {
        System.out.println("AfterClass");
    }

}
