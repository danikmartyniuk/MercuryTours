package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BookingPage extends BasePage {

    private static final By PASSENGER_NAME = By.xpath("//input[contains(@name,'passFirst')]");
    private static final By PASSENGER_LAST = By.xpath("//input[contains(@name,'passLast')]");
    private static final By CARD_NUMBER = By.name("creditnumber");

    private static final By BUY_TICKETS = By.name("buyFlights");

    public BookingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BookingPage openPage() {
        isPageOpened();
        return this;
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUY_TICKETS));
    }

    public BookingPage passengersInfo (String[] names, String[] surnames) {
        for (int i = 0; i < names.length; i++) {
            driver.findElements(PASSENGER_NAME).get(i).sendKeys(names[i]);
            driver.findElements(PASSENGER_LAST).get(i).sendKeys(surnames[i]);
        }
        return this;
    }

    public BookingPage setCardNumber (String number) {
        driver.findElement(CARD_NUMBER).sendKeys(number);
        return this;
    }

    public void buyTickets () {
        driver.findElement(BUY_TICKETS).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//font[contains(text(),'Your \n" +
                "        itinerary has been booked!')]")));
    }
}
