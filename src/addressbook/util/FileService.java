package addressbook.util;

import java.io.BufferedReader;
import java.io.FileReader;

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

    public void readContactsFromFile() {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("contacts.txt")
                    );

            String line;

            System.out.println(
                    "\n===== CONTACTS FROM FILE =====\n"
            );

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(
                    "Error Reading File"
            );
        }
    }
}