package com.bridgelabz.address;

import java.util.Scanner;

public class EditAddressBook extends AddressBook {
    static Scanner scan = new Scanner(System.in);

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
                        case 1:
                            System.out.print("Enter new first name :- ");
                            addressBookDetail.get(i).setFirstName(scan.next());
                            System.out.println("First name is updated.");
                            break;
                        case 2:
                            System.out.print("Enter new last name :- ");
                            addressBookDetail.get(i).setLastName(scan.next());
                            System.out.println("Last name is updated.");
                            break;
                        case 3:
                            System.out.print("Enter new address :- ");
                            addressBookDetail.get(i).setAddress(scan.next());
                            System.out.println("Address is updated.");
                            break;
                        case 4:
                            System.out.print("Enter new city :- ");
                            addressBookDetail.get(i).setCity(scan.next());
                            System.out.println("City is updated.");
                            break;
                        case 5:
                            System.out.print("Enter new state :- ");
                            addressBookDetail.get(i).setState(scan.next());
                            System.out.println("State is updated.");
                            break;
                        case 6:
                            System.out.print("Enter new zip code :- ");
                            addressBookDetail.get(i).setZip(scan.nextInt());
                            System.out.println("Zip code is updated.");
                            break;
                        case 7:
                            System.out.print("Enter new phone number :- ");
                            addressBookDetail.get(i).setPhoneNo(scan.nextLong());
                            System.out.println("Phone number is updated.");
                            break;
                        case 8:
                            System.out.print("Enter new email :- ");
                            addressBookDetail.get(i).setEmail(scan.next());
                            System.out.println("Email is updated.");
                            break;
                    }
                    System.out.println("Enter 1 if you want to continue");
                    choice = scan.nextInt();
                } while (choice == 1);
            } else
                System.out.println("Please enter the correct first name");
        }

    }

}

