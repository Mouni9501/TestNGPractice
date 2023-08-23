import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenersExample.class)
public class ListenersPractice

{
  @Test (dependsOnMethods = "test3")
  public void test1()
  {
      System.out.println("welcome");
  }
  @Test
    public void test2()
  {
      System.out.println("hi");
  }
  @Test
    public void test3()
  {
      Assert.assertTrue(false);
      System.out.println("Failed");
  }
    @Test (timeOut=2000)
    public void test4() throws InterruptedException {
       Thread.sleep(3000);
        System.out.println("method failed because of time out");
    }
}
