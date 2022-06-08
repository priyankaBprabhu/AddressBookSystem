package com.bridgelabz.address;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ContactsInAddressBook addressBook = new ContactsInAddressBook("Priya","BP", "Dvg","Davanagere","karnataka",577002,"abc@gmail.com",98754255684L);
        System.out.println(addressBook);
    }
}
