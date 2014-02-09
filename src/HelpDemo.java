import java.io.IOException;

/**
 * User: che
 * Date: 09.02.14
 * Time: 22:33
 */
public class HelpDemo {
    public static void main(String args[])
            throws IOException {
        char choice;
        Help hlpobj = new Help();

        for (;;) {
            do {
                hlpobj.showmenu();
                do {
                    choice = (char) System.in.read();
                } while (choice == '\n' | choice == '\r');
            } while ( !hlpobj.isvalid(choice));
            if (choice == 'q') break;
            System.out.println("\n");
            hlpobj.helpon(choice);
        }

    }
}
