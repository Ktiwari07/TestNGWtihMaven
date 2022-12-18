package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test has been started");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test has been success");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("OnStart"+"  "+"test has been started");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("test finished");
    }
}
