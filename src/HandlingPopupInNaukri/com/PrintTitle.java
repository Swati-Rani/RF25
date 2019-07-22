//WAP to print title of all the browser?
package HandlingPopupInNaukri.com;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintTitle {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> allWHS = driver.getWindowHandles();
	for(String wh:allWHS) {
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
	}
	driver.quit();
}
}
