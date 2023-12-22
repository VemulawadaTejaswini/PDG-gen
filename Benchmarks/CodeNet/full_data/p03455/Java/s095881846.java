import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String result;

        if (a * b % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);

        sc.close();
        out.flush();
    }
}