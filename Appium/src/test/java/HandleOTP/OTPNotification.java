package HandleOTP;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class OTPNotification {
	@Test
	public void otpHandle() throws MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		dc.setCapability(MobileCapabilityType.UDID,"R9ZNC03VN6X");
		dc.setCapability("appPackage","com.meesho.supply");
		dc.setCapability("appActivity",".main.MainActivity");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[377,363][678,475]']")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Categories']")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Kids']")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Baby Sets']")).click();
//		driver.findElementByXPath("//(android.widget.ImageView[@resource-id='com.meesho.supply:id/catalog_cover'])[1]").click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='Add to Cart']")).click();
		
//		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
//		driver.findElementById("com.meesho.supply:id/phone_edit_text").sendKeys("7899386961");
//		driver.findElementByXPath("//android.widget.Button[@text='Send OTP']").click();
//		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[377,363][678,475]']")).click();
		 driver.findElementById("com.meesho.supply:id/query_edit_text").sendKeys("kids");
		 driver.findElementById("com.meesho.supply:id/query_edit_text").click();
	//	driver.pressKeyCode(new KeyEvent(null, AndroidKeyCode.ENTER, 0, 0, 0));
		//searchbtn.sendKeys(Keys.ENTER);
	//	driver.findElementById("com.meesho.supply:id/search_icon").click();
		
	}

}
