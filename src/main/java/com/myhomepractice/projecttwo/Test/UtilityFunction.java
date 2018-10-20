package main.java.com.myhomepractice.projecttwo.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class UtilityFunction 

{
		protected WebDriver w;
		protected  Actions action;
		protected  WebDriverWait Expwait;
		protected WebDriverWait fwait;
		protected TakesScreenshot ts;
		protected JavascriptExecutor jse;
		protected ExtentHtmlReporter EHR1,EHR2;
		protected ExtentReports ER1,ER2;
		
		public Object DriverInit()
		{
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
			w= new ChromeDriver();   
		    return w;
		}
		
		 public void openLink() throws InterruptedException
		 {
			      
			   
			   w.get("https://wordpress.com/");
			   Thread.sleep(2000);
			   System.out.println("Im here loaded website going next");
			   System.out.println("webdriver is here before "+w);
		}
		 
		 public Object GetScreenShot()
			{
			 	ts= ((TakesScreenshot)w);
			 	return ts;
			
			}
		 
			public Object ExplicitWaitInit()
			{
				Expwait= new WebDriverWait(w, 30);
				return Expwait;
				
			}
			
			public Object FluentWaitInit()
			{
				fwait =(WebDriverWait) new FluentWait(w);
				return fwait;
			}
			
			public Object ActionInit()
			{
				action= new Actions(w);
				return action;
			}
			
			public Object JScriptExecuter()
			{
			jse= ((JavascriptExecutor)w);
			return jse;
			}

			public Object ReporterOne()
			{
				EHR1= new ExtentHtmlReporter("./Reports/Report2.html");
				ER1 = new ExtentReports();
				ER1.attachReporter(EHR1);
				return ER1;	
			}
			
			public Object ReporterTwo()
			{
				EHR2= new ExtentHtmlReporter("./Reports/Report4.html");
				ER2 = new ExtentReports();
				ER2.attachReporter(EHR2);
				return ER2;	
			}
			

}
