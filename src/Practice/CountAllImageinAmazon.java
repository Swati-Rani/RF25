package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountAllImageinAmazon {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
}
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in");
	List<WebElement> allImg = driver.findElements(By.xpath("//img"));
	int size = allImg.size();
	System.out.println(size);
	driver.close();
}
}
