package Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class log {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://apps.qaplanet.in//qahrm//login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'6632')]/preceding-sibling::td/input"));
		if(s.isEnabled())
		{
			s.click();
			System.out.println("dis");
		}
		else
		{
			System.out.println("not");
		}
		
		
	}
	}


