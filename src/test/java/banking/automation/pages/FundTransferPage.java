package banking.automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FundTransferPage {

    private WebDriver driver;

    private By payerAccount = By.name("payersaccount");
    private By payeeAccount = By.name("payeeaccount");
    private By amountField = By.name("ammount");
    private By descField = By.name("desc");
    private By submitButton = By.name("AccSubmit");

    public FundTransferPage(WebDriver driver) {
        this.driver = driver;
    }

    public void transferFunds(String payer, String payee, String amount, String desc) {
        driver.findElement(payerAccount).sendKeys(payer);
        driver.findElement(payeeAccount).sendKeys(payee);
        driver.findElement(amountField).sendKeys(amount);
        driver.findElement(descField).sendKeys(desc);
        driver.findElement(submitButton).click();
    }
}
