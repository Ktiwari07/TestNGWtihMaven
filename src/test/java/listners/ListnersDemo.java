package listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListners.class)
public class ListnersDemo {

    @Test
    public void test1(){
        System.out.println("this is test1");
        Assert.fail();
    }
    @Test
    public void test2(){
        System.out.println("this is test2");
        Assert.assertEquals(1,3);
    }
    @Test
    public void test3(){
        System.out.println("this is test3");
        Assert.assertTrue(true);
    }
    @Test
    public void test4(){
        System.out.println("this is test4");
        Assert.assertTrue(false);
    }
}
