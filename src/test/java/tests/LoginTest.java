package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test (description = "Right login values")
    public void rightLogin () {
        loginSteps.login("jackymao", "1234567", true);
    }

    @Test (description = "Input wrong username")
    public void invalidUserName () {
        loginSteps.login("jac", "1234567", false);
    }

    @Test (description = "Input wrong password")
    public void invalidPassword () {
        loginSteps.login("jackymao", "123", false);
    }

    @Test (description = "Leaving empty username field")
    public void emptyName () {
        loginSteps.login("", "1234567", false);
    }

    @Test (description = "Leaving empty password field")
    public void emptyPassword () {
        loginSteps.login("jackymao", "", false);
    }

}
