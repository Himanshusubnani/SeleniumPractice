/**
 * URL: http://google.co.in/
 * Google Search id=gs_htif0
 * @author himanshu
 *
 */


package SeleniumPractice;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocator {

	public static void main(String[] args) throws NoSuchElementException {
		// TODO Auto-generated method stub
		WebDriver element=WebDriverFactory.browserFunction("http://google.co.in/");
		
		WebElement ele=element.findElement(By.id("gs_htif0"));
		
	String ele1=element.findElement(By.xpath(".//input[@id='gs_htif0']")).getAttribute("id");
		
		
		System.out.println(ele1);
		
		WebDriverFactory.main(element);
	}


}
