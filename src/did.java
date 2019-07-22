import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class did implements IAutoConst{
static {
	System.setProperty(CHROME_KEY, CHROME_VALUE);
}
WebDriver driver;
@BeforeMethod
public void OpenApp() {
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
driver.get(URL);
}
@AfterMethod
public void CloseApp(ITestResult testResult) {
String name=testResult.getName();
int status=testResult.getStatus();
if(status==1) {
	Reporter.log(name+ "is Passed",true);
}else {
	Reporter.log(name+ "is Failed",true);
	String path=IMG_PATH +name + "./png";
	FwUtils.getPhoto(driver,path);
}
driver.close();
}
}
