import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginPage(){

        WebElement userName = driver.findElement(By.id("email-1"));
        WebElement password = driver.findElement(By.id("password-1"));
        WebElement btnLogin = driver.findElement(By.id("m_login_signin_submit"));


        userName.sendKeys("test@orangetoolz.com");
        password.sendKeys("8Kh8nTe*^jdk");
        btnLogin.click();

    }

}
