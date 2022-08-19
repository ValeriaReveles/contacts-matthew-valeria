package contactsmanager;

import java.nio.file.Path;
import java.util.ArrayList;

public class Gateway {

    public static void writeToFile(ContactList contactList){
        //1. make a path object
        Path filePath = getFilePath();
        //If statement to see if file could not be saved:
        if (filePath == null){
            System.out.println("Filepath could not be created. Cannot save.");
            return;
        }
    }
    //2. make a temp list of strings that are contact items and write those to file
    ArrayList<Contact> contactList = readItemStringFromFilePath(filePath);

    //3. make items from the items strings and put them in the groceryList
    for(String itemString : itemString)

    {
        ContactItem item = ContactItem.createFromString(itemString);
        list.addGroceryItem(item);
    }
     return list;
    }





}
