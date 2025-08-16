package banking.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BalanceEnquiryPage {

    private WebDriver driver;

    private By accountField = By.name("accountno");
    private By submitButton = By.name("AccSubmit");

    public BalanceEnquiryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkBalance(String accountNo) {
        driver.findElement(accountField).sendKeys(accountNo);
        driver.findElement(submitButton).click();
    }
}
