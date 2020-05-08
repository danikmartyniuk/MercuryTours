package tests;

import org.testng.annotations.Test;

public class FlightsTest extends BaseTest {

    @Test (description = "Input right parameters for flight booking")
    public void rightFlight () {
        String[] names = new String[]{"Jacky", "Daniil"};
        String[] surnames = new String[]{"Mao", "Martyniuk"};

        loginSteps.login("jackymao", "1234567", true);
        flightSteps
                .inputFlightDetails(1, "2", "New York", "2", "31", "London", "3", "8")
                .setPreferences(1, "No Preference")
                .selectFlight(0, 1)
                .buyTickets(names, surnames, "12345678");
    }

    @Test (description = "Leaving empty card number in flight booking")
    public void emptyCardNumber () {
        String[] names = new String[]{"Jacky", "Daniil"};
        String[] surnames = new String[]{"Mao", "Martyniuk"};

        loginSteps.login("jackymao", "1234567", true);
        flightSteps
                .inputFlightDetails(1, "2", "New York", "2", "31", "London", "3", "8")
                .setPreferences(1, "No Preference")
                .selectFlight(0, 1)
                .buyTickets(names, surnames, "");
    }

    @Test (description = "Leaving empty name and surname fields in credit card section for flight booking")
    public void emptyPassengersInfo () {
        String[] names = new String[]{"",""};
        String[] surnames = new String[]{"", ""};

        loginSteps.login("jackymao", "1234567", true);
        flightSteps
                .inputFlightDetails(1, "2", "New York", "2", "31", "London", "3", "8")
                .setPreferences(1, "No Preference")
                .selectFlight(0, 1)
                .buyTickets(names, surnames, "12345678");
    }

}
