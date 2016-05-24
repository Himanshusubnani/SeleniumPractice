/**
 * url=http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html
 * Get all PartialLinkText where links contain Element By
 * 
 * @author himanshu
 *
 */

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PartialLinkTextLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver element=WebDriverFactory.browserFunction("http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html");
		List<WebElement> ele=element.findElements(By.partialLinkText("Element By"));
		
		for(WebElement list : ele) {
            System.out.println(list.getText());	
            
            WebDriverFactory.main(element);
		
	}

}
}