package banking.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {

    private WebDriver driver;

    private By nameField = By.name("name");
    private By genderMale = By.xpath("//input[@value='m']");
    private By dobField = By.name("dob");
    private By addressField = By.name("addr");
    private By cityField = By.name("city");
    private By stateField = By.name("state");
    private By pinField = By.name("pinno");
    private By mobileField = By.name("telephoneno");
    private By emailField = By.name("emailid");
    private By passwordField = By.name("password");
    private By submitButton = By.name("sub");

    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createCustomer(String name, String dob, String addr, String city,
                               String state, String pin, String mobile,
                               String email, String password) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(genderMale).click();
        driver.findElement(dobField).sendKeys(dob);
        driver.findElement(addressField).sendKeys(addr);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(pinField).sendKeys(pin);
        driver.findElement(mobileField).sendKeys(mobile);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
}
