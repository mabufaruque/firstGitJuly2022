package lunchBrowser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {
	
	//methods
	//variables

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Mohammed Abu Faruque\\Desktop\\eclipse\\Java Work\\Seleium\\First_Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnk")).click();
		
		Thread.sleep(3000);
		
		//driver.close();     
		
	}

}
