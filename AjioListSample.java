package week3.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioListSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(2000);
		String itemsCount = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Total listed items: "+itemsCount);
		List<WebElement> bagsBrand = driver.findElements(By.className("brand"));
		System.out.println("Bags Size: "+bagsBrand.size());
		System.out.println("Name of the Bags: ");
		for (WebElement webElement : bagsBrand) {
			String bags = webElement.getText();
			System.out.println(bags);

		}


	}

}
