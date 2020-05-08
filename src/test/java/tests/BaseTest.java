package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import steps.FlightSteps;
import steps.LoginSteps;
import steps.RegistrationSteps;
import utils.CapabilitiesGenerator;
import utils.TestListener;

import java.util.concurrent.TimeUnit;

@Listeners ({TestListener.class})
public class BaseTest {

    WebDriver driver;
    RegistrationSteps registrationSteps;
    LoginSteps loginSteps;
    FlightSteps flightSteps;

    @BeforeTest
    public void setUp () {
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        registrationSteps = new RegistrationSteps(driver);
        loginSteps = new LoginSteps(driver);
        flightSteps = new FlightSteps(driver);
    }

    @AfterTest
    public void close () {
        driver.quit();
    }

    public WebDriver getDriver () {
        return this.driver;
    }

}
