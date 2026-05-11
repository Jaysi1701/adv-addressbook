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
}