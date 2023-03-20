package com.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base_class;

public class Browser_Launch extends Base_class  {

public static void main(String[]  args) {
			
	getdriver();
    getUrl("https://www.facebook.com/");
    maxi();
//    WebElement findElement = driver.findElement(By.id("email"));
    WebElement x1 = driver.findElement(By.id("email"));
    inputValue(x1, "arun@123");
    clickOnElement(x1);
}
}
