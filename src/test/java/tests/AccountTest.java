package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest{

    @Test
    public void checkCreateAccount() throws InterruptedException {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("tborodich@tms.sandbox");
        driver.findElement(By.id("password")).sendKeys("Password003!");
        driver.findElement(By.id("Login")).click();
        Thread.sleep(2000);
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
        newAccountModal.createAccount("QA31", "+432123423424", "+342232352542", "Cold",
                "QA31.com", "Public", true, true, "Vostok",
                "Sedykh", "Minsk", "Minsk region", "Low", "Silver",
                "12344321", "4", "Test example one");
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
    }
}
