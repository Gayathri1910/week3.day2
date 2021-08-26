package assignment6.day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(30000);
		WebElement Bags = driver.findElementByXPath("//input[@type='text']");
		Bags.sendKeys("Bags");
		Bags.sendKeys(Keys.ENTER);
		Thread.sleep(20000);
		driver.findElementByXPath("//label[@for='Men']").click();
		Thread.sleep(50000);
		driver.findElementByXPath("//*[@id=\"facets\"]/div[2]/ul/li[2]/div/div[2]/ul/li[4]/div/div/label").click();
		Thread.sleep(50000);
		String Bagsfound = driver.findElementByXPath("//*[@id=\"products\"]/div[3]/div/div[1]").getText();
		System.out.println("The Number of Bags found:" + Bagsfound);

		System.out.println("*****************LIST OF BRANDS NAMES********************");
		List<WebElement> brandsName = driver.findElementsByClassName("brand");
		// System.out.println(brandsName);

		for (WebElement webElement : brandsName) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("*****************LIST OF BAG NAMES********************");
		List<WebElement> Bagname = driver.findElementsByClassName("name");
		for (WebElement webElement1 : Bagname) {
			String text1 = webElement1.getText();
			System.out.println(text1);

		}
	}
}

