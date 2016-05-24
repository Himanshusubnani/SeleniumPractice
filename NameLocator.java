/**
 * URL: http://tutorialspoint.com/
 * Name locator in tutorialspoint search box, name=q
 * @author himanshu
 *
 */

package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver element=WebDriverFactory.browserFunction("http://tutorialspoint.com/");
		
		WebElement ele=element.findElement(By.name("q"));
		
		System.out.println(ele.getAttribute("placeholder"));
		
		WebDriverFactory.main(element);
	}

}
