package contactsmanager;

import java.io.IOException;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args)  {


//        System.out.println("------------------------------------");
//        System.out.println("| WELCOME TO THE CONTACTS MANAGER! |");
//        System.out.println("------------------------------------");
        System.out.println(ANSI_YELLOW + """
                ------------------------------------
                 WELCOME TO THE CONTACTS MANAGER!
                 Please select an option!
                ------------------------------------
                Menu:   
                
                1. View contacts.
                2. Add a new contact.
                3. Search a contact by name.
                4. Delete an existing contact.
                5. Exit.
                
                ---------------------------------------
                """ + ANSI_RESET  );
    }


}
