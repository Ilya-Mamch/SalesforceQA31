package pages;

import org.openqa.selenium.WebDriver;
import wrappers.CheckBox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void createAccount(String name, String phone, String fax, String rating, String website, String ownership,
                              boolean vipClient, boolean techMeSkills, String billingStreet, String shippingStreet,
                              String billingCity, String billingState, String customerPriority, String sla,
                              String serialNumber, String locationNumber, String description) {
        new Input(driver, "Account Name").write(name);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Website").write(website);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Rating").select(rating);
        new CheckBox(driver, "VIP Client").pick(vipClient);
        new CheckBox(driver, "TeachMeSkills").pick(techMeSkills);
        new TextArea(driver, "Billing Street").write(billingStreet);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State/Province").write(billingState);
        new Picklist(driver, "Customer Priority").select(customerPriority);
        new Picklist(driver, "SLA").select(sla);
        new Input(driver, "SLA Serial Number").write(serialNumber);
        new Input(driver, "Number of Locations").write(locationNumber);
        new TextArea(driver, "Description").write(description);
    }
}
