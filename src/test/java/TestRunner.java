import org.testng.annotations.Test;

public class TestRunner extends Setup {


    AddNewContract addNewContract;
    LoginPage loginPage;


    @Test(priority = 0,description = "Add new Contact")
    public void testNewContract() throws InterruptedException {
        driver.get("http://159.89.38.11/login");
        loginPage = new LoginPage(driver);
        loginPage.loginPage();

        Thread.sleep(5000);

        driver.get("http://159.89.38.11/contact/manage");
        addNewContract = new AddNewContract(driver);
        addNewContract.newContactAdd();

    }

    @Test(priority = 1,description = "Add new Contact with empty data")
    public void testAddContactWithEmptyData() throws InterruptedException {
        Thread.sleep(6000);
        driver.get("http://159.89.38.11/contact/manage");
        addNewContract = new AddNewContract(driver);
        addNewContract.addContactWithEmptyData();

    }

    @Test(priority = 2,description = "Check filtering work properly")
    public void testFilteringWorkProperly() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("http://159.89.38.11/contact/manage");
        addNewContract = new AddNewContract(driver);
        addNewContract.checkFiltering();

    }

    @Test(priority = 3,description = "Add Contact by file")
    public void testImportContact() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("http://159.89.38.11/contact/manage");
        addNewContract = new AddNewContract(driver);
        addNewContract.importContact();

    }

}
