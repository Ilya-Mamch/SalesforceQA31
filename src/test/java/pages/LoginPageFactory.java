package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tests.AllureUtils;

public class LoginPageFactory extends BasePage {

    @FindBys({
            @FindBy(id = "username"),
            @FindBy(css = "[type = email]")
    })
    WebElement userNameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "Login")
    WebElement loginButton;

    public LoginPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    private final By ERROR_MESSAGE = By.id("error");

    @Step("Открытие страницы LoginPage")
    public void open() {
        driver.get(BASE_URL);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
    }

    @Step("Вход в магазин SauceDemo с именем пользователя: '{user}' и паролем: '{password}'")
    public void login(String user, String password) {
        userNameField.sendKeys(user);
        passwordField.sendKeys(password);
        loginButton.click();
        AllureUtils.takeScreenshot(driver);
    }

    @Step("Сообщение об ошибке")
    public String gerErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
