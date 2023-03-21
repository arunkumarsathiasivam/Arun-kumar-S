package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	
	public static WebDriver driver;
	
	public static void getdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\MiniProjectArun\\driver\\chromedriver.exe");
	
        driver = new ChromeDriver();  
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void maxi() {
		driver.manage().window().maximize();
	}
	
	public static void inputValue(WebElement a, String b) {
		a.sendKeys(b);

	}
	public static void getTitle(WebDriver a) {
		String title = driver.getTitle();
		System.out.println("Title:"+ title);
	}
	public static void currentUrl(WebDriver a) {
		String url = driver.getCurrentUrl();
		System.out.println("CurrentUrl:"+ url);
	}
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();	
    }
    public static void alertAccept() {
	Alert alert = driver.switchTo().alert();
    alert.accept();
    }
    public static void alertDismiss() {
    Alert alert = driver.switchTo().alert();
    alert.dismiss();
	}
    public static void alertSendkeys(String keys) {
    Alert alert = driver.switchTo().alert();
    alert.sendKeys("keys");
    }
    public static void alertGettext() {
    Alert alert = driver.switchTo().alert();
    String text = alert.getText();
    System.out.println("Text: "+text);
	}
    public static void frameSwitch(WebElement a) {
	driver.switchTo().frame(a);
	}
    public static void frameDefault() {
    driver.switchTo().defaultContent();
	}
    public static void Sleep() throws InterruptedException{
    Thread.sleep(3000);
    }  
    public static void scrollByvalue(int value) {
    JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0," + value + ");");
    }
    public static void actionClick(WebElement a) {
		Actions ax =new Actions(driver);
		ax.contextClick(a).build().perform();
	}
    public static void actionContextClick(WebElement a) {
    	Actions ax =new Actions(driver);
    	ax.contextClick(a).build().perform();
	}
    public static  void actionDoubleClick(WebElement a) {
		Actions ax =new Actions(driver);
		ax.doubleClick(a).build().perform();
	}
    public static void actionMoveToElement(WebElement a) {
    	Actions ax =new Actions(driver);
    	ax.moveToElement(a).build().perform();
    }
    public static void robotKey(int KeyEvent) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent);
		r.keyRelease(KeyEvent);
	}
    public static void robotKeyPress(int keyEvent) throws AWTException {
    	Robot r = new Robot();
    	r.keyPress(keyEvent);
	}
    public static void robotKeyRelease(int keyEvent) throws AWTException {
    	Robot r = new Robot();
    	r.keyRelease(keyEvent);
	}
    public static void winodowHandles() {
		int size = driver.getWindowHandles().size();
		System.out.println("Windows size: "+size);	
	}
    public static void winodowHandle() {
		String wp = driver.getWindowHandle();
		System.out.println(wp);
	}
    public static void getTitle() {
		Set<String> all = driver.getWindowHandles();
		for (String cp : all) {
			String title = driver.switchTo().window(cp).getTitle();
			System.out.println(title);
		}
	}
    public static void particularWindow(String a) {
    	String act = a;
    	Set<String> all = driver.getWindowHandles();
    	for (String cp : all) {
    		if (driver.switchTo().window(cp).getTitle().equals(act)) {
    		break;
    		}
    	}
    }
    public static void dropDownByIndex(WebElement a,int b) {
		Select s = new Select(a);
		s.selectByIndex(b);
	}
    public static void dropDownByValue(WebElement a,String b) {
    	Select s = new Select(a);
		s.selectByValue(b);
	}
    public static void dropDownByVisibleText(WebElement a,String b) {
    	Select s = new Select(a);
		s.selectByVisibleText(b);
	}
    public static void dropDownDeSelectByIndex(WebElement a,int b) {
    	Select s = new Select(a);
		s.deselectByIndex(b);
	}
    public static void dropDownDeSelectByValue(WebElement a,String b) {
    	Select s = new Select(a);
		s.deselectByValue(b);
	}
    public static void dropDownDeSelectByVisibleText(WebElement a,String b) {
    	Select s = new Select(a);
		s.deselectByVisibleText(b);
	}
    public static void dropDownDeSelectAll(WebElement a) {
    	Select s = new Select(a);
    	s.deselectAll();
	}
    public static void implicitlyWait(int timeValue, TimeUnit timeUnit) {
		driver.manage().timeouts().implicitlyWait(timeValue, timeUnit);
	}
    public static void close() {
		driver.close();
	}
    public static void quit() {
		driver.quit();
	}
    public static void getScreenShot(String s) throws IOException {
    	TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\LENOVO\\eclipse-workspace\\MiniProjectArun\\ScreenshotMaven\\"+s+".png");
		FileUtils.copyFile(src, des);
    } 
}
