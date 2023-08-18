import org.testng.annotations.*;

public class AnnotationsPractice
{
    @BeforeMethod
    @Test
    public void Method1()
    {
        System.out.println("Before Method Annotation");
    }@AfterMethod
    @Test
    public void Method2()
    {
        System.out.println("After Method Annotation");
    }
    @Test @BeforeClass
    public void Method3()
    {
        System.out.println("BeforeClass");
    }
    @Test
    public void Method4()
    {
        System.out.println("I am in Method4");
    }
    @Test
    public void Method5()
    {
        System.out.println("I am in Method5");
    }
    @AfterClass
    @Test
    public void Method6()
    {
        System.out.println("AfterClass");
    }

}
