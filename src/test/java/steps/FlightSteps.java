package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import pages.FlightsPage;

public class FlightSteps {

    FlightsPage flightsPage;
    BookingPage bookingPage;

    public FlightSteps (WebDriver driver) {
        flightsPage = new FlightsPage(driver);
        bookingPage = new BookingPage(driver);
    }

    @Step ("Input flight details")
    public FlightSteps inputFlightDetails (int type, String passengers, String depFrom, String depMonth, String depDay, String destination, String retMonth, String retDay) {
        flightsPage
                .openPage()
                .setType(type)
                .setPassengers(passengers)
                .departCity(depFrom)
                .departMonth(depMonth)
                .departDay(depDay)
                .destinationCity(destination)
                .returnMonth(retMonth)
                .returnDay(retDay);
        return this;
    }

    @Step ("Set preferences")
    public FlightSteps setPreferences (int serviceClass, String airline) {
        flightsPage
                .setServiceClass(serviceClass)
                .setAirline(airline)
                .findFlights();
        return this;
    }

    @Step ("Select flight")
    public FlightSteps selectFlight (int depAirline, int retAirline) {
        flightsPage
                .chooseDepAirline(depAirline)
                .chooseReturnAirline(retAirline)
                .reserve();
        return this;
    }

    @Step ("Buy tickets")
    public void buyTickets (String[] names, String[] surnames, String cardNumber) {
        bookingPage
                .openPage()
                .passengersInfo(names, surnames)
                .setCardNumber(cardNumber)
                .buyTickets();
    }
}
