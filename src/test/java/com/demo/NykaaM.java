package com.demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_class;

public class NykaaM extends Base_class{
	public static void main(String[]  args) throws InterruptedException, IOException {
		getdriver();
	    getUrl("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjijLjt0N79AhUJmmYCHVnJBasYABAAGgJzbQ&ohost=www.google.com&cid=CAESbOD2YgETxWS5y1eL91beMIUswN4rRHV5_o7MyQKqHn72-Pse5LukI9ClgWAFS0ZV6GcC9yEuuxt6ysocanM8FTthULTfEuSXQxxIc7jqMqEDOWmHvqYb2ym3C1Q0csvP9ea_m0JjWgoNyobHWQ&sig=AOD64_3RQo9iVvT-YNU-aHrY7SGcjG6kow&q&adurl&ved=2ahUKEwj88LLt0N79AhUFXWwGHWOmCXcQ0Qx6BAgJEAE");
	    maxi();
	    WebElement hairtab = driver.findElement(By.xpath("//a[text()='hair']"));
	    Sleep();
	    moveToElement(hairtab);
	    Sleep();
	    WebElement shampootab = driver.findElement(By.xpath("//a[text()='Shampoo']"));
	    clickOnElement(shampootab);
	    Sleep();
	    currentUrl(driver);
	    scrollByvalue(1000);
	    getScreenShot("ss2");
	}

}
