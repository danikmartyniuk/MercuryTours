package tests;

import org.testng.annotations.Test;

public class FlightsTest extends BaseTest {

    @Test
    public void rightFlight () {
        String[] names = new String[]{"Jacky", "Daniil"};
        String[] surnames = new String[]{"Mao", "Martyniuk"};

        loginSteps.login("jackymao", "1234567");
        flightSteps
                .inputFlightDetails(1, "2", "New York", "2", "31", "London", "3", "8")
                .setPreferences(1, "No Preference")
                .selectFlight(0, 1)
                .buyTickets(names, surnames, "12345678");
    }

    @Test
    public void emptyCardNumber () {
        String[] names = new String[]{"Jacky", "Daniil"};
        String[] surnames = new String[]{"Mao", "Martyniuk"};

        loginSteps.login("jackymao", "1234567");
        flightSteps
                .inputFlightDetails(1, "2", "New York", "2", "31", "London", "3", "8")
                .setPreferences(1, "No Preference")
                .selectFlight(0, 1)
                .buyTickets(names, surnames, "");
    }

    @Test
    public void emptyPassengersInfo () {
        String[] names = new String[]{"",""};
        String[] surnames = new String[]{"", ""};

        loginSteps.login("jackymao", "1234567");
        flightSteps
                .inputFlightDetails(1, "2", "New York", "2", "31", "London", "3", "8")
                .setPreferences(1, "No Preference")
                .selectFlight(0, 1)
                .buyTickets(names, surnames, "12345678");
    }

}
