import org.junit.Test;

public class TestRunner extends Setup {


    AddNewContract addNewContract;
    LoginPage loginPage;


    @Test
    public void testNewContract() throws InterruptedException {
        driver.get("http://159.89.38.11/login");
        loginPage = new LoginPage(driver);
        loginPage.loginPage();

        Thread.sleep(5000);

        driver.get("http://159.89.38.11/contact/manage");
        addNewContract = new AddNewContract(driver);
        addNewContract.newContactAdd();

    }



}
