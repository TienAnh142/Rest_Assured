package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

public class AndroidTest {

	@Test
	public void androidLaunchTest() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
		options.setDeviceName("amuthan-test-device");
		options.setApp(System.getProperty("user.dir") + "/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(4000);
	}

	// @Test
	public void iosLaunchTest() throws MalformedURLException, InterruptedException {
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iphone 15");
		options.setApp(System.getProperty("user.dir") + "/apps/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");

		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(4000);
	}

}
