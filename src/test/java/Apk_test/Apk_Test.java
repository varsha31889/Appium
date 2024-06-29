package Apk_test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Native_capabilities.Api_Demos_capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
//static import of element
import static io.appium.java_client.touch.offset.ElementOption.element;
//static import of time
import static java.time.Duration.ofSeconds;

public class Apk_Test extends Api_Demos_capabilities {
	
	AndroidDriver<AndroidElement> driver;
  @BeforeTest
  public void BT() throws MalformedURLException {
	  driver  = capabilities();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  
	  
}
 
@Test(enabled = false)
  public void test() throws InterruptedException {
	  System.out.println("Appium");
	  
	  driver.findElement(MobileBy.AccessibilityId("Accessibility")).click();
	  Thread.sleep(2000);
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AccessibilityId("Preference")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
	  Thread.sleep(2000);
	 // driver.pressKey(new KeyEvent(AndroidKey.BACK));
	//  Thread.sleep(2000);
	  //driver.findElement(MobileBy.id("android:id/CheckBox")).click();
	  //Thread.sleep(2000);
	  //driver.findElement(MobileBy.xpath("//*[@text='WiFi settings']")).click();
   //Thread.sleep(2000);
	//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(/"WiFi setting"/)"));
	  driver.findElement(MobileBy.id("android:id/edit")).sendKeys("varsha");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("android:id/button2")).click();
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  Thread.sleep(2000);
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  
  }

 
  @Test(enabled = false)
   public void notification() {
    driver.openNotifications();
    driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
}
  @Test(enabled = false)
  public void views() throws InterruptedException  {
	 
     /*
	   webview
	   if you want to scroll you need 3 things
	  1: UiAutomator    2: UiScrollable    3: Uiselector
	  if you want to scroll to a particular element then views scrollInto view 
	  
	    */
	  driver.findElement(MobileBy.AccessibilityId("Views")).click();
	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click(); 
	 // driver.pressKey(new KeyEvent(AndroidKey.BACK));
	   driver.findElement(MobileBy.AccessibilityId("Expandable Lists")).click();
	   Thread.sleep(2000);
	   driver.findElement(MobileBy.AccessibilityId("1. Custom Adapter")).click();
	   Thread.sleep(2000);
	   
	  // AndroidElement fishName = driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Fish Names\")"));
	 AndroidElement dogName = driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dog Names\")"));
	   Thread.sleep(2000); 
	 TouchAction ta = new TouchAction(driver);
	 //ta.longPress(longPressOptions().withElement(element(fishName)).withDuration(ofSeconds(2))).release().perform();
	ta.longPress(longPressOptions().withElement(element(dogName)).withDuration(ofSeconds(2))).release().perform();
	
	 
  }
  @Test(enabled = false)
  public void view () throws InterruptedException {
	  driver.findElement(MobileBy.AccessibilityId("Views")).click();
	  Thread.sleep(2000); 
	  driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
	  Thread.sleep(2000); 
	  driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
	  
	  TouchAction ta1 = new TouchAction(driver);
	  
	             //to drag and drop
	  
	  AndroidElement hour = driver.findElement(MobileBy.AccessibilityId("12"));
	  Thread.sleep(2000); 
	  AndroidElement minute = driver.findElement(MobileBy.AccessibilityId("10"));
	  Thread.sleep(2000); 
	  
	  ta1.longPress(longPressOptions().withElement(element(hour)).withDuration(ofSeconds(3)))
      .moveTo(element(minute)).release().perform();
	  
	  AndroidElement hours = driver.findElement(MobileBy.AccessibilityId("15"));
	  Thread.sleep(2000); 
	  AndroidElement minutes = driver.findElement(MobileBy.AccessibilityId("55"));
	  Thread.sleep(2000); 
	  
	  ta1.longPress(longPressOptions().withElement(element(hours)).withDuration(ofSeconds(3)))
      .moveTo(element(minutes)).release().perform();
	  
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  
	  
  }
  @Test(enabled = false)
  public void dragAndDrop2() throws InterruptedException {
	 
			driver.findElement(MobileBy.AccessibilityId("Views")).click();
			Thread.sleep(2000);	
			driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
			Thread.sleep(2000);
			
			//to drag and drop
			TouchAction ta2 = new TouchAction(driver);
			
			 AndroidElement drag = driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
			 AndroidElement drop = driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_2"));
			ta2.longPress(longPressOptions().withElement(element(drag)).withDuration(ofSeconds(3)))
			.moveTo(element(drop)).release().perform();
			
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);	
			driver.pressKey(new KeyEvent(AndroidKey.HOME));
			Thread.sleep(2000);
			driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			
	  
  }
  @Test(enabled = true)
  public void messegages () throws InterruptedException{
	  
		driver.findElement(MobileBy.AccessibilityId("OS")).click();
		Thread.sleep(2000);	
		driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
		Thread.sleep(2000);	
		
		// to send the message by using my mobile number and message body(hii)
		 driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(650) 555 - 1212");
		 Thread.sleep(2000);	
		 driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_content")).sendKeys("hii");
		 Thread.sleep(2000);	
		 driver.findElement(MobileBy.AccessibilityId("Send")).click();
		Thread.sleep(10000);	
		
		// to activate the app (any app to activate write activateApp 
		driver.activateApp("com.google.android.apps.messaging");
		Thread.sleep(10000);
		
		 String text = driver.findElement(MobileBy.id("com.google.android.apps.messaging:id/conversation_snippet")).getText();
		 System.out.println(text);
			
		Thread.sleep(3000);	
		driver.activateApp("io.appium.android.apis"); 
  }
  
  
}
