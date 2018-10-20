
package main.java.com.myhomepractice.projecttwo.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class HomePage extends UtilityFunction

{
  public WebElement e1,e7,E21;
  
  public Object getElement1  ()
  {
     try 
     {  
    	
    //clickGet
    e1= w.findElement(By.id("navbar-websites-link"));
    System.out.println(e1.getText());
    System.out.println("Element 1");
    
     }
     catch(Exception e)
     {
         System.out.println("I caught exception in Element 1");
     }
     return e1;
  }
 

  public Object getElement7()
  {
     try 
     {  
    	
    //Spatial Image to scroll
    e7= w.findElement(By.xpath("//img[@alt='Spatial']"));
    
    System.out.println(e7.getText());
    System.out.println("Element 7");
    
     }
     catch(Exception e)
     {
         System.out.println("I caught exception in Element 7");
     }
     return e7;
  }

  public Object getE21()
  {
	  E21=w.findElement(By.id("navbar-pricing-link"));
	  System.out.println("Element 21");
	  return E21;
  }
  
}


