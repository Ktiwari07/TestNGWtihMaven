import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {


    @DataProvider(name = "emailData")
    public Object[][] dataProviderDemo(){
        Object [][]data= {{"12@gmail.com",123},{"abc@gmail.com",123},{"jkdfj@hello.com",8989}};

        return data;
    }

    @Test(dataProvider = "emailData")
    public void printData(String email,int password){

        System.out.println(email+"      "+password);
    }
}
