package com.bridgelabz.address;

import java.util.*;
import java.util.Scanner;

public class AddressBook implements InterfaceAddress {
    Scanner scan = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private long phoneNumber;
    List<AddressBook> addressBookDetail = new ArrayList<>();
//    {{
//        add(new AddressBook("Julin Bestina", "A", "Kozhippara", "Palakkad", "Kerala", 678557, "julin.bestina@yahoo.com", 8086904736L));
//        add(new AddressBook("Monisha", "A", "ADYAR", "Chennai", "TamilNadu", 600018, "monisha56@gmail.com", 9485623185L));
//        add(new AddressBook("Sham", "P", "Alathur", "Thrissur", "Kerala", 680741, "sham.158@gmail.com", 9847561235L));
//    }};

    public AddressBook() {

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

    public void readData() {
        System.out.println("Enter how many contacts you want to add");
        int numOfContacts = scan.nextInt();
        while (numOfContacts > 0) {
            System.out.println("Enter Your First Name: ");
            String firstName = scan.next();
            boolean isPresent = addressBookDetail.stream().anyMatch(n -> n.getFirstName().equalsIgnoreCase(firstName));
            if (!isPresent) {
                numOfContacts--;
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
                addressBookDetail.add(new AddressBook(firstName, lastName, address, city, state, zip, email, phoneNumber));
                System.out.println("\nContact added to Address Book");

            } else {
                System.out.println("This address contact is already present");
            }

        }
    }

    public void editData() {
        int i, choice;
        System.out.println("\nEnter first name to edit :- ");
        String name = scan.next();
        for (i = 0; i < addressBookDetail.size(); i++) {
            if (addressBookDetail.get(i).getFirstName().equals(name)) {
                do {
                    System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                    int ch = scan.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.print("Enter new first name :- ");
                            addressBookDetail.get(i).setFirstName(scan.next());
                            System.out.println("First name is updated.");
                        }
                        case 2 -> {
                            System.out.print("Enter new last name :- ");
                            addressBookDetail.get(i).setLastName(scan.next());
                            System.out.println("Last name is updated.");
                        }
                        case 3 -> {
                            System.out.print("Enter new address :- ");
                            addressBookDetail.get(i).setAddress(scan.next());
                            System.out.println("Address is updated.");
                        }
                        case 4 -> {
                            System.out.print("Enter new city :- ");
                            addressBookDetail.get(i).setCity(scan.next());
                            System.out.println("City is updated.");
                        }
                        case 5 -> {
                            System.out.print("Enter new state :- ");
                            addressBookDetail.get(i).setState(scan.next());
                            System.out.println("State is updated.");
                        }
                        case 6 -> {
                            System.out.print("Enter new zip code :- ");
                            addressBookDetail.get(i).setZip(scan.nextInt());
                            System.out.println("Zip code is updated.");
                        }
                        case 7 -> {
                            System.out.print("Enter new phone number :- ");
                            addressBookDetail.get(i).setPhoneNo(scan.nextLong());
                            System.out.println("Phone number is updated.");
                        }
                        case 8 -> {
                            System.out.print("Enter new email :- ");
                            addressBookDetail.get(i).setEmail(scan.next());
                            System.out.println("Email is updated.");
                        }
                    }
                    System.out.println("Enter 1 if you want to continue");
                    choice = scan.nextInt();
                } while (choice == 1);
            } else
                System.out.println("Please enter the correct first name");
        }

    }

    public void deleteData() {
        int i;
        System.out.println("\nEnter first name to delete : ");
        String name = scan.next();
        System.out.println(addressBookDetail);
        for (i = 0; i <= addressBookDetail.size(); i++) {

            if (addressBookDetail.get(i).getFirstName().equals(name)) {
                addressBookDetail.remove(addressBookDetail.get(i));
                System.out.println("deleted");
            } else
                System.out.println("not deleted");
        }
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

    public void setPhoneNo(long phoneNo) {
        this.phoneNumber = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}