package Practice;
import java.util.List;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptiosfromMTRTreeSet {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
}
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///Users/gaurav/Desktop/Samples/Hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select select = new Select(mtr);
	List<WebElement> allOptions = select.getOptions();
	TreeSet<String> allText = new TreeSet<String>();
	for(WebElement option:allOptions) {
		String text = option.getText();
		allText.add(text);
	}
	for(String text:allText) {
	System.out.println(text);	
	}
	driver.close();
}
}
