

import org.testng.Assert;
import org.testng.annotations.Test;


public class Arithmetic {

    @Test (groups = {"Addition"})
    public void AddtionMethod1(){
        int a = 50;
        int b = 12;
        int c = a+b;
        Assert.assertEquals(c,62);
        System.out.println("Successfully executed Addtion Method-1");
    }

    @Test
    public void MultiplyMethod1(){
        int a = 10;
        int b = 32;
        int c = a*b;
        Assert.assertEquals(c,320);
        System.out.println("Successfully executed Multiply Method-1");
    }

    @Test (groups = {"Addition"})
    public void AddtionMethon2(){

        int a = 32;
        int b = 44;
        int c = a+b;
        Assert.assertEquals(c,76);
        System.out.println("Successfully executed Addtion Method-2");
    }

    @Test
    public void MultiplyMethod2(){

        int a = 20;
        int b = 12;
        int c = a*b;
        Assert.assertEquals(c,240);
        System.out.println("Successfully executed Multiply Method-2");
    }

    @Test
    public void MultiplyMethod3(){

        int a = 11;
        int b = 3;
        int c = a*b;
        Assert.assertEquals(c,33);
        System.out.println("Successfully executed Multiply Method-3");
    }

    @Test (groups = {"Addition"})
    public void AddtionMethod3(){
        int a = 31;
        int b = 23;
        int c = a+b;
        Assert.assertEquals(c,54);
        System.out.println("Successfully executed Addtion Method-3");
    }
}


