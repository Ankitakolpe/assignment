package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfailed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Ankita\\Selenium_jars\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.deepthought.education/login");
		WebElement user_name=driver.findElement(By.id("username"));
		WebElement pasword=driver.findElement(By.id("password"));
		user_name.sendKeys("username");
		pasword.sendKeys("password");
		driver.findElement(By.cssSelector("input[type='submit'])")).click();
		//driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//*[@id=\"login-error-notify\"]/p")).getText();
	
		
		
		 WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
	}

}
