
package test.java;


import java.io.IOException;
import main.java.com.myhomepractice.projecttwo.Test.HomePage;
import main.java.com.myhomepractice.projecttwo.Test.PricingPage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Test1 extends  Test4 //PricingPage
{
	
	//@BeforeMethod
	public  void StartUp() throws InterruptedException 
	{
		super.DriverInit();
		super.openLink();
		
	}
	
	//@AfterMethod
	public void CloseAndClear()
	{
	w.quit();	
	}
	
  //@Test
  public void TestCase1() throws  IOException 
  { 
	  ReporterOne();
	  ExtentTest logger1=ER1.createTest("Test case : 1");
	  logger1.log(Status.INFO, "Test case started");
	  
	  try {
	 	   
     System.out.println("Element status 1"+e1);
     getElement1();
     System.out.println("Element status 2"+e1);
     System.out.println("webdriver is here man "+w);
     
     ExplicitWaitInit();
     Expwait.until((ExpectedConditions.elementToBeClickable(e1)));
     
     ActionInit();
     action.moveToElement(e1).build().perform();
     logger1.log(Status.INFO, "Moved to element");
     e1.click();
     System.out.println("webdriver is here"+w);
     w.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     String title=w.getTitle();
     System.out.println(title);
     
    Assert.assertEquals("Create a Website with WordPress.com", title);
    logger1.log(Status.PASS, "Assert verified");
    w.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    
    GetScreenShot();
    
    java.io.File SrcFile= ts.getScreenshotAs(OutputType.FILE);
    java.io.File DestFile= new java.io.File("D://Sooraj//ScreenShot//SS2.png");
    
    org.apache.commons.io.FileUtils.copyFile(SrcFile, DestFile);
    logger1.log(Status.INFO, "Captured Screen shot");
    JScriptExecuter();
//    jse.executeScript("window.scrollBy(0,2000)");
    
    getElement7();
    action.moveToElement(e7).build().perform();
//  jse.executeScript("arguments[0].scrollIntoView();", e7);
  
	ER1.flush();
	ER1.close();
	}	
  
  catch(Exception e)
  {e.printStackTrace(); }
  }
  
  //@Test
  public void TestCase2() throws IOException
  {
	 ReporterTwo();
	 ExtentTest logger2= ER2.createTest("Test case: 2");
	 logger2.log(Status.INFO, "Test case 2 started");
	   
	getE21();
	Expwait.until(ExpectedConditions.elementToBeClickable(E21));
	
	E21.click();
	w.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	logger2.log(Status.PASS, "First Link clicked");
	
	getE22();
	E22.click();
	w.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	logger2.log(Status.PASS,"Button clicked Moving next page");
	
	getE23();
	E23.sendKeys("SurajKh@live.com");
	w.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	getE24();
	E24.sendKeys("dadaBhai");
	w.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	getE25();
	w.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	E25.sendKeys("QWERTY");
  
	GetScreenShot();
    java.io.File SrcFile2= ts.getScreenshotAs(OutputType.FILE);
    java.io.File DestFile2= new java.io.File("D://Sooraj//ScreenShot//SS4.png");
    
    org.apache.commons.io.FileUtils.copyFile(SrcFile2, DestFile2);
	
	logger2.log(Status.PASS, "All the elements entered values with");
	logger2.addScreenCaptureFromPath("D://Sooraj//ScreenShot//SS3.png");
	ER2.flush();
	ER2.close();
	
  }
  
//@Test(dataProvider="getData")
public void show1(String sName,String sSchool)
{
	System.out.println("Name is "+sName);
	System.out.println("School is "+sSchool);
}

@Test(dataProvider="getData")
public void show2(String sName,String sSchool, String sAdd)
{
	System.out.println("Name is "+sName);
	System.out.println("School is "+sSchool);
	System.out.println("Address is"+sAdd);
}


//@DataProvider
//public Object[][] getData()
//{
//	Object data[][]=Test4.getTestData(0);
//	return data;
//	
//}

@DataProvider
public ArrayList<Object> getData()
{
	ArrayList<Object> data= new ArrayList<Object>();
			
			
			data=Test4.getTestData(0);
	return data;
	
}




}


