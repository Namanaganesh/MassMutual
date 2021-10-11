package com.automatedtest.sample.problem1;

import java.text.NumberFormat;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.sample.basepage.BasePage;


public class Problem1Page extends BasePage{

	private static final String HOME_PAGE_URL = "https://www.exercise1.com/";




	Problem1Page() {
		PageFactory.initElements(driver, this);
	}

	void goToproblem1Page(String country){
		driver.get(HOME_PAGE_URL + country);
		wait.forLoading(5);
	}

	String getTitle() {
		return driver.getTitle();
	}

	public void setValue1(String value)
	{
		driver.findElement(By.id("lb1_val_1")).sendKeys(value);
	}
	public void setValue2(String value)
	{
		driver.findElement(By.id("lb1_val_2")).sendKeys(value);
	}
	public void setValue3(String value)
	{
		driver.findElement(By.id("lb1_val_3")).sendKeys(value);
	}
	public void setValue4(String value)
	{
		driver.findElement(By.id("lb1_val_4")).sendKeys(value);
	}
	public void setValue5(String value)
	{
		driver.findElement(By.id("lb1_val_5")).sendKeys(value);
	}
	public String getTotalBase()
	{
		return driver.findElement(By.id("lbl_ttl_val")).getText();
	}

	public boolean verifyValue1Currency()
	{
		String value1_s=driver.findElement(By.id("lb1_val_1")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		 
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		 String moneyString = "$"+formatter.format(value1);

		if(moneyString.equals(value1_s))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	public boolean verifyValue2Currency()
	{
		String value1_s=driver.findElement(By.id("lb1_val_1")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		 
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		 String moneyString = "$"+formatter.format(value1);

		if(moneyString.equals(value1_s))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	public boolean verifyValue3Currency()
	{
		String value1_s=driver.findElement(By.id("lb1_val_1")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		 
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		 String moneyString = "$"+formatter.format(value1);

		if(moneyString.equals(value1_s))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	public boolean verifyValue4Currency()
	{
		String value1_s=driver.findElement(By.id("lb1_val_1")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		 
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		 String moneyString = "$"+formatter.format(value1);

		if(moneyString.equals(value1_s))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	public boolean verifyValue5Currency()
	{
		String value1_s=driver.findElement(By.id("lb1_val_1")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		 
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		 String moneyString = "$"+formatter.format(value1);

		if(moneyString.equals(value1_s))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public boolean verifyValue1GreaterThan0()
	{
		String value1_s=driver.findElement(By.id("lb1_val_1")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		
		if(value1>0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean verifyValue2GreaterThan0()
	{
		String value1_s=driver.findElement(By.id("lb1_val_2")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		
		if(value1>0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean verifyValue3GreaterThan0()
	{
		String value1_s=driver.findElement(By.id("lb1_val_3")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		
		if(value1>0)
		{
			return true;
		}else
		{
			return false;
		}
	}


	public boolean verifyValue4GreaterThan0()
	{
		String value1_s=driver.findElement(By.id("lb1_val_4")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		
		if(value1>0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean verifyValue5GreaterThan0()
	{
		String value1_s=driver.findElement(By.id("lb1_val_5")).getText();
		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		
		if(value1>0)
		{
			return true;
		}else
		{
			return false;
		}
	}


	public int sumValue()
	{
		String value1_s=driver.findElement(By.id("lb1_val_1")).getText();
		String value2_s=driver.findElement(By.id("lb1_val_2")).getText();
		String value3_s=driver.findElement(By.id("lb1_val_3")).getText();
		String value4_s=driver.findElement(By.id("lb1_val_4")).getText();
		String value5_s=driver.findElement(By.id("lb1_val_5")).getText();


		int value1 =Integer.parseInt(value1_s.substring(1,value1_s.length()));
		int value2 =Integer.parseInt(value2_s.substring(1,value2_s.length()));
		int value3 =Integer.parseInt(value3_s.substring(1,value3_s.length()));
		int value4 =Integer.parseInt(value4_s.substring(1,value4_s.length()));
		int value5 =Integer.parseInt(value5_s.substring(1,value5_s.length()));

		int total=value1+value2+value3+value4+value5;
		return total;
	}

}
