package banking.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerHomePage {

    private WebDriver driver;

    private By newCustomerLink = By.linkText("New Customer");
    private By fundTransferLink = By.linkText("Fund Transfer");
    private By balanceEnquiryLink = By.linkText("Balance Enquiry");

    public ManagerHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToNewCustomer() {
        driver.findElement(newCustomerLink).click();
    }

    public void goToFundTransfer() {
        driver.findElement(fundTransferLink).click();
    }

    public void goToBalanceEnquiry() {
        driver.findElement(balanceEnquiryLink).click();
    }
}
