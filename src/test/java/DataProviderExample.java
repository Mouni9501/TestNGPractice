import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @Test (dataProvider = "dataprov")
    public void sample(int v1,int v2)
    {
       int sum =v1+v2;
        System.out.println(sum);
    }
@DataProvider(name="dataprov")
    public Object[][] dp()
    {
        return new Object[][]
        {
            {33,77},
            {90,32}
        };
    }
}
