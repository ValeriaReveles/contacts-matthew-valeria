package contactsmanager;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Gateway {


    public static void writeToFile(ContactList contactList) {
        //1. make a path object
        Path filePath = getFilePath();
        //If statement to see if file could not be saved:
        if (filePath == null) {
            System.out.println("Filepath could not be created. Cannot save.");
            return;
        }

        List<String> contactStrings = contactList.toStringList();

        writeItemStringsToFilePath(filePath, contactStrings);

    }

    private static void writeItemStringsToFilePath(Path filePath, List<String> contactStrings) {
        try {
            Files.write(filePath, contactStrings);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ContactList readFromFile() {
        ContactList list = new ContactList();

        Path filePath = getFilePath();
        if (filePath == null) {
            System.out.println("Filepath could not be created. Cannot load.");
            return list;
        }

        List<String> contactStrings = readItemStringsFromFilePath(filePath);

        for (String contactString : contactStrings) {
            Contact contactItem = Contact.fromString(contactString);
            list.addContact(contactItem);
        }
        return list;
    }

    private static List<String> readItemStringsFromFilePath(Path filePath) {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


        private static Path getFilePath() {
            try {
                Path folder = Paths.get("contact_list");
                Path file = Paths.get("contact_list", "contacts.txt");
                if (Files.exists(folder)) {
                    System.out.println("Folder already exists!");
                } else {
                    Files.createDirectories(folder);
                }
                if (Files.exists(file)) {
                    System.out.println("Hey the file already exists!");
                } else {
                    Files.createFile(file);
                }
                return file;
            } catch (IOException e) {
                // log an error message so at least we know something went wrong
                System.err.println(e.getMessage());
            }
            return null;
        }
    }


