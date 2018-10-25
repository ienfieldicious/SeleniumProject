package BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	public	Properties prop;
	public	WebDriver w;
	
	public void  UtilPropLoad()
	{
		File propFile= new File("./configuration/object.property");
		
		try { 
			FileInputStream propIpStream= new FileInputStream(propFile);
			prop= new Properties();
			prop.load(propIpStream);
			
			System.out.println("Property file loaded****");
			propIpStream.close();
			
			}
		catch (Exception e) {e.printStackTrace();}

			
	}
		
		
	public Object ChromeDriverInit()
	{
		//System.setProperty(prop.getProperty("ChromeDriverKey"), prop.getProperty("ChromeDriverValue"));
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		w= new ChromeDriver();  
		System.out.println("Webdriver initialized****");
	    return w;
	}
		
	
	 public void openLink()
	 {
		      
		   
		   w.get(prop.getProperty("appUrl"));
		   
		   try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		   
		   System.out.println("Im here loaded website going next");
		   System.out.println("webdriver is here before "+w);
	 }
	
}
