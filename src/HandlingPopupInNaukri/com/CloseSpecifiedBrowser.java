//WAP to close specified browser?
package HandlingPopupInNaukri.com;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseSpecifiedBrowser {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
}
public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
String url="https://www.naukri.com/";
driver.get(url);
Set<String> allWHs = driver.getWindowHandles();
for(String wh:allWHs) {
	driver.switchTo().window(wh);
	String title = driver.getTitle();
	System.out.println(title);
    //driver.findElement(By.xpath("//title[text()='Cognizant']"));
	if(title.equals("ICICI")) {
		driver.close();
	}
}
}
}
