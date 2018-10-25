
package pages.java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import Utility.Util;

public class HomePage extends Util

{
	@FindBy(xpath="//a[@id='navbar-websites-link']") //Websites link
    public WebElement e1;
	
	@FindBy(xpath="//a[@id='navbar-blogs-link']")	//Blogs link
    private WebElement e2;
	
	@FindBy(xpath="//a[@id='navbar-features-link']") //features link
    private WebElement e3;
	
	@FindBy(xpath="//a[@id='navbar-pricing-link']") // Pricing link
    private WebElement e4;
	
	@FindBy(xpath="//a[@id='navbar-news-link']") // News link
    private WebElement e5;
	
	@FindBy(xpath="//a[@id='navbar-support-link']") // support link
    private WebElement e6;
	
 
  
  public void clickWebsiteLink  ()
  {
	  System.out.println(e1.getText()+" Element 1******");
	  e1.click();
  }
 

  public void clickBlogsLink()
  {
     
    System.out.println(e2.getText());
    e2.click();
     
  }

  public void clickFeaturesLink()
  {
	  System.out.println(e3.getText());
	  e3.click();
  }
  
}


