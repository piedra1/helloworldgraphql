package com.hellographql.demo.entity;

public class CustomerInput {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Customer getCustomerEntity() {
        Customer customer = new Customer();
        customer.setAddress(this.getAddress());
        customer.setCity(this.getCity());
        customer.setEmail(this.getEmail());
        customer.setFirstName(this.getFirstName());
        customer.setLastName(this.getLastName());
        customer.setPhoneNumber(this.getPhoneNumber());
        customer.setZipCode(this.getZipCode());
        return customer;
    }
}
