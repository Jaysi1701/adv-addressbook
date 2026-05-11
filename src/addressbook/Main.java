package addressbook;

import addressbook.model.Contact;
import addressbook.service.AddressBookService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AddressBookService service =
                new AddressBookService();

        while (true) {

            System.out.println("\n===== ADDRESS BOOK =====");

            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter First Name: ");

                    String firstName = scanner.nextLine();

                    System.out.print("Enter Last Name: ");

                    String lastName = scanner.nextLine();

                    System.out.print("Enter City: ");

                    String city = scanner.nextLine();

                    System.out.print("Enter Phone: ");

                    String phone = scanner.nextLine();

                    Contact contact = new Contact(
                            firstName,
                            lastName,
                            city,
                            phone
                    );

                    service.addContact(contact);

                    break;

                case 2:

                    System.out.println("\nDisplaying Contacts\n");

                    service.displayContacts();

                    break;

                case 3:

                    System.out.println("Exiting Application...");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}