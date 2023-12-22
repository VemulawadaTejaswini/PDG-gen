
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String c[] = new String[3];
        c[0] = input.next();
        c[1] = input.next();
        c[2] = input.next();
        if (c[1].charAt(0) == 'B') {
            System.out.println("ABC");
            System.out.println("The contest in which you are participating now.");
        }
        if (c[1].charAt(0) == 'S') {
            System.out.println("ASC");
            System.out.println("This contest does not actually exist.");
        }
        if (c[1].charAt(0) == 'X') {
            System.out.println("AXC");
        }
    }
}
