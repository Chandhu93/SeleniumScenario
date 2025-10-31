package Miscellealous;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {

@Test
public void brokenLinks() {

	WebDriver driver = new ChromeDriver();		// https://demoqa.com/
	driver.get("https://www.onlinesbi.sbi/");
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	System.out.println (allLinks.size());

	for(WebElement l : allLinks ) 	{
		String eachLink = l.getAttribute("href");
		try  {
			URL url = new URL(eachLink);
			HttpURLConnection httpCon = (HttpURLConnection)url.openConnection();
			int statusCode = httpCon.getResponseCode();
			if(statusCode >= 400) {
				System.out.println(eachLink +" ===> "+ (statusCode));
			} } catch (Exception e) {

			}
	}
	driver.quit();
}

}


