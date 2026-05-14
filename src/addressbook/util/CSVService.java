package addressbook.util;

import addressbook.model.Contact;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVService {

    // WRITE CSV
    public void writeContactsToCSV(
            List<Contact> contactList) {

        try {

            CSVWriter writer =
                    new CSVWriter(
                            new FileWriter("contacts.csv")
                    );

            String[] header = {
                    "FirstName",
                    "LastName",
                    "City",
                    "State",
                    "Zip",
                    "Phone"
            };

            writer.writeNext(header);

            for (Contact contact : contactList) {

                String[] data = {
                        contact.getFirstName(),
                        contact.getLastName(),
                        contact.getCity(),
                        contact.getState(),
                        contact.getZip(),
                        contact.getPhone()
                };

                writer.writeNext(data);
            }

            writer.close();

            System.out.println(
                    "Contacts Written To CSV Successfully"
            );

        } catch (IOException e) {

            System.out.println(
                    "Error Writing CSV File"
            );
        }
    }

    // READ CSV
    public void readContactsFromCSV() {

        try {

            CSVReader reader =
                    new CSVReader(
                            new FileReader("contacts.csv")
                    );

            String[] nextLine;

            System.out.println(
                    "\n===== CONTACTS FROM CSV =====\n"
            );

            while ((nextLine = reader.readNext()) != null) {

                for (String value : nextLine) {

                    System.out.print(value + " ");
                }

                System.out.println();
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    "Error Reading CSV File"
            );
        }
    }
}