import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02 {
    @Test(priority = 1)
    public void TC02Setup(){
        System.out.println("this is TC02 setup ");
    }
    @Test
    public void TC02Login(){
        System.out.println("this is TC02 Login");

    }
    @BeforeMethod
    public void TC02BeforeMethod(){
        System.out.println("this is TC02 Before Method");

    }
    @AfterMethod
    public void TC02AfterMethod(){
        System.out.println("this is TC02 After Method");

    }
    @BeforeClass
    public void TC02BeforeClass(){
        System.out.println("this is TC02 before Class");
    }
}
