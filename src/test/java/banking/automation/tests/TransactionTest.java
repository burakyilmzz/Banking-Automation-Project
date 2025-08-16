package banking.automation.tests;

import banking.automation.base.BaseTest;
import banking.automation.pages.*;
import org.junit.Test;

public class TransactionTest extends BaseTest {

    @Test
    public void testFundTransferAndBalance() {
        LoginPage login = new LoginPage(driver);
        login.login("mngr34926", "amUpenu");

        ManagerHomePage home = new ManagerHomePage(driver);

        home.goToFundTransfer();
        FundTransferPage transfer = new FundTransferPage(driver);
        transfer.transferFunds("12345", "54321", "500", "Rent");

        home.goToBalanceEnquiry();
        BalanceEnquiryPage balance = new BalanceEnquiryPage(driver);
        balance.checkBalance("12345");

        System.out.println("Fund transfer and balance check completed!");
    }
}
