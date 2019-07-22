package Login1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//a[text()='Sign In']")
private WebElement signIN;

@FindBy(id="usernameOrEmail")
private WebElement unTB;

@FindBy(id="password")
private WebElement pwTB;

@FindBy(xpath="//button[contains(text(),'Sign in')]")
private WebElement loginBTN;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void signINButton() {
	signIN.click();
}
public void setUserName(String un) {
	unTB.sendKeys(un);
}
public void setPassword(String pwd) {
	pwTB.sendKeys(pwd);
}
public void clickLoginButton() {
	loginBTN.click();
}

}
