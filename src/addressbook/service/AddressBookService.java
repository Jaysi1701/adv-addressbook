package addressbook.service;
import addressbook.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class AddressBookService {

    List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {

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
}

