package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountAutoSuggestion {
static {
 System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	   }
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com");
driver.switchTo().activeElement().sendKeys("Selenium");
Thread.sleep(2000);
List<WebElement> allASE = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
System.out.println(allASE.size());
for(WebElement str:allASE) {
	System.out.println(str.getText());
}
allASE.get(0).click();
}
}
