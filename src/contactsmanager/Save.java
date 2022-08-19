package contactsmanager;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static contactsmanager.Gateway.getFilePath;
import static contactsmanager.Gateway.writeContactStringsToFilePath;

public class Save {
    public static void saveToFile(ContactList contactList) {
//        ContactList contact = new ContactList();
        Path filePath = getFilePath();
        if (filePath == null) {
            System.out.println("Could not save changes, please try again.");
            return;
        }

        List<String> contactStrings = contactList.toStringList();

        writeContactStringsToFilePath(filePath, contactStrings);

        System.out.println("Changes saved. Have a great day!");

    }
}
