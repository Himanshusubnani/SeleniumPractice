/**
+ * URL: http://stackoverflow.com/
+ * Get me all the questions on stackoverflow home page using class name locator
+ * 
+ * @author Himanshu
+ *
+ */
package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver element=WebDriverFactory.browserFunction("http://stackoverflow.com/");
		
		List<WebElement> ele=element.findElements(By.className("question-hyperlink"));
		for(WebElement list : ele) {
            System.out.println(list.getText());	
		
//		System.out.println(ele);
		
//		WebElement ele1=element.findElement(By.xpath(".//a[@class='question-hyperlink']"));
		
		WebDriverFactory.main(element);
}
	}
}
