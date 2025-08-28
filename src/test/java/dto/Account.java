package dto;

public class Account {

    String name;
    String phone;
    String fax;
    String rating;
    String website;
    String ownership;
    boolean vipClient;
    boolean techMeSkills;
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingState;
    String customerPriority;
    String sla;
    String serialNumber;
    String locationNumber;
    String description;

    public Account(String name, String phone, String fax, String rating, String website, String ownership,
                   boolean vipClient, boolean techMeSkills, String billingStreet, String shippingStreet,
                   String billingCity, String billingState, String customerPriority, String sla, String serialNumber,
                   String locationNumber, String description) {
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.rating = rating;
        this.website = website;
        this.ownership = ownership;
        this.vipClient = vipClient;
        this.techMeSkills = techMeSkills;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.customerPriority = customerPriority;
        this.sla = sla;
        this.serialNumber = serialNumber;
        this.locationNumber = locationNumber;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getRating() {
        return rating;
    }

    public String getWebsite() {
        return website;
    }

    public String getOwnership() {
        return ownership;
    }

    public boolean isVipClient() {
        return vipClient;
    }

    public boolean isTechMeSkills() {
        return techMeSkills;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getCustomerPriority() {
        return customerPriority;
    }

    public String getSla() {
        return sla;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getLocationNumber() {
        return locationNumber;
    }

    public String getDescription() {
        return description;
    }
}
