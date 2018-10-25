package test.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.jetty.util.ArrayTernaryTrie.Growing;
import org.testng.annotations.Test;

import pages.java.PricingPage;


public class Test4 extends PricingPage

{	public static int gColcount=0;
	public static int gRowCount=0;
	static XSSFRow r;
	static XSSFSheet sh;
 public static FileInputStream fi;


public static Object[][] getTestData(int iSheetNum)
{

	try {
	File f= new File("C:\\Users\\suraj\\ProjectTwo\\TestData\\DataSet1.xlsx");	
	fi = new FileInputStream(f);
	XSSFWorkbook wb= new XSSFWorkbook(fi);
	sh= wb.getSheetAt(iSheetNum);
	r=sh.getRow(0); 
	}
	catch (FileNotFoundException e) {e.printStackTrace();} 
	catch (IOException e) {e.printStackTrace();}

	int iRowCount=sh.getLastRowNum();
	System.out.println(iRowCount);	
	int iColCount= r.getLastCellNum();
	
	Object[][] data= new Object[iRowCount][iColCount];	
	
	for(int i=0;i<iRowCount;i++)
	{
		for(int j=0;j<iColCount;j++)
		{
			data[i][j]=sh.getRow(i).getCell(j).toString();
		}
	}
	
	return  data;	
}
	
}

