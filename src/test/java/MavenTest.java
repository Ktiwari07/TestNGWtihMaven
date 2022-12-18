import com.sdet.App;
import org.testng.Assert;
import org.testng.annotations.*;

public class MavenTest {

    @Test
    public void start(){
        System.out.println("this is start");
    }
    @Test
    public void Testlogin1(){

        App obj=new App();
        System.out.println("Inside Test login 1");
        int response=obj.userLogin("krishna","krishna123");
        Assert.assertEquals(1,response);

        }
    @Test
    public void Testlogin2(){

        App obj=new App();
        System.out.println("Inside Test login 2");
        int response=obj.userLogin("krishna","krishna1223");
        Assert.assertEquals(-1,response);
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after Method");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is Before Method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class method");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("THIS is after class method");
    }
    }

