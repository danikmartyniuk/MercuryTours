package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private static final By USER_NAME = By.name("userName");
    private static final By PASSWORD = By.name("password");
    private static final By LOGIN_BUTTON = By.name("login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage openPage() {
        driver.get("http://newtours.demoaut.com/mercurysignon.php");
        isPageOpened();
        return this;
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
    }

    public LoginPage inputUserName (String userName) {
        driver.findElement(USER_NAME).sendKeys(userName);
        return this;
    }

    public LoginPage inputPassword (String password) {
        driver.findElement(PASSWORD).sendKeys(password);
        return this;
    }

    public void login () {
        driver.findElement(LOGIN_BUTTON).click();
        if (!driver.findElement(USER_NAME).getText().equals("jackymao") | !driver.findElement(PASSWORD).getText().equals("1234567")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Use our Flight Finder')]")));
        }
    }

}
