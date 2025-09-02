package tests;

import dto.Account;
import dto.AccountFactory;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test //(threadPoolSize = 3, invocationCount = 3)
    public void checkCreateAccount() throws InterruptedException {

        Account account = new Account("QA31", "+432123423424", "+342232352542", "Cold",
                "QA31.com", "Public", true, true, "Vostok",
                "Sedykh", "Minsk", "Minsk region", "Low", "Silver",
                "12344321", "4", "Test example one");

        Account account1 = AccountFactory.getAccount("Warm", "Other", "Public",
                true, true, "Low", "Gold");

        Account account2 = Account.builder()
                .name("Test")
                .phone("432123423424")
                .fax("1321231231")
                .rating("Cold")
                .website("QA31.com")
                .ownership("Public")
                .vipClient(true)
                .techMeSkills(true)
                .billingStreet("Vostok")
                .shippingStreet("Sedykh")
                .billingCity("Minsk")
                .billingState("Minsk region")
                .customerPriority("low")
                .sla("Silver")
                .serialNumber("1234541")
                .locationNumber("4")
                .description("Test example one")
                .build();

        loginStep.auth("tborodich@tms.sandbox", "Password003!");
        accountStep.createAccount(account1);
//        loginPage.open()
//                .open()
//                .login("tborodich@tms.sandbox", "Password003!");
//        accountListPage.open()
//                .clickNew()
//                .isPageOpened()
//                .createAccount(account1)
//                .saveAccount()
//                .isPageOpened()
//                .checkNotification();
    }
}
