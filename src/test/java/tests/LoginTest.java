package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void rightLogin () {
        loginSteps.login("jackymao", "1234567");
    }

    @Test
    public void invalidUserName () {
        loginSteps.login("jac", "1234567");
    }

    @Test
    public void invalidPassword () {
        loginSteps.login("jackymao", "123");
    }

    @Test
    public void emptyName () {
        loginSteps.login("", "1234567");
    }

    @Test
    public void emptyPassword () {
        loginSteps.login("jackymao", "");
    }

}
