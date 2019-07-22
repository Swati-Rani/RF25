//WAP to close all the child browsers?
package HandlingPopupInNaukri.com;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	String url = "https://www.naukri.com/";
	driver.get(url);
	Set<String> allWHs = driver.getWindowHandles();
	for(String wh:allWHs) {
	driver.switchTo().window(wh);
	String curl=driver.getCurrentUrl();
	System.out.println(curl);
	if(!url.equals(curl)) {
		driver.close();
	}
	}
}	
}

