package screenshot_testng;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TestCases_ScreenShots extends Base {

	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();

	}

	
	
	@Test
	public void screenshot1() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	}
	
	@Test
	public void screenshot2() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}
	
	@Test
	public void screenshot3() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@Test
	public void screenshot4() {
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

}
}