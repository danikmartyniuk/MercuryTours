package steps;

import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;

public class RegistrationSteps {

    RegistrationPage registrationPage;

    public RegistrationSteps (WebDriver driver) {
        registrationPage = new RegistrationPage(driver);
    }

    public RegistrationSteps inputContactInformation (String firstName, String lastName, String phone, String email) {
        registrationPage
                .openPage()
                .inputFirstName(firstName)
                .inputLastName(lastName)
                .inputPhone(phone)
                .inputEmail(email);
        return this;
    }

    public RegistrationSteps inputMailingInformation (String address, String city, String state, String postalCode, String country) {
        registrationPage
                .inputAddress(address)
                .inputCity(city)
                .inputState(state)
                .inputPostalCode(postalCode)
                .chooseCountry(country);
        return this;
    }

    public RegistrationSteps inputUserInformation (String userName, String password, String confirmPassword) {
        registrationPage
                .inputUserName(userName)
                .setPassword(password)
                .confirmPassword(confirmPassword)
                .submitRegistration();
        return this;
    }
}
