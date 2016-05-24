/**
 * url=http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html 
 * linktext=Locate Element By Name
 * 
 * @author himanshu
 *
 */

package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver element=WebDriverFactory.browserFunction("http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html");
	
			WebElement ele=element.findElement(By.linkText("Locate Element By Name"));
			
			ele.click();
			
			WebDriverFactory.main(element);
	}

}
