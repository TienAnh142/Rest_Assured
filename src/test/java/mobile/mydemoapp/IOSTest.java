package mobile.mydemoapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.GlobalConstant;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class IOSTest {

	IOSDriver driver;

	@BeforeClass
	public void launchApp() throws MalformedURLException, InterruptedException {
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iphone 14");
		options.setApp(System.getProperty("user.dir") + GlobalConstant.IOS_APP_FILE_PATH);
		driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(4000);

	}

	@Test
	public void TC_01_Login() {
		driver.findElement(AppiumBy.accessibilityId("open menu")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']")).click();
		driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");
		driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");
		driver.findElement(AppiumBy.accessibilityId("Login button")).click();
	}

}
