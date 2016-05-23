package SeleniumPractice;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverFactory {

	public static WebDriver browserFunction (String url){
		
		Proxy proxy=new Proxy();
		proxy.setNoProxy("");
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setCapability(CapabilityType.PROXY, proxy);
	
	WebDriver browser=new FirefoxDriver(cap);
		browser.get(url);
		browser.manage().window().maximize();
		return browser;
		
		}
	
	public static void main(WebDriver browser) {
		
		
		// TODO Auto-generated method stub
		browser.close();
	
	
	
	
}
}
