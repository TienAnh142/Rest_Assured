package mobile.mydemoapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.GlobalConstant;
import common.MobileBaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class AndroidTest extends MobileBaseTest {

	AndroidDriver driver;

	@BeforeClass
	public void launchApp() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
		options.setDeviceName("amuthan-test-device");
		options.setApp(System.getProperty("user.dir") + GlobalConstant.ANDROID_APP_FILE_PATH);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
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
