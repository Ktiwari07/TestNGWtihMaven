package com.sdet;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver=null;
    @BeforeTest
    @Parameters({"browser","url"})
    public void setup(String browser,String url) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }
    @Test()

    public void login_test()throws Exception {

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

    }
}
