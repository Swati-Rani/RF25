package HandlingPopups;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopup {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.naukri.com");
	Set<String> allWHS = driver.getWindowHandles();
	int count=allWHS.size();
	System.out.println(count);
	for(String wh: allWHS) {
		driver.switchTo().window(wh);
		System.out.println(driver.getTitle());
		driver.close();
	}
}
}