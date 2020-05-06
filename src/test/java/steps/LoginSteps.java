package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps (WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    @Step ("Input username {userName} and password {password} on log-in page")
    public void login (String userName, String password) {
        loginPage
                .openPage()
                .inputUserName(userName)
                .inputPassword(password)
                .login();
    }

}
