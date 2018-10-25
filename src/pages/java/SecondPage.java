package pages.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.Util;

public class SecondPage extends Util

{
	public WebElement iframe,e2,e3,e4,e5,e6;

	public Object iframe()
	 {
	     try{
	     List<WebElement> iframe= w.findElements(By.xpath("//iframe"));
	     System.out.println("Element 2");
	     }
	     catch(Exception e)
	     {
	     System.out.println("I caught exception in iFRAME");            
	     }
	     return iframe;
	 }
	 

	public Object getElement2()
	{
	    try
	    {
	    e2=w.findElement(By.id("search-component-2"));
	    System.out.println("Element 2");
	    } 
	    catch(Exception e)
	    {
	       System.out.println("I caught exception in Element 2"); 
	    }   
	    return e2;
	}

	public Object getElement3()
	{       //your email address field
	    try
	    {
	    e3=w.findElement(By.xpath("//*[@class='form-text-input signup-form__input' and id='email']"));
	    System.out.println("Element 3");
	    } 
	    catch(Exception e)
	    {
	       System.out.println("I caught exception in Element 3"); 
	    }   
	    return e3;
	}

	public Object getElement4()
	{       //choose username field
	    try
	    {
	    e4=w.findElement(By.xpath("//*[@class='form-text-input signup-form__input' and id='username']"));
	    System.out.println("Element 4");
	    } 
	    catch(Exception e)
	    {
	       System.out.println("I caught exception in Element 4"); 
	    }   
	    return e4;
	}

	public Object getElement5()
	{       //choose password field
	    try
	    {
	    e5=w.findElement(By.xpath("//*[@class='form-text-input signup-form__input' and id='password']"));
	    System.out.println("Element 5");
	    } 
	    catch(Exception e)
	    {
	       System.out.println("I caught exception in Element 5"); 
	    }   
	    return e5;
	}

	public Object getElement6()
	{       //Button to click
	    try
	    {
	    e6=w.findElement(By.xpath("//*[@class='form-text-input signup-form__input' and id='password']"));
	    System.out.println("Element 6");
	    } 
	    catch(Exception e)
	    {
	       System.out.println("I caught exception in Element 6"); 
	    }   
	    return e6;
	}

	
	
}
