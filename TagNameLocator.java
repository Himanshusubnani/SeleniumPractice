/**
 * url=http://www.adactin.com/HotelApp/Register.php
 * Get all input tags
 * @author himanshu
 *
 */
package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver element=WebDriverFactory.browserFunction("http://www.adactin.com/HotelApp/Register.php");
		
		List<WebElement> ele=element.findElements(By.tagName("input"));
		
		for(WebElement list : ele) {
            System.out.println(list.getAttribute("name"));	
            
		
	}
		WebDriverFactory.main(element);

}
}
