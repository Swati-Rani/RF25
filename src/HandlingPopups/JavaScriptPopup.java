package HandlingPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptPopup {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		System.out.println(alert.getText());
		driver.close();
		
}
}
