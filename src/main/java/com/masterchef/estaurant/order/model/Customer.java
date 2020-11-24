package com.masterchef.estaurant.order.model;

public class Customer {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String contactumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactumber() {
        return contactumber;
    }

    public void setContactumber(String contactumber) {
        this.contactumber = contactumber;
    }
}
