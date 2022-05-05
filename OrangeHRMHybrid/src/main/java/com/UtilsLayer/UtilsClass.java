package com.UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void takeScreenshot()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat date=new SimpleDateFormat("ddMMyyyy_HHmmss");
		String dateandtime=date.format(new Date());
		String dest=System.getProperty("user.dir")+"\\Screenshot\\"+dateandtime+".png";
		
		try {
			FileUtils.copyFile(f, new File(dest));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
}
