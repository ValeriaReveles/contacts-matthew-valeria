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

    public static void darkDaddy(){
        System.out.println(
                """
                                               .-.
                                              |_:_|
                                             /(_Y_)\\
                        .                   ( \\/M\\/ )
                         '.               _.'-/'-'\\-'._
                           ':           _/.--'[[[[]'--.\\_
                             ':        /_'  : |::"| :  '.\\
                               ':     //   ./ |oUU| \\.'  :\\
                                 ':  _:'..' \\_|___|_/ :   :|
                                   ':.  .'  |_[___]_|  :.':\\
                                    [::\\ |  :  | |  :   ; : \\
                                     '-'   \\/'.| |.' \\  .;.' |
                                     |\\_    \\  '-'   :       |
                                     |  \\    \\ .:    :   |   |
                                     |   \\    | '.   :    \\  |
                                     /       \\   :. .;       |
                                    /     |   |  :__/     :  \\\\
                                   |  |   |    \\:   | \\   |   ||
                                  /    \\  : :  |:   /  |__|   /|
                                  |     : : :_/_|  /'._\\  '--|_\\
                                  /___.-/_|-'   \\  \\
                                                 '-'
                        """
        );
    }

    public static void darkDaddy2() {
        System.out.println("""
                                                                                                                   \s
                                                        '.                ..                                       \s
                                                      'do.     ....'.     .:;.                                     \s
                                                     'OO:.     .:ll:.     'lxl.                                    \s
                                                    .dN0o'.    .dXXx.    'oO0k;                                    \s
                                                    ,0NXOc'....:OWWO;...'lOXX0l.                                   \s
                                                    :XNO:.     .;cc;.. . .'ck0d.                                   \s
                                                   .d0c.        ....        .;xl.                                  \s
                                                   ;x,          ....          .o;                                  \s
                                                  .o;     .;oo;.'::'.,ll;.     'l.                                 \s
                                                 .c:       .ox,.'cc'.'do.       ,c.                                \s
                                                 ;c.        ...       ..         :;                                \s
                                                'l.         .........            .c,                               \s
                                               .c'        ''..........  ..        .c.                              \s
                                               ,'         ..            .          .'.                             \s
                                              ..                                     .                             \s
                                                                                                                   \s
                                                                                                                   \s
                                             .',;,..     .,.      .     .'.       .';'.                            \s
                                         .,:odddo:.     .                         .:oxxo:'                         \s
                                        .',;;;:c.      ..'.    ......    .'..      .clcc:,.                        \s
                                 .... .,::cdxkOOo.     ...:,.  ';,;:,..';:. .     'd00Okxlcl:'....                 \s
                             ...''..',:::;,:c::::;. ...':clocclooddxdooc'...'....,dOkkxxo:lkkxoc,..                \s
                        .......  .','........,:,.......''',;ldxkkxxxxx:  .,::coodxkkxoll:'ckkxxkdc.                \s
                   .......      .'.  ......,coocc:;:;'..,',:lloxkkOO0d.   ...';:;;,:odl,':oolcclc;;,.              \s
                 ....         ...     .. .'';::c:'...  ..',;:::loddoc.      ..',;;'',coc:lodo:,'......             \s
                             ..         ..    ......     .......'...      .,,,,,,'...;okdcclc:;'.....  ..          \s
                             .          .      .         ..               ..'..''....;,;:,,;;'.....     ..         \s
                                
                """);
    }
}