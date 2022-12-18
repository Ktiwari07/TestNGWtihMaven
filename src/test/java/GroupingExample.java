import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("This is test1");
    }

    @Test(groups = {"regression","smoke"})
    public void test2(){
        System.out.println("this is test2");

    }
    @Test(groups = {"smoke"},dependsOnMethods = {"test1"},description = "This is test3 descrption")
    public void test3(){
        System.out.println("this is test3");
    }

    @Test(groups = {"regression"})
    void test4(){
        System.out.println("this is test4");
    }
}
