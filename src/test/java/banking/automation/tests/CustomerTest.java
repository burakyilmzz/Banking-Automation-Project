package banking.automation.tests;

import banking.automation.base.BaseTest;
import banking.automation.pages.LoginPage;
import banking.automation.pages.ManagerHomePage;
import banking.automation.pages.NewCustomerPage;
import org.junit.Test;

public class CustomerTest extends BaseTest {

    @Test
    public void testAddNewCustomer() {
        LoginPage login = new LoginPage(driver);
        login.login("mngr34926", "amUpenu");

        ManagerHomePage home = new ManagerHomePage(driver);
        home.goToNewCustomer();

        NewCustomerPage customer = new NewCustomerPage(driver);
        customer.createCustomer(
                "Burak", "01011990", "Antalya St", "Antalya",
                "TR", "07000", "5554443322", "burak" + System.currentTimeMillis() + "@mail.com", "test123"
        );

        System.out.println("Customer created successfully!");
    }
}
