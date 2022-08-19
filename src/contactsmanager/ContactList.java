package contactsmanager;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contactList;

    public ContactList() {
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    //    public void removeContact(String name) {
//    }
    public ArrayList<Contact> queryContactsByPartial(String query) {
        ArrayList<Contact> result = new ArrayList<>();
        for(int i = 0; i < contactList.size(); i++) {
            String name = contactList.get(i).getName();
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
        System.out.println(queryContactsByPartial(query));
        // TODO: 8/19/22 add prompt to return to main menu
    }
}