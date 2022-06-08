package com.bridgelabz.address;

public class ContactsInAddressBook {
    private final String firstName,lastName,address,city,state,email;
    private final int zip;
    private final long phoneNumber;
    ContactsInAddressBook(String firstName,String lastName,String address,String city, String state, int zip,String email, Long phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String  toString() {
        return "\n First name : " + firstName +
                "\n Last name : " + lastName +
                "\n Address : " + address +
                "\n City : " + city +
                "\n State : " + state +
                "\n Zip code : " + zip +
                "\n Phone number : " + phoneNumber +
                "\n Email : " + email ;
    }
}
