package pages.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.Util;

public class PricingPage extends Util

{
	public WebElement E22,E23,E24,E25;
	
	
	public Object getE22()
	{
		//Start with Free button
		E22=w.findElement(By.xpath("//div[@class='description pre-features has-cta']/descendant-or-self::a[@id='plans-short-free-plan-cta']"));
		return E22;
		
	}

	public Object getE23()
	{
		E23=w.findElement(By.xpath("//input[@type='email']"));
		return E23;
		
	}
	
	public Object getE24()
	{
		E24=w.findElement(By.xpath("//input[@type='text']"));
		return E24;
		
	}
	
	public Object getE25()
	{
		E25=w.findElement(By.xpath("//input[@type='password']"));
		return E25;
	}
	
}
