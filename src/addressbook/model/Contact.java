package addressbook.model;

public class Contact {

    private String firstName;
    private String lastName;
    private String city;
    private String phone;

    public Contact(String firstName,
                   String lastName,
                   String city,
                   String phone) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {

        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nCity: " + city +
                "\nPhone: " + phone;
    }
}