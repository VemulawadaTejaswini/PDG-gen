import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String a = in.next();
            String b = in.next();
            System.out.println(a.equals(b) ? "H" : "D");
        }
    }
}
