package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tests.AllureUtils;

public class LoginPage extends BasePage {
    private final By USERNAME_INPUT = By.id("username");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("Login");
    private final By ERROR_MESSAGE = By.id("error");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы LoginPage")
    public void open() {
        driver.get(BASE_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
    }

    @Step("Вход в магазин SauceDemo с именем пользователя: '{user}' и паролем: '{password}'")
    public void login(String user, String password){
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        AllureUtils.takeScreenshot(driver);
    }

    @Step("Сообщение об ошибке")
    public String gerErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
