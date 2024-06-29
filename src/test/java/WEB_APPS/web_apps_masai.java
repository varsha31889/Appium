package WEB_APPS;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class web_apps_masai {
	   
	//C:\Users\varsh\Downloads\chromedriver-win64\chromedriver-win64

	AndroidDriver<AndroidElement>  driver;
	
	@BeforeTest
	public   void  cap() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Oneplus"); 
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");  
		
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\varsh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c",false));
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
	 driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);

	}
	@Test
	public void test () {

		driver.get("https://www.google.com");
		driver.findElement(MobileBy.xpath("//textarea[@class='gLFyf']")).sendKeys("masai", Keys.ENTER);
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.ENTER).build().perform();

   List<AndroidElement> sizeOfLinks  = driver.findElements(By.tagName("a"));

   for(int i = 0; i<sizeOfLinks.size(); i++) {
	System.out.println(sizeOfLinks.get(i).getText());
	System.out.println(sizeOfLinks.get(i).getAttribute("href"));
	
}
}

	
}
