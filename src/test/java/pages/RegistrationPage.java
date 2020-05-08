package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {

    private static final By FIRST_NAME = By.name("firstName");
    private static final By LAST_NAME = By.name("lastName");
    private static final By PHONE = By.name("phone");
    private static final By EMAIL = By.id("userName");

    private static final By ADDRESS = By.name("address1");
    private static final By CITY = By.name("city");
    private static final By STATE = By.name("state");
    private static final By POSTAL_CODE = By.name("postalCode");
    private static final By COUNTRY = By.name("country");

    private static final By USER_NAME = By.id("email");
    private static final By PASSWORD = By.name("password");
    private static final By CONFIRM_PASSWORD = By.name("confirmPassword");

    private static final By SUBMIT = By.name("register");
    private static final By SUCCESS_MESSAGE = By.xpath("//*[contains(text(),'Thank you for registering')]");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public RegistrationPage openPage() {
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        isPageOpened();
        return this;
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@width='492']")));
    }


    public RegistrationPage inputFirstName (String firstName) {
        driver.findElement(FIRST_NAME).sendKeys(firstName);
        return this;
    }

    public RegistrationPage inputLastName (String lastName) {
        driver.findElement(LAST_NAME).sendKeys(lastName);
        return this;
    }

    public RegistrationPage inputPhone (String phone) {
        driver.findElement(PHONE).sendKeys(phone);
        return this;
    }

    public void inputEmail (String email) {
        driver.findElement(EMAIL).sendKeys(email);
    }


    public RegistrationPage inputAddress (String address) {
        driver.findElement(ADDRESS).sendKeys(address);
        return this;
    }

    public RegistrationPage inputCity (String city) {
        driver.findElement(CITY).sendKeys(city);
        return this;
    }

    public RegistrationPage inputState (String state) {
        driver.findElement(STATE).sendKeys(state);
        return this;
    }

    public RegistrationPage inputPostalCode (String postalCode) {
        driver.findElement(POSTAL_CODE).sendKeys(postalCode);
        return this;
    }

    public void chooseCountry (String country) {
        new Select(driver.findElement(COUNTRY)).selectByVisibleText(country + " ");
    }


    public RegistrationPage inputUserName (String userName) {
        driver.findElement(USER_NAME).sendKeys(userName);
        return this;
    }

    public RegistrationPage setPassword (String password) {
        driver.findElement(PASSWORD).sendKeys(password);
        return this;
    }

    public RegistrationPage confirmPassword (String confirm) {
        driver.findElement(CONFIRM_PASSWORD).sendKeys(confirm);
        return this;
    }

    public void submitRegistration () {
        driver.findElement(SUBMIT).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_MESSAGE));
    }

}
