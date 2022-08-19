package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public String getString() {
        System.out.print("Type something: ");
        return ("You typed: " + scanner.nextLine());
    }
    public String getString(String prompt) {
        System.out.print(prompt);
        return (scanner.nextLine());
    }
    public String getString(String prompt, String var) {
        System.out.format(prompt, var);
        return (scanner.nextLine());
    }
    public boolean yesNo(String prompt) {
        String userInput = getString(prompt);
        return Objects.equals(userInput, "true") ||
                Objects.equals(userInput, "yes") ||
                Objects.equals(userInput, "y") ||
                Objects.equals(userInput, "Y");
    }
    public int getInt(String prompt) {
        String userInput = getString(prompt);
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println(userInput + " isn't an int.");
        }
        return getInt(prompt);
    }
    public int getInt() {
        String userInput = getString();
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println(userInput + " isn't an int.");
        }
        return getInt();
    }
    public Long getLong(String prompt) {
        String userInput = getString(prompt);
        try {
            return Long.parseLong(userInput);
        } catch (NumberFormatException e) {
            System.out.println(userInput + " isn't a valid phone number.");
        }
        return getLong(prompt);
    }
    public Long getLong() {
        String userInput = getString();
        try {
            return Long.parseLong(userInput);
        } catch (NumberFormatException e) {
            System.out.println(userInput + " isn't a valid phone number.");
        }
        return getLong();
    }
}