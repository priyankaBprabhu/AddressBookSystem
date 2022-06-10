package com.bridgelabz.address;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        EditAddressBook addressBook = new EditAddressBook();
        addressBook.readData();
        System.out.println(addressBook.addressBookDetail);
        addressBook.editData();
        System.out.println(addressBook.addressBookDetail);
    }
}
