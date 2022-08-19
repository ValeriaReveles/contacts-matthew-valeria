package contactsmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContactList {
    private ArrayList<Contact> contactList;

    public ContactList() {
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContact(String name) {
        int index = getIndexByName(name);
        if(index > -1) {
            contactList.remove(index);
            System.out.println("Contact removed.");
        } else {
            System.out.println("That contact doesn't exist.");
        }
    }
    public ArrayList<Contact> queryContactsByPartial(String query) {
        ArrayList<Contact> result = new ArrayList<>();
        for(int i = 0; i < contactList.size(); i++) {
            String name = contactList.get(i).getName().toLowerCase(Locale.ROOT);
            if (name.contains(query)) {
                result.add(contactList.get(i));
            }
        }
        return result;
    }
    public void printContacts() {
        System.out.println("Contacts:");
        for(Contact contact : contactList) {
            System.out.println("\t" + contact);
        }
    }

    public void printContacts(ArrayList<Contact> results) {
        System.out.println("Search Results:");
        for(Contact contact : results) {
            System.out.println("\t" + contact);
        }
    }

    int getIndexByName(String query) {
        int index = -1;
        for (int i = 0; i < contactList.size(); i++) {
            String name = contactList.get(i).getName();
            if (name.equals(query)) {
                return i;
            }
        }
        return index;
    }
    public void displaySearchResults (String query){
        printContacts(queryContactsByPartial(query));

    }

    public List<String> toStringList() {
        List<String> contactStrings = new ArrayList<>();
        for(Contact contact : contactList) {
            contactStrings.add(contact.toString());
        }
        return contactStrings;
    }
}