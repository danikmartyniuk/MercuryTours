package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage extends BasePage {

    private static final By TYPE = By.name("tripType");
    private static final By PASSENGERS = By.name("passCount");
    private static final By DEPARTING_FROM = By.name("fromPort");
    private static final By DEP_MONTH = By.name("fromMonth");
    private static final By DEP_DAY = By.name("fromDay");
    private static final By DESTINATION = By.name("toPort");
    private static final By RETURN_MONTH = By.name("toMonth");
    private static final By RETURN_DAY = By.name("toDay");

    private static final By SERVICE_CLASS = By.name("servClass");
    private static final By AIRLINE = By.name("airline");
    private static final By FIND = By.name("findFlights");

    private static final By DEPART_OPTION = By.name("outFlight");
    private static final By RETURN_OPTION = By.name("inFlight");
    private static final By RESERVE = By.name("reserveFlights");

    public FlightsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public FlightsPage openPage() {
        isPageOpened();
        return this;
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FIND));
    }

    //Parameters

    public FlightsPage setType (int type) {
        driver.findElements(TYPE).get(type).click();
        return this;
    }

    public FlightsPage setPassengers (String passengers) {
        new Select(driver.findElement(PASSENGERS)).selectByValue(passengers);
        return this;
    }

    public FlightsPage departCity (String city) {
        new Select(driver.findElement(DEPARTING_FROM)).selectByValue(city);
        return this;
    }

    public FlightsPage departMonth (String month) {
        new Select(driver.findElement(DEP_MONTH)).selectByValue(month);
        return this;
    }

    public FlightsPage departDay (String day) {
        new Select(driver.findElement(DEP_DAY)).selectByValue(day);
        return this;
    }

    public FlightsPage destinationCity (String city) {
        new Select(driver.findElement(DESTINATION)).selectByValue(city);
        return this;
    }

    public FlightsPage returnMonth (String month) {
        new Select(driver.findElement(RETURN_MONTH)).selectByValue(month);
        return this;
    }

    public void returnDay (String day) {
        new Select(driver.findElement(RETURN_DAY)).selectByValue(day);
    }

    public FlightsPage setServiceClass (int serviceClass) {
        driver.findElements(SERVICE_CLASS).get(serviceClass).click();
        return this;
    }

    public FlightsPage setAirline (String airline) {
        new Select(driver.findElement(AIRLINE)).selectByVisibleText(airline);
        return this;
    }

    public void findFlights () {
        driver.findElement(FIND).click();
    }

    //Results

    public FlightsPage chooseDepAirline (int airline) {
        driver.findElements(DEPART_OPTION).get(airline).click();
        return this;
    }

    public FlightsPage chooseReturnAirline (int airline) {
        driver.findElements(RETURN_OPTION).get(airline).click();
        return this;
    }

    public void reserve () {
        driver.findElement(RESERVE).click();
    }

}
