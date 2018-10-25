package Utility;

import java.io.File;
import pages.java.HomePage;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BasePackage.TestBase;
import pages.java.HomePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;

public class Util extends TestBase
{

	protected  Actions action;
	protected  WebDriverWait Expwait;
	protected WebDriverWait fwait;
	protected TakesScreenshot ts;
	protected JavascriptExecutor jse;
	protected ExtentHtmlReporter EHR1,EHR2;
	protected ExtentReports ER1,ER2;
	

	 
	public Object GetScreenShot()
	{
	 	ts= ((TakesScreenshot)w);
	 	System.out.println("Screen shot initialized****");
	 	return ts;
	
	}
 
	public Object ExplicitWaitInit()
	{
		Expwait= new WebDriverWait(w, 30);
		System.out.println("Explicit wait initialized****");
		return Expwait;
		
	}
	
	public Object FluentWaitInit()
	{
		fwait =(WebDriverWait) new FluentWait(w);
		System.out.println("Fluent wait initialized****");
		return fwait;
	}
	
	public Object ActionInit()
	{
		action= new Actions(w);
		System.out.println("Action class initialized****");
		return action;
	}
	
	public Object JScriptExecuter()
	{
	jse= ((JavascriptExecutor)w);
	System.out.println("Java script executer initialized****");
	return jse;
	}

	public Object ReporterOne()
	{
		EHR1= new ExtentHtmlReporter("./Reports/Report2.html");
		ER1 = new ExtentReports();
		ER1.attachReporter(EHR1);
		System.out.println("Extent report 1 initialized****");
		return ER1;	
	}
	
	public Object ReporterTwo()
	{
		EHR2= new ExtentHtmlReporter("./Reports/Report4.html");
		ER2 = new ExtentReports();
		ER2.attachReporter(EHR2);
		System.out.println("Extent report 2 initialized****");
		return ER2;	
	}
	


}

