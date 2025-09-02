package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class CheckBox {

    WebDriver driver;
    String label;

    public CheckBox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void pick(boolean value) {
        log.info("Click to {}", label);
        WebElement checkbox = driver.findElement(By.xpath(String.format("//*[text()='%s']//ancestor::lightning-input" +
                "//input[@type='checkbox']", label)));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", checkbox);
        if (checkbox.isSelected() != value) {
            checkbox.click();
        }
    }
}
