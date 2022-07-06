package com.bridgelabz.address;

import java.util.*;

public class AddressBook {
    public List<Contacts> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void operation() {
        System.out.println("Enter Number of contact you want to add");
        int count = scan.nextInt();
        int contactCount = 1;
        while (contactCount <= count) {

            this.add();
            contactCount++;
        }
        boolean status = true;
        do {
            System.out.println("Enter the number according to to requirement");
            System.out.println("Enter 1 to Add");
            System.out.println("Enter 2 to Edit");
            System.out.println("Enter 3 to Delete");
            System.out.println("Enter 4 to multiple person city");
            switch (scan.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    searchContact();
                    break;
                default:
                    status = false;
            }
        } while (status);
    }

    public void add() {
        Contacts contacts = new Contacts();
        System.out.println("Enter the First name:");
        String firstName = scan.next();
        boolean isPresent = list.stream().anyMatch(n->n.getFirstName().equalsIgnoreCase(firstName));
        if (isPresent) {
            System.out.println("Contact already added");
        } else {
            contacts.setFirstName(firstName);
            System.out.println("Enter the Last name:");
            String lastName = scan.next();
            contacts.setLastName(lastName);

            System.out.println("Enter the address:");
            String address = scan.next();
            contacts.setAddress(address);

            System.out.println("Enter the City:");
            String city = scan.next();
            contacts.setCity(city);

            System.out.println("Enter the State:");
            String state = scan.next();
            contacts.setState(state);

            System.out.println("Enter the Pin Code:");
            int zip = scan.nextInt();
            contacts.setZip(zip);

            System.out.println("Enter the Phone Number:");
            long phoneNumber = scan.nextLong();
            contacts.setPhoneNumber(phoneNumber);

            System.out.println("Enter the Email");
            String email = scan.next();
            contacts.setEmail(email);
            list.add(contacts);
            print();
        }

    }

    public void edit() {
        System.out.println("Enter your First name:");
        String firstName = scan.next();

        Iterator<Contacts> iterator = this.list.listIterator();

        while (iterator.hasNext()) {
            Contacts contacts = iterator.next();

            if (firstName.equals(contacts.getFirstName())) {
                System.out.println("Choose field you want to add:");
                System.out.println("1.Last Name\t2.Address\t3.City\t4.State\t5. Zip\t6.Phone Number\t7.Email");
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your Last Name");
                        contacts.setLastName(scan.next());
                        break;
                    case 2:
                        System.out.println("Re-Correct your Address");
                        contacts.setAddress(scan.next());
                        break;
                    case 3:
                        System.out.println("Re-Correct your City");
                        contacts.setCity(scan.next());
                        break;
                    case 4:
                        System.out.println("Re-Correct your State");
                        contacts.setState(scan.next());
                        break;
                    case 5:
                        System.out.println("Re-Correct your Zip");
                        contacts.setZip(scan.nextInt());
                        break;
                    case 6:
                        System.out.println("Re-Correct your Phone Number");
                        contacts.setPhoneNumber(scan.nextLong());
                    case 7:
                        System.out.println("Re-Correct your Email");
                        contacts.setEmail(scan.next());
                }

            }
        }
    }

    public void delete() {
        System.out.println("Enter your First name:");
        String firstName = scan.next();

        Iterator<Contacts> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Contacts contacts = iterator.next();

            if (firstName.equals(contacts.getFirstName())) {
                this.list.remove(contacts);
            }
        }
    }

    public void print() {
        Iterator<Contacts> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void searchContact() {
        System.out.println("Enter the city:");
        String city = scan.next();
        list.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
    }
    @Override
    public String toString() {
        return "AddressBook{" +
                "list=" + list +
                '}';
    }
}
