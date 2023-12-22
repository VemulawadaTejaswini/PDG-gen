import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        PrintWriter out = new PrintWriter(System.out);

        if (a == b + c || b == a + c || c == a + b) {
            out.println("Yes");
        } else {
            out.println("No");
        }

        out.flush();
        sc.close();
    }
}