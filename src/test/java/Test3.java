package test.java;
//package test.java;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//import Utility.UtilityFunction;
//
//@Test
//public class Test3 extends UtilityFunction
//
//{
//	{
//
//	super.DriverInit();
//	w.get("https://wordpress.com/start/about?ref=create-website-lp");
//	w.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//	w.manage().window().maximize();
//
//	List<WebElement> l1= w.findElements(By.className("form-text-input"));
//	
//	for (WebElement s:l1)
//	{
//		System.out.println(s);
//	}
//	
//   	ExtentHtmlReporter EHR= new ExtentHtmlReporter("./Reports/Report1.html");
//
//  	ExtentReports ER = new ExtentReports();
//	ER.attachReporter(EHR);
//   ExtentTest logger= ER.createTest("Suraj's first test");
//   logger.log(Status.INFO, "Completion of Test");
//   logger.log(Status.PASS, "Passed");
//   ER.flush();
//   ER.close();
//	
//	
//	}	
//}
