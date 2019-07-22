package Login1;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestValidLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
public static void main(String[] args) throws Exception {
	String path="./data/Workbook1.xlsx";
	Workbook wb= WorkbookFactory.create(new FileInputStream(path));
	String un = wb.getSheet("validLogin") .getRow(1).getCell(0).toString();
	String pwd = wb.getSheet("validLogin") .getRow(1).getCell(1).toString();
	WebDriver driver = new ChromeDriver();
	LoginPage lp=new LoginPage(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://101.53.142.3:8010");
	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	driver.findElement(By.id("usernameOrEmail")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
