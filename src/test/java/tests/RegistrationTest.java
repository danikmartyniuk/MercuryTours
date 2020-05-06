package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void contactInfoRightValues () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao", "1234567", "1234567");
    }

    @Test
    public void lettersInPhone () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "lettersInPhone", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao1", "1234567", "1234567");
    }

    @Test
    public void emptyLastName () {
        registrationSteps
            .inputContactInformation("Jacky", "", "1234567", "test2020@mailinator.com")
            .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
            .inputUserInformation("jackymao2", "1234567", "1234567");
    }

    @Test
    public void invalidEmail () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020Invalidmailinatorcom")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao3", "1234567", "1234567");
    }

    @Test
    public void invalidPasswordConfirmation () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao4", "1234567", "12345");
    }

    @Test
    public void emptyPassword () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao5", "", "1234567");
    }

    @Test
    public void emptyStateAndPostal () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020@mailinator.com")
                .inputMailingInformation("Avenue Street, 5", "New York", "", "", "UNITED STATES")
                .inputUserInformation("jackymao6", "1234567", "1234567");
    }

    @Test
    public void invalidCityAndStreet () {
        registrationSteps
                .inputContactInformation("Jacky", "Mao", "1234567", "test2020@mailinator.com")
                .inputMailingInformation("Nexavisimosti, 5", "Old York", "NY", "10001", "UNITED STATES")
                .inputUserInformation("jackymao7", "1234567", "1234567");
    }
}
