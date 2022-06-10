package com.bridgelabz.address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    AddressBook() {

    }
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private long phoneNumber;
    ArrayList<AddressBook> addressBookDetail = new ArrayList<>();

    public void readData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        firstName = scan.next();
        System.out.println("Enter the last name : ");
        lastName = scan.next();
        System.out.println("Enter the address : ");
        address = scan.next();
        System.out.println("Enter the city : ");
        city = scan.next();
        System.out.println("Enter the state : ");
        state = scan.next();
        System.out.println("Enter the zip code : ");
        zip = scan.nextInt();
        System.out.println("Enter the phone number : ");
        phoneNumber = scan.nextLong();
        System.out.println("Enter the email : ");
        email = scan.next();
        AddressBook contact = new AddressBook(firstName, lastName, address, city, state, zip, email, phoneNumber);
        addressBookDetail.add(contact);

    }

    public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, String email, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
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


}