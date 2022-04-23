
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddNewContract {

    public WebDriver driver;

    public AddNewContract(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void newContactAdd()  {

        WebElement addContact = driver.findElement(By.xpath("//a[contains(text(),'Add Contact')]"));
        addContact.click();
        WebElement tegList = driver.findElement(By.id("checkbox-4-0108"));
        tegList.click();
        WebElement number = driver.findElement(By.name("number"));
        number.sendKeys("12345678956");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("mamun@test.com");
        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys("Mamunuur");
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Rashid");
        WebElement dateOfBirth = driver.findElement(By.name("birthday"));
        dateOfBirth.sendKeys("1995-1-21");
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Dhaka");
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Uttara,ShahajalalRoad");
        WebElement zipCode = driver.findElement(By.name("zip"));
        zipCode.sendKeys("1230");
        WebElement country = driver.findElement(By.name("country"));
        country.sendKeys("Bangladesh");
        WebElement address = driver.findElement(By.name("address"));
        address.sendKeys("Uttara,Dhaka-1230");
        WebElement submitBtn = driver.findElement(By.xpath("//button[contains(text(),'Add Contact')]"));
        submitBtn.click();

    }

    public void addContactWithEmptyData(){

        WebElement addContact = driver.findElement(By.xpath("//a[contains(text(),'Add Contact')]"));
        addContact.click();
        WebElement tegList = driver.findElement(By.id("checkbox-4-0108"));
        tegList.click();
        WebElement submitBtn = driver.findElement(By.xpath("//button[contains(text(),'Add Contact')]"));
        submitBtn.click();
        String text = driver.findElement(By.xpath("//span[contains(text(),'The number field is required.')]")).getText();
        Assert.assertTrue(text.contains("The number field is required."));

    }

    public void checkFiltering(){

        WebElement filterBtn = driver.findElement(By.xpath("//body/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]"));
        filterBtn.click();
        WebElement checkContactByNumber = driver.findElement(By.id("searchbytext"));
        filterBtn.sendKeys("322");

    }

    public void importContact(){

        WebElement importBtn = driver.findElement(By.xpath("//span[contains(text(),'Import Contacts')]"));
        importBtn.click();
        String text = driver.findElement(By.xpath("//h6[contains(text(),'Please upload contact document.')]")).getText();
        Assert.assertTrue(text.contains("Please upload contact document."));

    }



}
