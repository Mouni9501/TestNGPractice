import org.testng.annotations.Test;


public class DataproviderInSeperateClassExample {
    @Test(dataProvider = "dp",dataProviderClass = DataProviderInSeperateClass.class)
    public void names(String name,int v1)
    {
        System.out.println(name+" "+v1);
    }
}
