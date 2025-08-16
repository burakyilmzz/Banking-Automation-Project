package banking.automation.tests;

import banking.automation.base.BaseTest;
import banking.automation.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mngr34926", "amUpenu");
        // Başarılı login kontrolü basitçe sayfa başlığı ile yapılabilir
        System.out.println("Login completed. Title: " + driver.getTitle());
    }
}
