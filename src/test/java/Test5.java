 	package test.java;

import java.util.Properties;

import org.apache.poi.poifs.property.PropertyTable;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Utility.Util;
import pages.java.HomePage;;

public class Test5 extends TestBase

{	Util u1;
	HomePage hp;
	
		@BeforeMethod
		public void begin()
		{
			u1= new Util();
			super.UtilPropLoad();
			super.ChromeDriverInit();
			super.openLink();
			hp=PageFactory.initElements(w, HomePage.class);
			 	
		}
	
	
		@Test
		public void PageFirstActivity() throws InterruptedException 
		{
		
		//u1=PageFactory.initElements(w, HomePage.class);
		
		System.out.println("Page first activity instantiated , Lik opened");
		hp.clickWebsiteLink();
		hp.clickBlogsLink();
		hp.clickFeaturesLink();
		System.out.println("All elements discovered");
		}
	
	
	
	@AfterMethod
	public void TearDown()
	{
		//w.quit();
	}
}
