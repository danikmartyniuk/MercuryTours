package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public BasePage (WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 25);
    }

    public abstract BasePage openPage ();
    public abstract void isPageOpened ();

}
