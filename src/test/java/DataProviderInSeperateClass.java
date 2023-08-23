import org.testng.annotations.DataProvider;

public class DataProviderInSeperateClass
{
    @DataProvider(name="dp")
    public Object[][] getDp()
    {
        return new Object[][]
                {
                        {"mouni",1995},
                        {"ravi",1993}
                };
    }
}
