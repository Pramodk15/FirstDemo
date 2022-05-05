package com.UtilsLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class ActionsClass extends BaseClass{


public void clickonElement(WebElement wb) {
	Actions act=new Actions(driver);
	act.click(wb).build().perform();
	
}		
	
}
