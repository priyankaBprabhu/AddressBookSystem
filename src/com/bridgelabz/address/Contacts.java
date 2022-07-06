package com.bridgelabz.address;

public class Contacts {
    private  String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private long phoneNumber;

    public Contacts(String firstName, String lastName, String address, String city, String state, int zip, String email, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Contacts() {

    }

    public String toString() {
        return "\n First name : " + firstName +
                "\n Last name : " + lastName +
                "\n Address : " + address +
                "\n City : " + city +
                "\n State : " + state +
                "\n Zip code : " + zip +
                "\n Email : " + email +
                "\n Phone number : " + phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(long phoneNo) {
        this.phoneNumber = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}