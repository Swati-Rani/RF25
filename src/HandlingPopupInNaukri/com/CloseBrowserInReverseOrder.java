package HandlingPopupInNaukri.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
        
public class CloseBrowserInReverseOrder {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> allWHs = driver.getWindowHandles();
		ArrayList<String> alst = new ArrayList<String>(); 
		for(String st :allWHs) {
			alst.add(st);
			driver.switchTo().window(st);
			System.out.println(driver.getTitle());
		   }
		Collections.reverse(alst);
		for(String s:alst) {
			driver.switchTo().window(s);
			Thread.sleep(1000);
			driver.close();
		}
	}
}
