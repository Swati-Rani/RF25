package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxFacebook {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver");
}
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	WebElement day = driver.findElement(By.id("day"));
    Select select=new Select(day);
    select.selectByIndex(25);
    WebElement month = driver.findElement(By.id("month"));
    Select select1=new Select(month);
    select1.selectByVisibleText("Oct");
}
}
