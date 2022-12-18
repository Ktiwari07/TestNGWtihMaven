import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
    @Test(priority = 1)
    public void TC01Setup(){
        System.out.println("this is TC01 setup ");
    }
    @Test(enabled = false)
    public void TC01Login(){
        System.out.println("this is TC01 Login");

    }
    @BeforeMethod
    public void TC01BeforeMethod(){
        System.out.println("this is TC01 Before Method");

    }
    @AfterMethod
    public void TC01AfterMethod(){
        System.out.println("this is TC01 After Method");

    }
    @BeforeClass
    public void TC01BeforeClass(){
        System.out.println("this is TC01 before Class");
    }
}
