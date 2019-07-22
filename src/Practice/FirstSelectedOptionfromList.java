package Practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOptionfromList {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
}
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///Users/gaurav/Desktop/Samples/Hotel.html");
	WebElement slvLB = driver.findElement(By.id("slv"));
	Select select=new Select(slvLB);
	WebElement option = select.getFirstSelectedOption();
	String text=option.getText();
	System.out.println(text);
	
	List<WebElement> allOptions = select.getOptions();
	System.out.println(allOptions.size());
	
	for(WebElement option1:allOptions) {
	String text1=option1.getText();
	System.out.println(text1);
	
	}
driver.close();
}
}
