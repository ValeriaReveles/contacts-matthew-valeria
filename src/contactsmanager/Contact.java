package contactsmanager;

public class Contact {
    private String name;
    private Long phoneNumber;

    public Contact(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name + " | " + phoneNumber;
    }
    public static Contact fromString(String contactString) {
        String[] parts = contactString.split(" | ");
        return new Contact(parts[0], Long.parseLong(parts[1]));
    }
}
