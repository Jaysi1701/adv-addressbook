package addressbook.model;

public class Contact {

    private String firstName;
    private String lastName;
    private String city;
    private String phone;
    private String state;
    private String zip;

    public Contact(String firstName,
                   String lastName,
                   String city,
                   String state,
                   String zip,
                   String phone) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getCity() {

        return city;
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

    public String getState() {

        return state;
    }

    public String getZip() {

        return zip;
    }
}
