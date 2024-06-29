package APK_test2;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HYBRID.Native_capabilities_2;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class APK_TEST_ extends Native_capabilities_2 {

AndroidDriver<AndroidElement> driver;
	
                                                             //GENERAL STORE
	@BeforeTest
	public void bt() throws MalformedURLException {
		
		driver = capabilityTwo();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(enabled = true)
	public void test1() throws InterruptedException {
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	
	
	Thread.sleep(2000);
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"))").click();
	
	Thread.sleep(2000);
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("varsha Agarwal");
	Thread.sleep(2000);
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
	
	Thread.sleep(2000);
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	Thread.sleep(2000);
	
	// add to cart by clicking
	driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
	Thread.sleep(2000);
	//driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
	
	       // add to cart from scrolling
	
driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))").click();
	
	driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
	
	
	
   driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	
	  Thread.sleep(2000); 
	  String text = driver.findElement(MobileBy.xpath("//*[@text='$160.97']")).getText();
	  System.out.println(text); 
	  String product = text.substring(1);
	  System.out.println(product);
	  
	  
	 
	   Thread.sleep(2000); 
	  String textTwo = driver.findElement(MobileBy.xpath("//*[@text='$55.0']")).getText();
	  System.out.println(textTwo); 
	  String product1 = textTwo.substring(1);
	  System.out.println(product1);
	  
	 
	  
	  Thread.sleep(2000);
	  String totalSum = driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	  System.out.println(totalSum); 
	  String totalPrice = totalSum.substring(2);
	  System.out.println(totalPrice);
	  
	  Double fP = Double.parseDouble(product); 
	  Double sP = Double.parseDouble(product1); 
	  Double Total = Double.parseDouble(totalPrice);
	
	
	Double num = fP + sP;
	//start the (  if else )block
	if(num.equals(Total)) {
		System.out.println("Cost Matched");
	}else {
		System.out.println("Cost Not Matched");
	}       
	//end the (  if else block  )  
	 
	
	driver.findElement(MobileBy.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']")).click();
	}
}

