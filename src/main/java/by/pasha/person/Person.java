package by.pasha.person;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getAbbreviation() {
        return firstName.substring(0, 1).toUpperCase() + ". " + lastName.substring(0, 1).toUpperCase() + ".";
    }
}
