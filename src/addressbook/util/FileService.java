package addressbook.util;

import addressbook.model.Contact;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileService {

    public void writeContactsToFile(
            List<Contact> contactList) {

        try {

            FileWriter writer =
                    new FileWriter("contacts.txt");

            for (Contact contact : contactList) {

                writer.write(contact.toString());

                writer.write("\n----------------\n");
            }

            writer.close();

            System.out.println(
                    "Contacts Saved To File Successfully"
            );

        } catch (IOException e) {

            System.out.println(
                    "Error Writing To File"
            );
        }
    }
}