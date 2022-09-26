package screenshot_testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/patel/Webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

	}

	public void failed(String testMehodName1) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\patel\\eclipse-practiceQA\\ScreenShot_TestNG\\ScreenshotsFolder\\"
		+testMehodName1+"_"+".jpg"));
	}
}

