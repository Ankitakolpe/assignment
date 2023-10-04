package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class enterdetails {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Ankita\\Selenium_jars\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.deepthought.education/login");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(20, 20);

		
		String actual_error= driver.findElement(By.xpath("//*[@id=\"login-error-notify\"]/p")).getText();
		String expected_error="Please enter username and password.";
		Assert.assertEquals(expected_error,actual_error);
		Driver.close();
	}

}
