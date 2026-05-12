package addressbook;

import addressbook.model.Contact;
import addressbook.service.AddressBookService;
import addressbook.util.FileService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AddressBookService service =
                new AddressBookService();

        FileService fileService =
                new FileService();


        while (true) {

            System.out.println("\n===== ADDRESS BOOK =====");

            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Search By City");
            System.out.println("6. View Persons By City");
            System.out.println("7. Count Contacts By City");
            System.out.println("8. Sort Contacts");
            System.out.println("9. Save Contacts To File");
            System.out.println("10. Sort Contacts By Name");
            System.out.println("11. Sort Contacts By City");
            System.out.println("12. Read Contacts From File");
            System.out.println("13. Exit");

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

                    System.out.print("Enter State: ");

                    String state = scanner.nextLine();

                    System.out.print("Enter Zip: ");

                    String zip = scanner.nextLine();

                    Contact contact = new Contact(
                            firstName,
                            lastName,
                            city,
                            state,
                            zip,
                            phone
                    );

                    service.addContact(contact);

                    break;

                case 2:

                    System.out.println("\nDisplaying Contacts\n");

                    service.displayContacts();

                    break;

                case 3:

                    System.out.print("Enter First Name to Edit: ");

                    String editName = scanner.nextLine();

                    System.out.print("Enter New City: ");

                    String newCity = scanner.nextLine();

                    System.out.print("Enter New Phone: ");

                    String newPhone = scanner.nextLine();

                    service.editContact(
                            editName,
                            newCity,
                            newPhone
                    );

                    break;

                case 4:

                    System.out.print("Enter First Name to Delete: ");

                    String deleteName = scanner.nextLine();

                    service.deleteContact(deleteName);

                    break;

                case 5:

                    System.out.print("Enter City Name: ");

                    String searchCity = scanner.nextLine();

                    service.searchByCity(searchCity);

                    break;

                case 6:

                    System.out.print("Enter City Name: ");

                    String cityName = scanner.nextLine();

                    service.viewPersonsByCity(cityName);

                    break;

                case 7:

                    System.out.print("Enter City Name: ");

                    String countCity = scanner.nextLine();

                    service.countContactsByCity(countCity);

                    break;

                case 8:

                    service.sortContacts();

                    break;

                case 9:

                    fileService.writeContactsToFile(
                            service.getContactList()
                    );

                    break;

                case 10:

                    service.sortContactsByName();

                    break;

                case 11:

                    service.sortContactsByCity();

                    break;

                case 12:

                    fileService.readContactsFromFile();

                    break;

                case 13:

                    System.out.println("Exiting Application...");

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}