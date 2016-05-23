/**
 * URL1: https://www.google.co.in
 * URL2: https://in.yahoo.com/
 * Demonstrate below actions
 * Browser Launch (navigate.to, get method)
 * setSize
 * setPosition
 * back / forward / refresh
 * @author Himanshu
 *
 */

package SeleniumPractice;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proxy proxy=new Proxy();
		proxy.setNoProxy("");
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setCapability(CapabilityType.PROXY, proxy);
		WebDriver browser=new FirefoxDriver(cap);
		browser.get("https://www.google.co.in");
		browser.manage().window().maximize();
		browser.manage().window().setSize(new Dimension(2000, 3500));
		browser.manage().window().setPosition(new Point(400, 450));
		browser.navigate().to("https://in.yahoo.com/");
		browser.navigate().back();
		browser.navigate().refresh();
		
	}

}
