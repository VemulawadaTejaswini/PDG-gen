import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        if (string.equals("SAT")) {
            System.out.println("1");
        }
        if (string.equals("SUN")) {
            System.out.println("7");
        }
        if (string.equals("MON")) {
            System.out.println("6");
        }
        if (string.equals("TUE")) {
            System.out.println("5");
        }
        if (string.equals("WED")) {
            System.out.println("4");
        }
        if (string.equals("THU")) {
            System.out.println("3");
        }
        if (string.equals("FRI")) {
            System.out.println("2");
        }
    }

}
/*


 */