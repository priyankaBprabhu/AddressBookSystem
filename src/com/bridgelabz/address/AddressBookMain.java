package com.bridgelabz.address;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char userChoice;

        System.out.println("Welcome to Address Book Program");
        InterfaceAddress addressBook = new AddressBook();
        do {
            System.out.println("Select your Option: \n1.Add new Contact \n2.Edit Contact \n3.Delete Contact");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    addressBook.readData();
                    System.out.println("Person Details Added Successfully");
                }
                case 2 -> {
                    addressBook.editData();
                    System.out.println("Person Details Edited Successfully");
                }
                case 3 -> {
                    addressBook.deleteData();
                    System.out.println("Person Details Deleted Successfully");
                }

            }

            System.out.println("Are you wish to continue:  Y?N");
            userChoice = sc.next().toUpperCase().charAt(0);
        } while (userChoice != 'N');


    }
}
