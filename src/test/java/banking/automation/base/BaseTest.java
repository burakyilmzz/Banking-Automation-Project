package banking.automation.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import banking.automation.utils.DriverManager;
import banking.automation.utils.ExtentManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;
    protected static ExtentReports extent;
    protected ExtentTest test;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://demo.guru99.com/");

        if (extent == null) {
            extent = ExtentManager.getInstance();
        }

        // Test başlangıcında Extent test objesi oluştur
        test = extent.createTest(this.getClass().getSimpleName());
    }

    @After
    public void tearDown() {
        if(driver != null) {
            DriverManager.quitDriver();
        }
        // Testi bitir
        extent.flush();
    }
}
