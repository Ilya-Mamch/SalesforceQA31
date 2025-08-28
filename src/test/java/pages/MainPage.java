package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    private final By CREATE_BUTTON = By.xpath("//*[text()='Create']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть main страницу")
    public MainPage openMain() {
        driver.get(MAIN_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CREATE_BUTTON));
        return this;
    }

    public MainPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CREATE_BUTTON));
        return this;
    }
}
