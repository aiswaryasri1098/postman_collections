package ListenersTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestOrConfiguration;
import org.testng.internal.annotations.ITest;

public class ListenersTestNG implements ITestListener,IAnnotation  {
	//public class ListenersTestNG implements ITestListener,IAnnotationTransformer {

		public void onStart(ITest context) {

		System.out.println("onStart method started"+context.getName());

		}

		public void onFinish(ITestOrConfiguration context) {

		System.out.println("onFinish method started");

		}

		public void onTestStart(ITestResult result) {

		Reporter.log( "New Test Started" +result.getName());

		}

		public void onTestSuccess(ITestResult result) {

		//screenshot

		System.out.println("onTestSuccess Method " +result.getName());

		}

		public void onTestFailure(ITestResult result) {

		//screenshot

		System.out.println("onTestFailure Method" +result.getName());

		}

		public void onTestSkipped(ITestResult result) {

		System.out.println("onTestSkipped Method" +result.getName());

		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("onTestFailedButWithinSuccessPercentage" +result.getName());

		}

		}



