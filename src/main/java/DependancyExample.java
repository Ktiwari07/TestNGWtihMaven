import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyExample {
    @Test
    public void StartCar(){
        System.out.println("car started");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"StartCar"})
    public void driverCar(){
        System.out.println("Car driving");

    }
    @Test(dependsOnMethods = {"driverCar"})
    public void stopCar(){
        System.out.println("car stopped");
    }
    @Test(dependsOnMethods = {"StartCar","stopCar"},alwaysRun = true)// always run will force this test method to run irrespective of the dependends to fail or passs.
    public void parkCar(){
        System.out.println("car parked");
    }
}
