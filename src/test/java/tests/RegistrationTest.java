package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test (description = "Input right values")
    public void contactInfoRightValues () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao", "1234567", "1234567");
    }

    @Test (description = "Type letters in phone field")
    public void lettersInPhone () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "lettersInPhone", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao1", "1234567", "1234567");
    }

    @Test (description = "Leaving empty last name field")
    public void emptyLastName () {
        registrationSteps
            .inputContactInformation("Jacky", "", "1234567", "test2020@mailinator.com")
            .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
            .inputUserInformation("jackymao2", "1234567", "1234567");
    }

    @Test (description = "Setting invalid email")
    public void invalidEmail () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020Invalidmailinatorcom")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao3", "1234567", "1234567");
    }

    @Test (description = "Invalid password confirmation")
    public void invalidPasswordConfirmation () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao4", "1234567", "12345");
    }

    @Test (description = "Leaving empty password field")
    public void emptyPassword () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao5", "", "1234567");
    }

}
