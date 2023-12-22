import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int S = (a + b) * h / 2;

        PrintWriter out = new PrintWriter(System.out);
        out.println(S);
        out.flush();
        sc.close();
    }
}