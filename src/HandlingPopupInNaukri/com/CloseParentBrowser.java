//WAP to close parent browser? 
package HandlingPopupInNaukri.com;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseParentBrowser {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String parent = driver.getWindowHandle();
	Set<String> allWHs = driver.getWindowHandles();
	for(String wh:allWHs) {
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
	}
	driver.switchTo().window(parent);
	driver.close();
}
}
