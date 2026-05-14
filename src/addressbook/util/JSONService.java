package addressbook.util;

import addressbook.model.Contact;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;

import java.lang.reflect.Type;

import java.util.List;

public class JSONService {

    // WRITE JSON
    public void writeContactsToJSON(
            List<Contact> contactList) {

        try {

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            FileWriter writer =
                    new FileWriter("contacts.json");

            gson.toJson(contactList, writer);

            writer.close();

            System.out.println(
                    "Contacts Written To JSON Successfully"
            );

        } catch (Exception e) {

            System.out.println(
                    "Error Writing JSON File"
            );
        }
    }

    // READ JSON
    public void readContactsFromJSON() {

        try {

            Gson gson = new Gson();

            FileReader reader =
                    new FileReader("contacts.json");

            Type contactType =
                    new TypeToken<List<Contact>>() {
                    }.getType();

            List<Contact> contacts =
                    gson.fromJson(reader, contactType);

            System.out.println(
                    "\n===== CONTACTS FROM JSON =====\n"
            );

            for (Contact contact : contacts) {

                System.out.println(contact);

                System.out.println("----------------");
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    "Error Reading JSON File"
            );
        }
    }
}