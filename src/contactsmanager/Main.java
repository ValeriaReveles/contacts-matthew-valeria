package contactsmanager;

import util.Input;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args)  {
        ContactList list = Gateway.readFromFile();
        displayMainMenu(list);
    }
    public static void displayMainMenu(ContactList list) {
        Input input = new Input();
        processUserInput(input.getInt(ANSI_YELLOW + """
                ------------------------------------
                 WELCOME TO THE CONTACTS MANAGER!
                 Please select an option!
                ------------------------------------
                Menu:   
                
                1. View contacts.
                2. Add a new contact.
                3. Search for contact by name.
                4. Delete an existing contact.
                5. Exit.
                
                ---------------------------------------
                """ + ANSI_RESET), list);
    }
    public static void promptAddContact(ContactList list) {
        Input input = new Input();
        String name = input.getString("Enter name of new contact: ");
        Long number = input.getLong("Enter phone number of new contact: ");
        Contact contact = new Contact(name, number);
        list.addContact(contact);
    }
    public static void promptSearchContact(ContactList list) {
        Input input = new Input();
        String query = input.getString("Enter name of contact.");
        list.displaySearchResults(query);
    }
    public static void promptDeleteContact(ContactList list) {
        Input input = new Input();
        String name = input.getString();
    }

    public static void processUserInput(int userInput, ContactList list) {
        if(userInput == 1) {
            list.printContacts();
        } else if(userInput == 2) {
            promptAddContact(list);
        } else if(userInput == 3) {
            promptSearchContact(list);
        } else if(userInput == 4) {
            promptDeleteContact(list);
        } else if(userInput == 5) {
            Gateway.writeToFile(list);
            System.exit(0);
        } else {
            System.out.println("That is not a valid option.");
            promptContinue(list);
        }
        promptContinue(list);
    }
    public static void promptContinue(ContactList list) {
        Input input = new Input();
        if(input.yesNo("\nWould you like to continue?\t")){
            displayMainMenu(list);
        } else {
            Gateway.writeToFile(list);
            System.exit(0);
        }

    }
}
