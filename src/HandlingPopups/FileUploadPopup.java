package HandlingPopups;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FileUploadPopup {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
	public static void main(String[] args) throws Exception {
		File f= new File("./cv/Swati 2yrs experience.docx");
		String ap = f.getAbsolutePath();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		driver.findElement(By.id("input_resumeParser")).sendKeys(ap);
		System.out.println("File uploaded Successfully");
		Set<String> allWHS = driver.getWindowHandles();
		for(String wh:allWHS) {
			driver.switchTo().window(wh);
			if(!driver.getTitle().contains("Job Search")) {
				driver.close();
			}
		}
}
}
