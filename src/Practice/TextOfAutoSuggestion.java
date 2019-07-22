package Practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TextOfAutoSuggestion {
static {
 System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com");//Enter the URL
driver.switchTo().activeElement().sendKeys("sql");//Go to the active element and type SQL
Thread.sleep(2000);
List<WebElement> allASE = driver.findElements(By.xpath("//span[contains(text(),'sql')]"));//just used find elements
//get the size of all autosuggestion elements(ASE)
System.out.println(allASE.size());//print the number of count
for(WebElement str:allASE) 
  {                     //For Each loop used to get the text of all the autosuggestion
 System.out.println(str.getText());
  }
 allASE.get(0).click();//click on the first web Element present ie=SQL
 driver.close();
	}
	}

