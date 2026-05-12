package addressbook.service;
import addressbook.model.Contact;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;

public class AddressBookService {

    List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {

        for (Contact existingContact : contactList) {

            if (existingContact.getFirstName()
                    .equalsIgnoreCase(contact.getFirstName())) {

                System.out.println("Duplicate Contact Found");

                return;
            }
        }

        contactList.add(contact);

        System.out.println("Contact Added Successfully");
    }

    public void displayContacts() {

        for (Contact contact : contactList) {

            System.out.println(contact);

            System.out.println("----------------");
        }
    }

    public void editContact(String firstName,
                            String newCity,
                            String newPhone) {

        boolean found = false;

        for (Contact contact : contactList) {

            if (contact.getFirstName()
                    .equalsIgnoreCase(firstName)) {

                contact.setCity(newCity);

                contact.setPhone(newPhone);

                System.out.println("Contact Updated Successfully");

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println("Contact Not Found");
        }

    }

    public void deleteContact(String firstName) {

        boolean removed = contactList.removeIf(contact ->
                contact.getFirstName()
                        .equalsIgnoreCase(firstName));

        if (removed) {

            System.out.println("Contact Deleted Successfully");
        }
        else {

            System.out.println("Contact Not Found");
        }
    }

    public void searchByCity(String city) {

        boolean found = false;

        for (Contact contact : contactList) {

            if (contact.getCity()
                    .equalsIgnoreCase(city)) {

                System.out.println(contact);

                System.out.println("----------------");

                found = true;
            }
        }

        if (!found) {

            System.out.println("No Contacts Found");
        }
    }

    public void viewPersonsByCity(String city) {

        boolean found = false;

        System.out.println("\nPersons in City: " + city);

        for (Contact contact : contactList) {

            if (contact.getCity()
                    .equalsIgnoreCase(city)) {

                System.out.println(
                        contact.getFirstName()
                );

                found = true;
            }
        }

        if (!found) {

            System.out.println("No Persons Found");
        }
    }

    public void countContactsByCity(String city) {

        int count = 0;

        for (Contact contact : contactList) {

            if (contact.getCity()
                    .equalsIgnoreCase(city)) {

                count++;
            }
        }

        System.out.println(
                "Number of Contacts in "
                        + city + " : " + count
        );
    }

    public void sortContacts() {

        contactList.sort((contact1, contact2) ->
                contact1.getFirstName()
                        .compareToIgnoreCase(
                                contact2.getFirstName()
                        ));

        System.out.println("Contacts Sorted Successfully");
    }

    public List<Contact> getContactList() {

        return contactList;
    }

    public void sortContactsByName() {

        List<Contact> sortedList = contactList.stream()
                .sorted((contact1, contact2) ->
                        contact1.getFirstName()
                                .compareToIgnoreCase(
                                        contact2.getFirstName()))
                .collect(Collectors.toList());

        System.out.println("\nSorted Contacts By Name\n");

        for (Contact contact : sortedList) {

            System.out.println(contact);

            System.out.println("----------------");
        }
    }

    public void sortContactsByCity() {

        List<Contact> sortedList = contactList.stream()
                .sorted((contact1, contact2) ->
                        contact1.getCity()
                                .compareToIgnoreCase(
                                        contact2.getCity()))
                .collect(Collectors.toList());

        System.out.println("\nSorted Contacts By City\n");

        for (Contact contact : sortedList) {

            System.out.println(contact);

            System.out.println("----------------");
        }
    }
}





