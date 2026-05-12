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

    public void setCity(String city) {

        this.city = city;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    @Override
    public String toString() {

        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nCity: " + city +
                "\nPhone: " + phone;
    }
}