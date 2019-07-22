//WAP to close all the browser without using quit? 
package HandlingPopupInNaukri.com;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserWithoutquit {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> allWHS = driver.getWindowHandles();
	for(String wh:allWHS) {
	driver.switchTo().window(wh);
	driver.close();
	}
}
}
