package abc_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("gb_70")).click();
	//  Assert.assertEquales(true,driver.getPageSource().contains("Google"));
		driver.findElement(By.id("identifierId")).sendKeys("nokolnaam00");
		driver.findElement(By.id("identifierNext")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement
		(By.xpath("//*[@id=\'password']/div[1]/div/div[1]/input")).sendKeys("QQ$%&90s$");
		
		Thread.sleep(10000);
		driver.findElement
		(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		
		Thread.sleep(10000);
		
		driver.findElement
		(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		
		driver.findElement
		(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div/div[5]/div[1]/a/span")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("gb_71")).click();
		
		

	}

}
