/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import main.java.com.myhomepractice.projecttwo.Test.SecondPage;
import main.java.com.myhomepractice.projecttwo.Test.UtilityFunction;


public class Test2 extends SecondPage
{

	@Test 
	  public void fillMailUnamePass()
	        {   
	            getElement3();
	            getElement4();
	            getElement5();
	            getElement6();
	            
	           Expwait.until(ExpectedConditions.elementToBeClickable(e3));
	           Expwait.until(ExpectedConditions.elementToBeClickable(e4));
	           Expwait.until(ExpectedConditions.elementToBeClickable(e5));
	            
	            e3.sendKeys("surajkhabale6694@gmail.com");
	            e4.sendKeys("ienfieldicious");
	            e5.sendKeys("Asdf1234");
	            action.moveToElement(e6).build().perform();
	            
	        }

}
