package automtion.Scenario2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class KushalElements {
	@Test
	public void elements() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.kushals.com/");
		driver.findElement(By.xpath("//div[@class='wzrk-alert wiz-show-animate']/descendant::button[.='No thanks']")).click();
//		Actions a = new Actions(driver);
//		WebElement e1 = driver.findElement(By.xpath("//li[contains(@class, 'navigation__item--with-mega-menu')]/a[contains(text(), 'Necklaces')]"));
//		wait.until(ExpectedConditions.visibilityOf(e1));
//		a.moveToElement(e1).perform();
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='main-nav']/div/div/ul/li/a[@class='navigation__link']"));
		
		for(WebElement e:ele) {	
			System.out.println(e.getText());
		}
		
		
		driver.close();
	}
}










