package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptiosfromMTRArrayList {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver");
}
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///Users/gaurav/Desktop/Samples/Hotel.html");
	WebElement mtrLB = driver.findElement(By.id("mtr"));
	Select select = new Select(mtrLB);
	List<WebElement> allOptions = select.getOptions();
	 ArrayList<String> allText = new ArrayList<String>();
	for(WebElement option:allOptions)
	{
		String text = option.getText();
		allText.add(text);
	}
	Collections.sort(allText);
	for(String text : allText)
	{
		System.out.println(text);
	}
	driver.close();
}
}
