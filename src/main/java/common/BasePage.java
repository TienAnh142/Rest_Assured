package common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class BasePage {
	protected WebElement getWebElement(WebDriver driver, String locatorType) {
		return driver.findElement(getByLocator(locatorType));
	}

	protected List<WebElement> getListWebElements(WebDriver driver, String locatorType) {
		return driver.findElements(getByLocator(locatorType));
	}

	private AppiumBy getByLocator(String locatorType) {
		AppiumBy appiumBy = null;
		if (locatorType.startsWith("accessibilityID") || locatorType.startsWith("AccessibilityID")
				|| locatorType.startsWith("accessibilityid")) {
			appiumBy = (AppiumBy) appiumBy.accessibilityId(locatorType.substring(15));
//		} else if (locatorType.startsWith("css") || locatorType.startsWith("CSS") || locatorType.startsWith("Css")) {
//			appiumBy = appiumBy.(locatorType.substring(4));
//		} else if (locatorType.startsWith("xpath") || locatorType.startsWith("XPATH") || locatorType.startsWith("Xpath")
//				|| locatorType.startsWith("XPath")) {
//			appiumBy = appiumBy.xpath(locatorType.substring(6));
//		} else if (locatorType.startsWith("name") || locatorType.startsWith("NAME") || locatorType.startsWith("Name")) {
//			appiumBy = appiumBy.name(locatorType.substring(5));
//		} else if (locatorType.startsWith("class") || locatorType.startsWith("CLASS")
//				|| locatorType.startsWith("Class")) {
//			appiumBy = appiumBy.className(locatorType.substring(6));
//		} 
		} else {
			throw new RuntimeException("Locator type is not supported!");
		}
		return appiumBy;
	}
}
