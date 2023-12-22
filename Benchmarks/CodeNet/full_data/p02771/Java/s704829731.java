import java.awt.print.Printable;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());

        if((a == b && b != c) || (a == c && a != b) || (b == c && a != b) ) {
            out.print("Yes");
        } else {
            out.print("No");
        }

        out.flush();
    }
}
