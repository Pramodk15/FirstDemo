package com.UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class Dropdown extends BaseClass{

	public static void selectByIndex(WebElement wb,int index)
	{
		Select sel=new Select(wb);
		sel.deselectByIndex(index);
	}
	public static void selectByValue(WebElement wb,String value)
	{
		Select sel=new Select(wb);
		sel.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement wb,String text)  
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(text);
	}
	
}
