package learn;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test01 {
	
	@Test
	public void testGoogle(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com.hk/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = driver.findElement(By.name("f"));
	}
	

	@Test
	public void test1() throws Exception {
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com.hk/");
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("zy");
		driver.findElement(By.name("btnK")).click();
//		assertEquals("zy - Google 搜索", driver.getTitle());
	}
}
